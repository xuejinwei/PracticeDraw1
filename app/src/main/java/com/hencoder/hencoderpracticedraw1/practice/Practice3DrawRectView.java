package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形

        int mWidth, mHeight, mRadius;// view 宽度、高度、半径
        mWidth = getWidth();
        mHeight = getHeight();
        mRadius = mWidth < mHeight ? mWidth / 2 : mHeight / 2;//半径为宽高最小值的1/2
        mRadius = mRadius / 5 * 4;// 再取4/5

        paint.setAntiAlias(true);// 开启抗锯齿，或者 Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);也可以开启
        paint.setColor(Color.BLACK);

        canvas.drawRect(mWidth / 2 - mRadius, mHeight / 2 - mRadius, mWidth / 2 + mRadius, mHeight / 2 + mRadius, paint);
    }
}
