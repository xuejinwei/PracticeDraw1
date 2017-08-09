package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    String[] mStrings = new String[] {
            "Lollipop", "Marshmallow", "Froyo", "Gingerbread", "Ice Cream Sandwich", "Jelly Bean",
            "KitKat"
    };

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();


        //Loliipop
        paint.setColor(Color.RED);
        canvas.drawArc(200,50,800,650,-180,120,true,paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(30f);
        paint.setAntiAlias(true);
        canvas.drawText(mStrings[0],10,50,paint);



        paint.setColor(Color.BLUE);
        canvas.drawArc(220,70,820,670,70,110,true,paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawArc(220,70,820,670,20,50,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(220,70,820,670,5,20,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(220,70,820,670,-60,50,true,paint);

        paint.setColor(Color.CYAN);
        canvas.drawArc(220,70,820,670,-10,5,true,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(220,70,820,670,-5,10,true,paint);


        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(130,50,300,50,paint);
        canvas.drawLine(300,50,345,95,paint);

        paint.setTextSize(30f);
        paint.setAntiAlias(false);
        paint.setStrokeWidth(0f);
        canvas.drawText(mStrings[6],50,600,paint);


        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(200,600,300,600,paint);
        canvas.drawLine(300,600,313,587,paint);

        paint.setTextSize(30f);
        paint.setStrokeWidth(0f);
        canvas.drawText(mStrings[1],880,200,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(760,200,860,200,paint);


        paint.setTextSize(30f);
        paint.setStrokeWidth(0f);
        canvas.drawText(mStrings[2],880,330,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(820,330,860,330,paint);


        paint.setTextSize(30f);
        paint.setStrokeWidth(0f);
        canvas.drawText(mStrings[3],880,360,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(820,360,860,360,paint);


        paint.setTextSize(30f);
        paint.setStrokeWidth(0f);
        canvas.drawText(mStrings[4],860,450,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(810,450,850,450,paint);

        paint.setTextSize(30f);
        paint.setStrokeWidth(0f);
        canvas.drawText(mStrings[5],860,600,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(790,600,850,600,paint);
        canvas.drawLine(750,560,790,600,paint);
    }
}
