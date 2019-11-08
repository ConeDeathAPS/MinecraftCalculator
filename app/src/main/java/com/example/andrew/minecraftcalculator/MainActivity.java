package com.example.andrew.minecraftcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchDistanceCalc(View view) {
        Intent intent = new Intent(this, LinearDistance.class);
        startActivity(intent);
    }

    public void launchItemCalc(View view) {
        Intent intent = new Intent(this, ItemCalculator.class);
        startActivity(intent);
    }

    public void launchCircleHelper(View view) {
        Intent intent = new Intent(this, CircleHelper.class);
        startActivity(intent);
    }

    public void launchRecipeHelper(View view) {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }

}
