package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.utils.DensityUtil;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint();
        Path path = new Path(); // 初始化 Path 对象
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(DensityUtil.dp2px(10));

        // 心形
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//        path.close();

        // 巨丑的五角星
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(getWidth() / 2, 0);
        path.lineTo(getWidth() / 4 * 3, getHeight());
        path.lineTo(0, getHeight() / 4);
        path.lineTo(getWidth(), getHeight() / 4);
        path.lineTo(getWidth() / 4, getHeight());
        path.close();

        canvas.drawPath(path, paint);
    }
}
