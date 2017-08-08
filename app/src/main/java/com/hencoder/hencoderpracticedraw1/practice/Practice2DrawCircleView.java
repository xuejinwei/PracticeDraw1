package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DensityUtil;

public class Practice2DrawCircleView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        int mWidth, mHeight, mRadius;// view 宽度、高度、园的半径
        mWidth = getWidth();
        mHeight = getHeight();
        mRadius = mWidth < mHeight ? mWidth / 4 : mHeight / 4;//半径为宽高最小值的1/4
        mRadius = mRadius / 5 * 4;// 再取4/5

        paint.setAntiAlias(true);// 开启抗锯齿，或者 Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);也可以开启
        paint.setColor(Color.BLACK);

        canvas.drawCircle(mWidth / 4, mHeight / 4, mRadius, paint);// 第一个圆，实心，黑色

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(mWidth / 4 * 3, mHeight / 4, mRadius, paint);// 第二个园，空心，黑色

        paint.setColor(Color.parseColor("#3C7ADB"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(mWidth / 4, mHeight / 4 * 3, mRadius, paint);// 第三个园，实心，蓝色

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DensityUtil.dp2px(20));
        canvas.drawCircle(mWidth / 4 * 3, mHeight / 4 * 3, mRadius, paint);// 第四个园，空心，黑色，线宽20

    }
}
