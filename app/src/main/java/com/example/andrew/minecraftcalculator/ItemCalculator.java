package com.example.andrew.minecraftcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class ItemCalculator extends AppCompatActivity {

    //declare global variables
    EditText sChest_input;
    EditText dChest_input;
    EditText stack_input;
    TextView stack_remainder;
    EditText stackBase_toggle;
    Double stackBase = 64.00;
    EditText item_results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_calculator);

        sChest_input = (EditText) findViewById(R.id.schests_input);
        dChest_input = (EditText) findViewById(R.id.dchests_input);
        stack_input = (EditText) findViewById(R.id.stacks_input);
        item_results = (EditText) findViewById(R.id.items_results_field);
        stack_remainder = (TextView) findViewById(R.id.stack_remainder);
    }

    public void toggleStackBase(View view) {
        if (stackBase == 64.00) {
            Log.i("MCProcess", "Base state changed to 16");
            stackBase = 16.00;
        } else if (stackBase == 16.00) {
            Log.i("MCProcess", "Base state changed to 64");
            stackBase = 64.00;
        }
    }

    public void errorDialog() {
        AlertDialog errorDialog = new AlertDialog.Builder(ItemCalculator.this).create();
        errorDialog.setTitle("Whoops!");
        errorDialog.setMessage("Make sure you fill in all the necessary fields!");
        errorDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        errorDialog.show();
    }

    public void clearItemFields(View view) {
        Log.i("MCProcess", "Clearing fields for item calculator");
        sChest_input.setText("0");
        dChest_input.setText("0");
        stack_input.setText("0");
        item_results.setText("0");
        stack_remainder.setText("0");
    }

    public void performItemCalc(View v) {

        Boolean errors = false;
        //if any of the fields are blank, call the error dialog
        if (sChest_input.getText().toString().equals("") || dChest_input.getText().toString().equals("")
                || stack_input.getText().toString().equals("") || item_results.getText().toString().equals("")) {
            errorDialog();
            errors = true;
        }
        //as long as there are no errors
        if (!errors) {
            Integer sChests = Integer.parseInt(sChest_input.getText().toString());
            Integer dChests = Integer.parseInt(dChest_input.getText().toString());
            Integer stacks = Integer.parseInt(stack_input.getText().toString());
            Integer items = Integer.parseInt(item_results.getText().toString());
            Integer itemTotal;
            Integer stacksRemainder_output;
            Double roughStacks;
            Double roundStacks;

            if (items != 0) {
                //we are converting from items to stacks/chests
                //if we were only given a number of items, we must first calculate the number of stacks
                if (stacks == 0) {
                    Log.i("MCProcess", "Calculating stacks");
                    roundStacks = Math.floor(items / stackBase);
                    stacks = roundStacks.intValue();
                    Log.i("MCProcess", "Total stacks = " + stacks.toString());
                    Double stacksRemainder = items - (stackBase * stacks);
                    Integer stacks_remainder_output = stacksRemainder.intValue();
                    stack_remainder.setText(stacks_remainder_output.toString());
                    Log.i("MCProcess", "Items left  = " + stack_remainder.toString());
                }
                Log.i("MCProcess", "Calculating chests");
                //now we can begin calculating how many chests, going from big to small, using remainders
                //along the way

                //calculate double chests
                Double roundDChests = Math.floor(stacks / 54);
                dChests = roundDChests.intValue();
                Log.i("MCProcess", "dChests = " + dChests.toString());
                stacks = stacks - (dChests * 54);

                //calculate single chests using leftover stacks
                Double roundSChests = Math.floor(stacks / 27);
                sChests = roundSChests.intValue();
                Log.i("MCProcess", "sChests = " + sChests.toString());
                stacks = stacks - (sChests * 27);
                Log.i("MCProcess", "stacks = " + stacks.toString());

                sChest_input.setText(sChests.toString());
                dChest_input.setText(dChests.toString());
                stack_input.setText(stacks.toString());

            } else if (items == 0 && stacks != 0) {
            //we are converting from stacks to items

                items = stacks * stackBase.intValue();
                item_results.setText(items.toString());

            } else if (sChests != 0 || dChests != 0) {
            //we are converting from chests/stacks to items

                items += sChests * (27 * stackBase.intValue());
                items += dChests * (54 * stackBase.intValue());
                if (stacks != 0) {
                    items += stacks * stackBase.intValue();
                } else {
                    stacks = items / stackBase.intValue();
                }

                stack_input.setText(stacks.toString());
                item_results.setText(items.toString());

            }
        }
    }
}
