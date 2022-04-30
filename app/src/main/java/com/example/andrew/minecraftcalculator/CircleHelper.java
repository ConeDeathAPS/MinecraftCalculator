package com.example.andrew.minecraftcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CircleHelper extends AppCompatActivity {

    Button incrementBtn;
    Button decrementBtn;
    TextView radiusDisplay;
    int radius = 10;
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
        radiusDisplay.setText(String.valueOf(radius));
        updateRadius(radius);
    }

    public void incrementRadius(View thisView) {
        radius += 1;
        radiusDisplay.setText(String.valueOf(radius));
        updateRadius(radius);
    }

    public void updateRadius(Integer rad) {
        thisView.setRadius(rad);
        thisView.invalidate();
    }


}


