package com.example.andrew.minecraftcalculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class LinearDistance extends AppCompatActivity {

    //declare global variables
    Integer mode = 3;
    EditText X1_input;
    EditText Y1_input;
    EditText Z1_input;
    EditText X2_input;
    EditText Y2_input;
    EditText Z2_input;
    Button calc_do;
    Button swapDims;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_distance);

        X1_input = (EditText) findViewById(R.id.x1_input);
        Y1_input = (EditText) findViewById(R.id.y1_input);
        Z1_input = (EditText) findViewById(R.id.z1_input);
        X2_input = (EditText) findViewById(R.id.x2_input);
        Y2_input = (EditText) findViewById(R.id.y2_input);
        Z2_input = (EditText) findViewById(R.id.z2_input);
        swapDims = (Button) findViewById(R.id.swap_dims);
        calc_do = (Button) findViewById(R.id.calc_do);
        result = (TextView) findViewById(R.id.lin_results_field);

    }

    public void errorDialog() {
        AlertDialog blankFields = new AlertDialog.Builder(LinearDistance.this).create();
        blankFields.setTitle("Whoops!");
        blankFields.setMessage("Please make sure you fill in all the necessary fields!");
        blankFields.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        blankFields.show();
    }

    //Disable y dimension for 2 dimensional measurement
    public void toggleDimensions(View v) {
        if (mode == 2) {
            Log.i("MCProcess", "Changed to 3d distance");
            swapDims.setText(R.string.two_dimension);
            Y1_input.setEnabled(true);
            Y2_input.setEnabled(true);
            mode = 3;
        } else if (mode == 3) {
            Log.i("MCProcess", "Changed to 2d distance");
            swapDims.setText(R.string.three_dimension);
            Y1_input.setEnabled(false);
            Y2_input.setEnabled(false);
            mode = 2;
        }
    }

    public void clearFields(View v) {
        X1_input.setText("");
        Y1_input.setText("");
        Z1_input.setText("");
        X2_input.setText("");
        Y2_input.setText("");
        Z2_input.setText("");
        result.setText("");
    }
    //Perform calculations
    public void performCalc(View v) {
        //error checking
        Boolean errors = false;
        //if there are empty fields then set errors to true so calculations are not attempted
        if (mode == 2) {
            if (X1_input.getText().toString().equals("") || X2_input.getText().toString().equals("") ||
                    Z1_input.getText().toString().equals("") || Z2_input.getText().toString().equals("")) {
                errors = true;
                errorDialog();
            }
        } else if (mode == 3) {
            if (X1_input.getText().toString().equals("") || X2_input.getText().toString().equals("") ||
                    Y1_input.getText().toString().equals("") || Y2_input.getText().toString().equals("") ||
                    Z1_input.getText().toString().equals("") || Z2_input.getText().toString().equals("")) {
                errors = true;
                errorDialog();
            }
        }

        if (!errors) {
            double calculated_result;
            Integer X1 = Integer.parseInt(X1_input.getText().toString());
            Integer Z1 = Integer.parseInt(Z1_input.getText().toString());
            Integer X2 = Integer.parseInt(X2_input.getText().toString());
            Integer Z2 = Integer.parseInt(Z2_input.getText().toString());
            String formatted_result;
            if (mode == 2) {
                //big scary if statement checking to make sure none of the fields are empty
                //perform calculation
                calculated_result = hypotenuse(X1, X2, Z1, Z2);
                //convert back to a string for display
                formatted_result = Double.toString(calculated_result);
                //display the text
                result.setText(formatted_result);
            } else if (mode == 3) {
                Integer Y1 = Integer.parseInt(Z1_input.getText().toString());
                Integer Y2 = Integer.parseInt(Y2_input.getText().toString());
                //converting the result of the first hypotenuse from a double to an Integer, in order
                //to reinsert it into the function
                int side1 = (int) hypotenuse(X1, X2, Z1, Z2);
                calculated_result = hypotenuse(Y1, Y2, side1, 0);
                formatted_result = Double.toString(calculated_result);
                result.setText(formatted_result);
            }
        }

    }

    //this function expedites the hypotenuse calculation to keep above code clean
    public double hypotenuse(Integer L1, Integer L2, Integer H1, Integer H2) {
        double diff1 = (L1 - L2) * (L1 - L2);
        double diff2 = (H1 - H2) * (H1 - H2);
        double hyp_result = Math.sqrt(diff1 + diff2);
        return hyp_result;
    }

}
