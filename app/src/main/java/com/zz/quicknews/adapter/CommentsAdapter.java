package com.zz.quicknews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.zz.quicknews.util.BitmapCache;
import com.zz.quicknews.R;
import com.zz.quicknews.news.comments.Comment;

import java.util.List;

/**
 * Created by yuchenfw on 2016/8/1.
 */
public class CommentsAdapter extends BaseAdapter {
    private Context mContext;
    private List<Comment> mCommentList;
    private RequestQueue mRequestQueue;

    public CommentsAdapter(Context context, List<Comment> commentList, RequestQueue requestQueue) {
        mCommentList = commentList;
        mContext = context;
        mRequestQueue = requestQueue;
//        mRequestQueue= Volley.newRequestQueue(mContext);

    }

    @Override
    public int getCount() {
        return mCommentList.size();
    }

    @Override
    public Object getItem(int i) {
        return mCommentList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_comments, null);
            viewHolder = new ViewHolder();
            viewHolder.mIvUserImage = (ImageView) view.findViewById(R.id.ivUserImage);
            viewHolder.mTvUserName = (TextView) view.findViewById(R.id.tvUserTitle);
            viewHolder.mTvDigNum = (TextView) view.findViewById(R.id.tvDigNum);
            viewHolder.mTvCommentText = (TextView) view.findViewById(R.id.tvCommentText);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Comment comment = mCommentList.get(i);
        getImage(viewHolder.mIvUserImage, comment.getUser_profile_image_url());
        viewHolder.mTvUserName.setText(comment.getUser_name());
        viewHolder.mTvDigNum.setText(comment.getDigg_count() + "");
        viewHolder.mTvCommentText.setText(comment.getText());
        return view;
    }

    public void getImage(ImageView imageView, String url) {
        ImageLoader imageLoader = new ImageLoader(mRequestQueue, new BitmapCache());
        ImageLoader.ImageListener listener = ImageLoader.getImageListener(imageView,
                R.drawable.default_picture, R.drawable.default_picture);
        imageLoader.get(url, listener);
    }

    public static class ViewHolder {
        private ImageView mIvUserImage;
        private TextView mTvUserName;
        private TextView mTvDigNum;
        private TextView mTvCommentText;
    }
}
