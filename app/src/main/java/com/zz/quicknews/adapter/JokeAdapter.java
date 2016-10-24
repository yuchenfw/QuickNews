package com.zz.quicknews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zz.quicknews.R;
import com.zz.quicknews.news.joke.Joke;

import java.util.List;

/**
 * Created by yuchenfw on 2016/6/28.
 */
public class JokeAdapter extends BaseAdapter {
    private List<Joke> mJokeList;
    private Context mContext;

    public JokeAdapter(Context context, List<Joke> jokeList) {
        mContext = context;
        mJokeList = jokeList;
    }

    @Override
    public int getCount() {
        return mJokeList.size();
    }

    @Override
    public Object getItem(int i) {
        return mJokeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_joke, null);
            viewHolder = new ViewHolder();
            viewHolder.mTvJokeAuthor = (TextView) view.findViewById(R.id.tvJokeAuthor);
            viewHolder.mTvJokeContent = (TextView) view.findViewById(R.id.tvJokeContent);
            viewHolder.mTvPopularComments = (TextView) view.findViewById(R.id.tvPopularComment);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Joke joke = mJokeList.get(i);
        if (joke.getGroup() != null) {
            viewHolder.mTvJokeAuthor.setText(joke.getGroup().getUser().getName());
            viewHolder.mTvJokeContent.setText(joke.getGroup().getText());
        }
        if (joke.getComments() != null && joke.getComments().size() != 0) {
            viewHolder.mTvPopularComments.setText(joke.getComments().get(0).getText());
        } else {
            viewHolder.mTvPopularComments.setText("");
        }
        return view;
    }

    public static class ViewHolder {
        private TextView mTvJokeAuthor;
        private TextView mTvJokeContent;
        private TextView mTvPopularComments;
    }
}
