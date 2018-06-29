package com.ahan.eight.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.ahan.adapter.MyAdapter;
import com.ahan.bean.FilmInfoLocationBean;
import com.ahan.eight.CityMange;
import com.ahan.eight.Movies;
import com.ahan.eight.R;
import com.ahan.utils.SharePreUtils;
import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.zaaach.citypicker.CityPickerActivity;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahan on 2018/6/28
 * E-mail Address: ahanwhite@163.com
 */
public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_PICK_CITY = 0;
    /**
     * 城市列表
     */
    List<FilmInfoLocationBean.PBean> msBeanList;
    List<Movies.MoviesBean> movieList;
    ListView listView;
    TextView tv_location;
    private String city;
    MyAdapter myAdapter;
    /**
     * 默认北京id
     */
    public static int cityId = 290;
    /**
     * 数据管理
     */
    CityMange cityMange;

    String movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityMange = new CityMange(this);
        listView = findViewById(R.id.lv_show);
        tv_location = findViewById(R.id.tv_location);
        msBeanList = new ArrayList<>();
        movieList = new ArrayList<>();
        myAdapter = new MyAdapter(movieList, MainActivity.this);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("locationId", cityId);
                intent.putExtra("movieID", movieList.get(position).getMovieId());
                startActivity(intent);
            }
        });


        getCity();

        /**
         * 先获取本地的，如果本地没有，加载网络
         */
        movie = SharePreUtils.getString(this,"movie","");
        if(TextUtils.isEmpty(movie)) {
            getMovies(String.valueOf(cityId));
        }
        else {
            Gson gson = new Gson();
            Movies movies = gson.fromJson(movie, Movies.class);
            movieList.addAll(movies.getMovies());
            Log.d("MainActivity", "cityList:" + movieList);
            myAdapter.notifyDataSetChanged();
        }
        initListener();
    }

    private void initListener() {
        tv_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击进入城市选择页面
                startActivityForResult(new Intent(MainActivity.this, CityPickerActivity.class), REQUEST_CODE_PICK_CITY);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_PICK_CITY && resultCode == RESULT_OK) {
            if (data != null) {
                city = data.getStringExtra(CityPickerActivity.KEY_PICKED_CITY);
                tv_location.setText(city);
                //联网获取城市的ID
                for (int i = 0; i < msBeanList.size(); i++) {
                    String n = msBeanList.get(i).getN();
                    if (city.contains(n)) {
                        cityId = msBeanList.get(i).getId();
                        Log.d("MainActivity", "cityId:" + cityId);
                    }
                }
                if (cityId >= 0) {
                    getMovies(String.valueOf(cityId));
                }
            }
        }
    }

    /**
     * 得到城市
     */
    private void getCity() {
        msBeanList.clear();
        msBeanList = cityMange.getCityList();
        if (msBeanList.size() > 0) {
            Toast.makeText(this, "从本地获取的城市列表", Toast.LENGTH_SHORT).show();
        } else {
            String url = "https://api-m.mtime.cn/Showtime/HotCitiesByCinema.api";
            OkHttpUtils
                    .get()
                    .url(url)
                    .build()
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Request request, Exception e) {
                            Log.d("MainActivity", request.toString());
                        }
                        @Override
                        public void onResponse(String response) {

                            Gson gson = new Gson();
                            FilmInfoLocationBean filmInfoLocationBean = gson.fromJson(response.toString(), FilmInfoLocationBean.class);
                            msBeanList.addAll(filmInfoLocationBean.getP());
                            cityMange.insertCity(filmInfoLocationBean.getP());
                        }
                    });
        }
    }

    /**
     * 获取电影
     *
     * @param location_id
     */
    private void getMovies(String location_id) {
        movieList.clear();
        String url = "https://api-m.mtime.cn/PageSubArea/HotPlayMovies.api?locationId=" + location_id;
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                        Log.d("MainActivity", request.toString());
                    }
                    @Override
                    public void onResponse(String response) {
                        /**
                         * 解析刷新并存储
                         */
                        Gson gson = new Gson();
                        Movies movies = gson.fromJson(response.toString(), Movies.class);

                        movieList.addAll(movies.getMovies());

                        SharePreUtils.putString(MainActivity.this,"movie",response);
                        myAdapter.notifyDataSetChanged();
                    }
                });
    }


}
