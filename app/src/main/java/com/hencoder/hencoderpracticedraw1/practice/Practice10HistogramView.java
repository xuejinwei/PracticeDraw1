package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    String[] mStrings = new String[]{"Froyo","GB","ICS","JB","KitKat","L","M"};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2f);
        paint.setAntiAlias(true);

        canvas.drawLine(100,20,100,500,paint);
        canvas.drawLine(100,500,1000,500,paint);

        //绘制Froyo
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[0],130,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(110,498,220,500,paint);

        //绘制GB
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[1],270,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(230,480,340,500,paint);

        //绘制ICS
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[2],380,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(350,480,460,500,paint);

        //绘制JB
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[3],510,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(470,300,580,500,paint);

        //KitKat
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[4],620,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(590,200,700,500,paint);

        //绘制L
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[5],760,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(710,100,820,500,paint);

        //绘制M
        paint.setColor(Color.WHITE);
        paint.setTextSize(24f);
        canvas.drawText(mStrings[6],880,520,paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(830,200,940,500,paint);
    }
}
