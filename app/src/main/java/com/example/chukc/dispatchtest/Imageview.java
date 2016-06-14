package com.example.chukc.dispatchtest;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by chukc on 2016/6/14.
 */
public class Imageview extends ImageView{
    private static final String TAG = "TAG";
    public Imageview(Context context) {
        super(context);
    }

    public Imageview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Imageview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Imageview(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(TAG, "image-onTouchEvent======"+event.getAction());
        return super.onTouchEvent(event);
    }

    // 位于view里面
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

            Log.i(TAG, "image-dispatchTouchEvent======="+event.getAction());
        return super.dispatchTouchEvent(event);
    }

}
