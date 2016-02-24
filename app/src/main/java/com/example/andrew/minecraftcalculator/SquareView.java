package com.example.andrew.minecraftcalculator;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Array;

/**
 * Created by Andrew on 2/22/2016.
 */
public class SquareView extends View {

    GridLine XLines;
    GridLine YLines;
    CircleShape thisCircle;
    Integer radius;

    public SquareView(Context context) {
        super(context);
        setRadius(10);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int size = width > height ? height : width;
        setMeasuredDimension(size, size);
    }

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setRadius(10);
    }

    public SquareView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setRadius(10);
    }

    public void setRadius(Integer rad) {
        radius = rad;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.i("MCProcess", "Drawing gridlines....");

        float w = this.getWidth();
        float h = this.getHeight();
        //build the X gridlines
        float spacing = w / (radius+1);
        XLines = new GridLine();
        for (int idx = 0; idx <= radius+1; idx++) {
//            Log.i("MCProcess", "Drawing X line" + " " + idx);
            float thisXOrigin = idx * spacing;
            float nextXOrigin = (idx + 1) * spacing;
//            Log.i("MCProcess", "This X origin is " + thisXOrigin);
            XLines.setPath(thisXOrigin, h);
            XLines.setNextOrigin(nextXOrigin, 0f);
        }
        canvas.drawPath(XLines.getPath(), XLines.getPaint());

        //build the Y gridlines
        YLines = new GridLine();
        for (int idx = 0; idx <= radius+1; idx++) {
//            Log.i("MCProcess", "Drawing Y line" + " " + idx);
            float thisYOrigin = idx * spacing;
            float nextYOrigin = (idx + 1) * spacing;
//            Log.i("MCProcess", "Next Y origin is " + thisYOrigin);
            YLines.setPath(w, thisYOrigin);
            YLines.setNextOrigin(0f, nextYOrigin);
        }
        canvas.drawPath(YLines.getPath(), YLines.getPaint());

        //now draw the circle
        thisCircle = new CircleShape();
        float circleX = (float)w/2.0f;
        float circleY = (float)h/2.0f;
        Float radiusRatio = (radius * spacing) / 2;
        thisCircle.setCircle(circleX, circleY, radiusRatio.intValue(), Path.Direction.CCW);
        canvas.drawPath(thisCircle.getPath(), thisCircle.getPaint());

    }
}
