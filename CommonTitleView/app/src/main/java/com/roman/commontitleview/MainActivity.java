package com.roman.commontitleview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Author:    roman
 * Describe:  commonTitleView使用
 * Date:      2016/5/20
 */
public class MainActivity extends Activity {

    private CommonTitleView mTitleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置点击事件
        mTitleView = (CommonTitleView) findViewById(R.id.titleView);
        mTitleView.setMiddleOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "个人中心", Toast.LENGTH_SHORT).show();
            }
        });
        mTitleView.setLeftOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });
        mTitleView.setRightOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "收件", Toast.LENGTH_SHORT).show();
            }
        });

        //设置TextView的显示
        mTitleView.setLeftTextGone(View.VISIBLE);//设置显示左边textView
        mTitleView.setMiddleTextGone(View.VISIBLE);//设置隐藏中间textView
        mTitleView.setRightTextGone(View.GONE);//设置隐藏右边textView

        //设置Text内容
        mTitleView.setLeftText("返回2");
        mTitleView.setMiddleText("个人中心2");
        mTitleView.setRightText("收件箱2");

        //设置自己的icon图片
        mTitleView.setLeftImage(R.mipmap.back);
        mTitleView.setMiddleImage(R.mipmap.ic_person);
        mTitleView.setRightImage(R.mipmap.ic_chat);
    }
}
