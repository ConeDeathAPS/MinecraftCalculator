package com.example.andrew.minecraftcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.widget.Button;
import android.widget.TextView;


import java.lang.reflect.Array;

public class CircleHelper extends AppCompatActivity {

    Button incrementBtn;
    Button decrementBtn;
    TextView radiusDisplay;
    Integer radius = 10;
    SquareView thisView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_helper);
        incrementBtn = (Button) findViewById(R.id.increment_radius);
        decrementBtn = (Button) findViewById(R.id.decrement_radius);
        radiusDisplay = (TextView) findViewById(R.id.radius_input);
        radiusDisplay.setText("10");
        thisView = (SquareView) findViewById(R.id.squaresView);
    }

    public Integer getRadius() {
        return radius;
    }

    public void decrementRadius(View thisView) {
        radius -= 1;
        radiusDisplay.setText(radius.toString());
        updateRadius(radius);
    }

    public void incrementRadius(View thisView) {
        radius += 1;
        radiusDisplay.setText(radius.toString());
        updateRadius(radius);
    }

    public void updateRadius(Integer rad) {
        thisView.setRadius(rad);
        thisView.invalidate();
    }


}


