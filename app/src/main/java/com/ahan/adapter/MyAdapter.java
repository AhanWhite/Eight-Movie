package com.ahan.adapter;

/**
 * Created by Weli on 2018/6/26.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ahan.eight.Movies;
import com.ahan.eight.R;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * 自定义适配器
 *
 * @author qiangzi
 *
 */
public class MyAdapter extends BaseAdapter {
    private List<Movies.MoviesBean> list = null;

    private Context context = null;

    private LayoutInflater inflater = null;

    public MyAdapter(List<Movies.MoviesBean> list, Context context) {
        this.list = list;
        this.context = context;
        // 布局装载器对象
        inflater = LayoutInflater.from(context);
    }

    // 适配器中数据集中数据的个数
    @Override
    public int getCount() {
        return list.size();
    }

    // 获取数据集中与指定索引对应的数据项
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    // 获取指定行对应的ID
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 获取每一个Item显示的内容
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_moive, null);
            viewHolder.iv_film = (ImageView) convertView.findViewById(R.id.iv_film);
            viewHolder.iv_film_versions = (ImageView) convertView.findViewById(R.id.iv_film_versions);
            viewHolder.tv_frag_hit_rv_content = (TextView) convertView.findViewById(R.id.tv_frag_hit_rv_content);
            viewHolder.pingfen = (TextView) convertView.findViewById(R.id.pingfen);
            viewHolder.show_pingfen = (TextView) convertView.findViewById(R.id.show_pingfen);
            viewHolder.tv_commonSpecial = (TextView) convertView.findViewById(R.id.tv_commonSpecial);
            viewHolder.tv_NearestCinemaCount = (TextView) convertView.findViewById(R.id.tv_NearestCinemaCount);
            convertView.setTag(viewHolder);// 通过setTag将ViewHolder和convertView绑定
        }  else {
            viewHolder = (ViewHolder) convertView.getTag(); // 获取，通过ViewHolder找到相应的控件
        }
        Movies.MoviesBean itemBean = list.get(position);
        StringBuilder stringBuilder = new StringBuilder("今天有" + itemBean.getWantedCount() + "家影院放映" + itemBean.getWantedCount() + "场");
        String r = String.valueOf(itemBean.getRatingFinal());
        if (r.contains("-1")) {
            r = "暂无评分";
        } else {
            r = String.valueOf(itemBean.getRatingFinal());
        }
        boolean is3D = itemBean.isIs3D();
        boolean isDMAX = itemBean.isIsDMAX();
        boolean isIMAX = itemBean.isIsIMAX();
        boolean isIMAX3D = itemBean.isIsIMAX3D();
        if (isIMAX == false && is3D == false && isDMAX == false && isIMAX3D == false) {
            //2d
            viewHolder.iv_film_versions.setImageDrawable( null);
        } else if (is3D == true && isIMAX3D == false) {
            //3d
            Glide.with(context).load("").placeholder(R.drawable.ic_3d).error(R.drawable.ic_3d).into(viewHolder.iv_film_versions);
        } else if (is3D == true && isIMAX3D == true) {
            //3d max
            Glide.with(context).load("").placeholder(R.drawable.ic_3d_imax).error(R.drawable.ic_3d_imax).into(viewHolder.iv_film_versions);
        } else {
            //2d max
            Glide.with(context).load("").placeholder(R.drawable.ic_2d_imax).error(R.drawable.ic_3d_imax).into(viewHolder.iv_film_versions);
        }

        Glide.with(context).load(itemBean.getImg()).into(viewHolder.iv_film);
        viewHolder.tv_frag_hit_rv_content.setText(itemBean.getTitleCn());
        viewHolder.show_pingfen.setText(r);
        viewHolder.tv_commonSpecial.setText(itemBean.getCommonSpecial());
        viewHolder.tv_NearestCinemaCount.setText(stringBuilder);
        return convertView;
    }

    /**
     * ViewHolder
     */
    class ViewHolder {
        ImageView iv_film;
        ImageView iv_film_versions;
        TextView tv_frag_hit_rv_content;
        TextView pingfen;
        TextView show_pingfen;
        TextView tv_commonSpecial;
        TextView tv_NearestCinemaCount;
    }

}