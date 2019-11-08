package com.example.andrew.minecraftcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ItemCalculator extends AppCompatActivity {

    //declare global variables
    EditText sChestOutput;
    EditText dChestOutput;
    EditText stacksOutput;
    TextView stacksRemainder;
    int stackBase = 64;
    EditText itemsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_calculator);

        sChestOutput = findViewById(R.id.schests_input);
        dChestOutput = findViewById(R.id.dchests_input);
        stacksOutput = findViewById(R.id.stacksOutput);
        itemsInput = findViewById(R.id.itemsInput);
        stacksRemainder = findViewById(R.id.stack_remainder);
    }

    public void toggleStackBase(View view) {
        if (stackBase == 64) {
            Log.i("MinecraftCalculator", "Base state changed to 16");
            stackBase = 16;
        } else if (stackBase == 16) {
            Log.i("MinecraftCalculator", "Base state changed to 64");
            stackBase = 64;
        }
    }

    public void errorDialog() {
        AlertDialog errorDialog = new AlertDialog.Builder(ItemCalculator.this).create();
        errorDialog.setTitle("Whoops!");
        errorDialog.setMessage("Make sure you provide a value for 'Number of Items'");
        errorDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        errorDialog.show();
    }

    public void clearItemFields(View view) {
        Log.i("MinecraftCalculator", "Clearing fields for item calculator");
        sChestOutput.setText("0");
        dChestOutput.setText("0");
        stacksOutput.setText("0");
        itemsInput.setText("0");
        stacksRemainder.setText("0");
    }

    public void performItemCalc(View v) {
        //if any of the fields are blank, call the error dialog
        if (sChestOutput.getText().toString().equals("") || dChestOutput.getText().toString().equals("")
                || stacksOutput.getText().toString().equals("") || itemsInput.getText().toString().equals("")) {
            errorDialog();
        } else {
            int items = Integer.parseInt(itemsInput.getText().toString());
            Log.i("MinecraftCalculator", "Calculating with item amount " + items);
            final int[] stackCount = itemsToStacks(items);
            Log.i("MinecraftCalculator", "Stack amount " + stackCount[0] + " r " + stackCount[1]);
            stacksOutput.setText(String.valueOf(stackCount[0]));
            stacksRemainder.setText(String.valueOf(stackCount[1]));
            sChestOutput.setText(String.valueOf(itemsToChests(items, 27)));
            dChestOutput.setText(String.valueOf(itemsToChests(items, 54)));
        }
    }

    private int[] itemsToStacks(int items) {
        int numberOfStacks = (int) Math.floor(items / stackBase);
        return new int[] {numberOfStacks, items - (numberOfStacks * stackBase)};
    }

    private int itemsToChests(int items, int chestSize) {
        return (int) Math.floor((items / stackBase) / chestSize);
    }


}
