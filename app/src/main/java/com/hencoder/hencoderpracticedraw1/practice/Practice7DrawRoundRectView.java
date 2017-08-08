package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DensityUtil;

public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形


        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(DensityUtil.dp2px(20));

        RectF rectF = new RectF();
        rectF.set(getWidth() / 4, getHeight() / 4, getWidth() / 4 * 3, getHeight() / 4 * 3);
        canvas.drawRoundRect(rectF, DensityUtil.dp2px(20), DensityUtil.dp2px(20), paint);
    }
}
