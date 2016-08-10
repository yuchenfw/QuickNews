package com.zz.quicknews.activity;

import android.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zz.quicknews.R;
import com.zz.quicknews.adapter.GridViewAdapter;
import com.zz.quicknews.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private GridView mGvPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        initView();
    }

    public void initView() {

        mGvPage = (GridView) findViewById(R.id.pageView);
        int images[] = {R.drawable.b_newhome_tabbar_night, R.drawable.b_newdiscover_tabbar_night,
                R.drawable.b_newcare_tabbar_night, R.drawable.b_newmine_tabbar_night};
        int newImages[] = {R.drawable.b_newhome_tabbar_press, R.drawable.b_newdiscover_tabbar_press,
                R.drawable.b_newcare_tabbar_press, R.drawable.b_newmine_tabbar_press};
        String titles[] = {"首页", "视频", "关注", "我的"};
        final GridViewAdapter adapter = new GridViewAdapter(MainActivity.this, images, titles, newImages);
        mGvPage.setAdapter(adapter);
        mGvPage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println("点击的位置是" + i);
                adapter.setSelectPosition(i);
                adapter.notifyDataSetChanged();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                switch (i) {
                    case 0:
                        ft.replace(R.id.content_view, HomeFragment.newInstance(0)).commit();
                        break;
                    case 1:
                        ft.replace(R.id.content_view, HomeFragment.newInstance(1)).commit();
                        break;

                }
            }
        });
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.content_view, new HomeFragment()).commit();
        adapter.setSelectPosition(0);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {


        }
    }


}
