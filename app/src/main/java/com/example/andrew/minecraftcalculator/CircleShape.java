package com.example.andrew.minecraftcalculator;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Andrew on 2/24/2016.
 */
public class CircleShape {
    private Paint paint;
    private Path path;

    public CircleShape() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);

        path = new Path();
    }

    public void setCircle(float x, float y, int radius, Path.Direction dir) {
        path.reset();
        path.addCircle(x, y, radius, dir);
    }

    public Path getPath() {
        return path;
    }

    public Paint getPaint() {
        return paint;
    }

}
