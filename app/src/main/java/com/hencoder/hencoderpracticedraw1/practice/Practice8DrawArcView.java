package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DensityUtil;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL); // 填充模式

        RectF rectF = new RectF();
        rectF.set(DensityUtil.dp2px(20), DensityUtil.dp2px(20),
                getWidth() - DensityUtil.dp2px(20), getHeight() - DensityUtil.dp2px(20));

        canvas.drawArc(rectF, -110, 100, true, paint); // 绘制扇形
        canvas.drawArc(rectF, 20, 140, false, paint); // 绘制弧形
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(rectF, 180, 60, false, paint); // 绘制不封口的弧形
    }
}
