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
    int singleChests;
    int doubleChests;
    int items;
    int remainder;
    int stacks;

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

    public void toggleStackBase() {
        if (stackBase == 64) {
            stackBase = 16;
        } else if (stackBase == 16) {
            stackBase = 64;
        }
    }

    public void clearItemFields(View view) {
        sChestOutput.setText("0");
        dChestOutput.setText("0");
        stacksOutput.setText("0");
        itemsInput.setText("0");
        stacksRemainder.setText("0");
    }

    public void performItemCalc(View v) {
        //if any of the fields are blank, call the error dialog
        if (itemsInput.getText().toString().isEmpty() || Integer.getInteger(itemsInput.getText().toString()) > 0) {
            errorDialog("Please provide a positive integer for 'items'.");
        } else {
            int items = Integer.parseInt(itemsInput.getText().toString());
            final int[] stackCount = itemsToStacks(items);
            this.stacks = stackCount[0];
            this.remainder = stackCount[1];
            this.singleChests = itemsToChests(items, 27);
            this.doubleChests = itemsToChests(items, 54);
            this.updateAllOutputFields();
        }
    }

    private int[] itemsToStacks(int items) {
        int numberOfStacks = (int) Math.floor(items / stackBase);
        return new int[] {numberOfStacks, items - (numberOfStacks * stackBase)};
    }

    private int itemsToChests(int items, int chestSize) {
        return (int) Math.floor((items / stackBase) / chestSize);
    }

    private void updateAllOutputFields() {
        sChestOutput.setText(String.valueOf(this.singleChests));
        dChestOutput.setText(String.valueOf(this.doubleChests));
        stacksOutput.setText(String.valueOf(this.stacks));
        stacksRemainder.setText(String.valueOf(this.stacks));
    }

    private void errorDialog(String message) {
        AlertDialog errorDialog = new AlertDialog.Builder(ItemCalculator.this).create();
        errorDialog.setTitle("Whoops!");
        errorDialog.setMessage(message);
        errorDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        errorDialog.show();
    }
}
