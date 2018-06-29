package com.ahan.eight.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahan.eight.DetailMovie;
import com.ahan.eight.R;
import com.ahan.loader.GlideImageLoader;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.youth.banner.Banner;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class MovieDetailActivity extends AppCompatActivity {

    ImageView im_movie_detail;
    TextView tv_movie_title;
    TextView tv_movie_length;
    TextView tv_movie_introduce;
    TextView tv_movie_detail;
    TextView tv_back;
    DetailMovie movieDetail;
    int movieId = 0;
    int locationId = 0;
    List<String> images = new ArrayList<>();
    private Banner banner;
    RecyclerView evenList;
    BaseQuickAdapter<DetailMovie.DataBean.BasicBean.ActorsBean, BaseViewHolder> mAdapter;
    List<DetailMovie.DataBean.BasicBean.ActorsBean> mdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        tv_movie_detail = findViewById(R.id.tv_movie_detail);
        tv_back = findViewById(R.id.tv_back);
        tv_movie_introduce = findViewById(R.id.tv_movie_introduce);
        tv_movie_length = findViewById(R.id.tv_movie_length);
        tv_movie_title = findViewById(R.id.tv_movie_title);
        im_movie_detail = findViewById(R.id.im_movie_detail);
        banner = (Banner) findViewById(R.id.banner);
        evenList=findViewById(R.id.rec_actors);
        movieId = getIntent().getIntExtra("movieID", 0);
        locationId = getIntent().getIntExtra("locationId", 0);
        if (movieId != 0) {
            getMovieDetail(movieId, locationId);
        }
        /**
         * 演员列表
         */
        mdata = new ArrayList<>();
      LinearLayoutManager manager = new LinearLayoutManager(this);
      manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        evenList.setLayoutManager(manager);
        evenList.addItemDecoration(new DividerItemDecoration(this, RecyclerView.HORIZONTAL));
        mAdapter = new BaseQuickAdapter<DetailMovie.DataBean.BasicBean.ActorsBean, BaseViewHolder>(R.layout.item_performer, mdata) {
            @Override
            protected void convert(BaseViewHolder helper, DetailMovie.DataBean.BasicBean.ActorsBean item) {
                helper.setText(R.id.tv_performer, item.getNameEn());
                Glide.with(mContext).load(item.getImg()).crossFade().into((ImageView) helper.getView(R.id.im_performer));

            }
        };
        evenList.setAdapter(mAdapter);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    /**
     * 得到影片详情
     */
    private void getMovieDetail(int movieId, int locationId) {
        String url = "https://ticket-api-m.mtime.cn/movie/detail.api?locationId=" + locationId
                + "&movieId=" + movieId;
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                        Log.d("MovieDetailActivity", request.toString());
                    }

                    @Override
                    public void onResponse(String response) {
                        Log.d("MovieDetailActivity", response);

                        Gson gson = new Gson();
                        DetailMovie mMovieDetail = gson.fromJson(response, DetailMovie.class);
                        movieDetail = mMovieDetail;
                        changeUI(movieDetail);
                    }
                });
        Log.d("MovieDetailActivity", url);
    }

    /**
     * 显示具体
     *
     * @param movieDetail
     */
    private void changeUI(DetailMovie movieDetail) {
        tv_movie_title.setText(movieDetail.getData().getBasic().getName());
        tv_movie_detail.setText(movieDetail.getData().getBasic().getStory());
        tv_movie_introduce.setText(movieDetail.getData().getBasic().getType().toString());
        tv_movie_length.setText(movieDetail.getData().getBasic().getMins());
        Glide.with(this).load(movieDetail.getData().getBasic().getImg()).into(im_movie_detail);
//        init(movieDetail);

        mdata.addAll(movieDetail.getData().getBasic().getActors());
        mAdapter.notifyDataSetChanged();

        /**
         * 剧照
         */
        for (DetailMovie.DataBean.BasicBean.StageImgBean.ListBean bean : movieDetail.getData().getBasic().getStageImg().getList()) {
            images.add(bean.getImgUrl());
        }
        banner.setImages(images).setImageLoader(new GlideImageLoader()).start();

    }


    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
        banner.stopAutoPlay();
    }

}
