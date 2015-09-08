package com.example.cj.customView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by chenjing on 2015/9/7.
 */
public class DrawView extends View{
    //设置初始坐标
    public float currentX = 50;
    public float currentY = 50;
    //定义画笔
    Paint p = new Paint();

    //构造方法，查阅View的官方API
    public DrawView(Context context){//在代码中初始化该View组件时调用
        super(context);
    }

    public DrawView(Context context, AttributeSet set){//从XML文件中初始化该View组件时调用
        super(context, set);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(currentX, currentY, 15, p);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重绘
        invalidate();

        return true;
    }
}
