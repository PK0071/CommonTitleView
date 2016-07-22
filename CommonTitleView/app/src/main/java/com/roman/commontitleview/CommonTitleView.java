package com.roman.commontitleview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**公用标题栏
 * Created by cyr on 2016/5/20.
 */
public class CommonTitleView extends LinearLayout {

    private Context mContext;
    //左 中 右
    private ImageView mLeftImageView;
    private TextView mLeftTextView;
    private LinearLayout mLeftLinearLayout;

    private ImageView mMiddleImageView;
    private TextView mMiddleTextView;
    private LinearLayout mMiddleLinearLayout;

    private ImageView mRightImageView;
    private TextView mRightTextView;
    private LinearLayout mRightLinearLayout;

    public CommonTitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.common_title_view, null);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.addView(view, lp);

        mLeftImageView = (ImageView) view.findViewById(R.id.iv_title_left);
        mLeftTextView = (TextView) view.findViewById(R.id.tv_title_left);
        mLeftLinearLayout = (LinearLayout) view.findViewById(R.id.ll_title_left);

        mMiddleImageView = (ImageView) view.findViewById(R.id.iv_title_middle);
        mMiddleTextView = (TextView) view.findViewById(R.id.tv_title_middle);
        mMiddleLinearLayout = (LinearLayout) view.findViewById(R.id.ll_title_middle);
        
        mRightImageView = (ImageView) view.findViewById(R.id.iv_title_right);
        mRightTextView = (TextView) view.findViewById(R.id.tv_title_right);
        mRightLinearLayout = (LinearLayout) view.findViewById(R.id.ll_title_right);

        TypedArray array = mContext.obtainStyledAttributes(attrs, R.styleable.CommonTitleView);


        for (int i = 0; i < array.length(); i++) {

            int index = array.getIndex(i);

            switch (index) {
                case R.styleable.CommonTitleView_leftImageView://左图
                    int leftId = array.getResourceId(index, 0);
                    mLeftImageView.setImageResource(leftId);
                    break;
                case R.styleable.CommonTitleView_leftTextView://左字
                    String leftText = array.getString(index);
                    mLeftTextView.setText(leftText);
                    mLeftTextView.setVisibility(VISIBLE);
                    break;
                case R.styleable.CommonTitleView_middleImageView://中图
                    int middleId = array.getResourceId(index, 0);
                    mMiddleImageView.setImageResource(middleId);
                    mMiddleImageView.setVisibility(VISIBLE);
                    break;
                case R.styleable.CommonTitleView_middleTextView://中字
                    String middleText = array.getString(index);
                    mMiddleTextView.setText(middleText);
                    mMiddleTextView.setVisibility(VISIBLE);
                    break;
                case R.styleable.CommonTitleView_rightImageView://右图
                    int rightId = array.getResourceId(index, 0);
                    mRightImageView.setImageResource(rightId);
                    mRightImageView.setVisibility(VISIBLE);
                    break;
                case R.styleable.CommonTitleView_rightTextView://右字
                    String rightText = array.getString(index);
                    mRightTextView.setText(rightText);
                    mRightTextView.setVisibility(VISIBLE);
                    break;

            }
        }
        array.recycle();

        //左边LinearLayout默认返回
        mLeftLinearLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mContext instanceof Activity) {
                    ((Activity)mContext).finish();
                }
            }
        });
    }

    /**
     * 左边监听事件
     * @param listener
     */
    public void setLeftOnClickListener(OnClickListener listener) {
        if (mLeftLinearLayout != null) {
            mLeftLinearLayout.setOnClickListener(listener);
        }
    }

    /**
     * 中间监听事件
     * @param listener
     */
    public void setMiddleOnClickListener(OnClickListener listener) {
        if (mMiddleLinearLayout != null) {
            mMiddleLinearLayout.setOnClickListener(listener);
        }
    }

    /**
     * 右边监听事件
     * @param listener
     */
    public void setRightOnClickListener(OnClickListener listener) {
        if (mRightLinearLayout != null) {
            mRightLinearLayout.setOnClickListener(listener);
        }
    }

    /**
     * 设置左边图片
     * @param id
     */
    public void setLeftImage(int id) {
        if (mLeftImageView != null) {
            mLeftImageView.setImageResource(id);
        }
    }

    /**
     * 设置中间图片
     * @param id
     */
    public void setMiddleImage(int id) {
        if (mMiddleImageView != null) {
            mMiddleImageView.setImageResource(id);
            mMiddleImageView.setVisibility(VISIBLE);
        }
    }

    /**
     * 设置右边图片
     * @param id
     */
    public void setRightImage(int id) {
        if (mRightImageView != null) {
            mRightImageView.setImageResource(id);
            mRightImageView.setVisibility(VISIBLE);
        }
    }

    /**
     * 设置左边文字
     * @param text
     */
    public void setLeftText(String text) {
        if (mLeftTextView != null) {
            mLeftTextView.setText(text);
            mLeftTextView.setVisibility(VISIBLE);
        }
    }

    /**
     * 设置中间文字
     * @param text
     */
    public void setMiddleText(String text) {
        if (mMiddleTextView != null) {
            mMiddleTextView.setText(text);
            mMiddleTextView.setVisibility(VISIBLE);
        }
    }

    /**
     * 设置右边文字
     * @param text
     */
    public void setRightText(String text) {
        if (mRightTextView != null) {
            mRightTextView.setText(text);
            mRightTextView.setVisibility(VISIBLE);
        }
    }


    /**
     * 隐藏左边文字
     * @param
     */
    public void setLeftTextGone(int stauts) {
        if (mLeftTextView != null) {
            mLeftTextView.setVisibility(stauts);
        }
    }

    /**
     * 隐藏中间文字
     * @param
     */
    public void setMiddleTextGone(int stauts) {
        if (mMiddleTextView != null) {
            mMiddleTextView.setVisibility(stauts);
        }
    }

    /**
     * 隐藏右边文字
     * @param
     */
    public void setRightTextGone(int stauts) {
        if (mRightTextView != null) {
            mRightTextView.setVisibility(stauts);
        }
    }
}
