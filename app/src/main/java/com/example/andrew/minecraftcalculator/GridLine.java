package com.example.andrew.minecraftcalculator;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

import android.util.Log;
/**
 * Created by Andrew on 2/22/2016.
 */
public class GridLine {
    private Paint paint;
    private Path path;

    public GridLine() {
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        paint.setStyle(Paint.Style.STROKE);

        path = new Path();
    }

    public void setPath(Float x, Float y) {
        path.lineTo(x, y);
//        Log.e("MCProcess", "Line to " + x + ", " + y);
    }

    public void setNextOrigin(float x, float y) {
        path.moveTo(x, y);
    }

    public Path getPath() {
        return path;
    }

    public Paint getPaint() {
        return paint;
    }

}
