package com.example.administrator.facemaker;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by hall18 on 2/10/2016.
 */
public class Doodle extends SurfaceView {
    public Doodle(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public Doodle(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }

    public Doodle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public Doodle(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setWillNotDraw(false);
    }

    /** onDraw() is analagous to paint() in Java */
    @Override
    public void onDraw(Canvas canvas){
        //"background" color
        Paint whitePaint = new Paint();
        whitePaint.setColor(Color.WHITE);
        canvas.drawRect(0.0f, 0.0f, 400.0f, 400.0f, whitePaint);

        //demonstrates effects you can do with a Paint
        Paint magentaPaint = new Paint();
        magentaPaint.setColor(Color.MAGENTA);
        magentaPaint.setStyle(Paint.Style.FILL);
        magentaPaint.setStrokeWidth(5);
        magentaPaint.setShadowLayer(15.0f, 10.0f, 10.0f, Color.MAGENTA);
        canvas.drawRect(50.0f, 50.0f, 300.0f, 300.0f, magentaPaint);

        //custom color
        Paint greenPaint = new Paint();
        greenPaint.setColor(0xFFBCED91);
        canvas.drawCircle(150.0f, 250.0f, 100.0f, greenPaint);

        //Drawing a Path (somewhat like a polygon in Java)
        Paint redPaint = new Paint();
        redPaint.setStyle(Paint.Style.STROKE);
        redPaint.setStrokeWidth(8.0f);
        redPaint.setColor(0xFF995544);
        redPaint.setShadowLayer(15.0f, 10.0f, 10.0f, Color.MAGENTA);
        Path myPath = new Path();
        myPath.moveTo(0.0f, 200.0f);
        myPath.lineTo(100.0f, 200.0f);
        myPath.lineTo(200.0f, 150.0f);
        myPath.lineTo(300.0f,250.0f);
        canvas.drawPath(myPath, redPaint);



    }
}
