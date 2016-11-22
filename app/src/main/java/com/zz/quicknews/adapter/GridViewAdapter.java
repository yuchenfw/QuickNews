package com.zz.quicknews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zz.quicknews.R;

/**
 * Created by yuchenfw on 2016/7/26.
 */
public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    private int[] newImageId;
    private int[] imageId;
    private String[] title;

    public void setSelectPosition(int selectPosition) {
        this.selectPosition = selectPosition;
    }

    private int selectPosition=-1;

    public GridViewAdapter(Context context, int[] imageId, String[] title,int[] newImageId) {
        this.imageId = imageId;
        mContext = context;
        this.title = title;
        this.newImageId=newImageId;
    }

    @Override
    public int getCount() {
        return imageId.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view= LayoutInflater.from(mContext).inflate(R.layout.item_gridview,null);
        }
        ImageView ivImage= (ImageView) view.findViewById(R.id.ivImage);
        TextView tvTitle= (TextView) view.findViewById(R.id.tvTitle);
        tvTitle.setText(title[i]);
        if (selectPosition==i){
            ivImage.setBackgroundResource(newImageId[i]);
            tvTitle.setTextColor(mContext.getResources().getColor(R.color.orangered));
        }else {
            ivImage.setBackgroundResource(imageId[i]);
            tvTitle.setTextColor(mContext.getResources().getColor(R.color.bright_foreground_light_disabled));
        }
        return view;
    }
}
