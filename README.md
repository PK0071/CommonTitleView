# CommonTitleView

##自定义的组合控件，常用的公用的标题栏
左中右都包含有iamgeview和textview
![image](http://7xrn7f.com1.z0.glb.clouddn.com/16-7-22/19899979.jpg)

不想down下来的，可以去我的博客里面先看一下，有贴源码。[Blog](http://blog.csdn.net/pk0071/article/details/51488644)

##使用方式如下
    <com.roman.commontitleview.CommonTitleView
        android:id="@+id/titleView"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        app:middleTextView="个人中心"
        app:leftTextView="返回"
        app:middleImageView="@mipmap/ic_person"
        app:rightImageView="@mipmap/ic_chat"
        app:rightTextView="收件箱">
    </com.roman.commontitleview.CommonTitleView>
    直接作为一个控件使用，可以在这里自定义属性设置icon图片，和text的文字，如果不需要某一个，不写属性即可
    
  代码支持设置点击事件，textView显示控制，替换默认icon图片，使用如下
  
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
  
