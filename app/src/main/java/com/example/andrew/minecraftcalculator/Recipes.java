package com.example.andrew.minecraftcalculator;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Recipes extends AppCompatActivity {

    private final String[] items = new String[] {
        "Wood Planks", "Stick", "Torch", "Enchanting Table", "Crafting Table"
    };

    public CraftableItem selectedItem;
    public int yieldNum;
    public String yieldItem;
    public List<CraftableItem> allItems = new ArrayList<>();
    public CraftableItem errorItem;
    public CraftableItem emptyItem;
    public Context thisContext;
    public AutoCompleteTextView searchInput;
    public ImageView r1c1;
    public ImageView r1c2;
    public ImageView r1c3;
    public ImageView r2c1;
    public ImageView r2c2;
    public ImageView r2c3;
    public ImageView r3c1;
    public ImageView r3c2;
    public ImageView r3c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        thisContext = this.getApplicationContext();

        //init temporary craftable item for testing
        String[][] tempLayout = {
            {null, null, null},
            {null, null, null},
            {null, null, null}
        };
        String[][] planksLayout = {
            {null, null, null},
            {null, "stone", null},
            {null, null, null}
        };
        String[] tempIngredients = {null};
        String[] planksIngredients = {"stone"};
        errorItem = new CraftableItem.Builder("unknownItem")
            .withLayout(tempLayout)
            .usingIngredients(tempIngredients)
            .yielding(1)
            .looksLike("@drawable/undefined")
            .build();
        //Init wood planks item
        allItems.add(new CraftableItem.Builder("Wood Planks")
            .withLayout(planksLayout)
            .usingIngredients(planksIngredients)
            .yielding(4)
            .looksLike("@drawable/oak_planks")
            .build());

        //Init the auto-completing search bar
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        searchInput = (AutoCompleteTextView) findViewById(R.id.itemInput);
        searchInput.setAdapter(adapter);
        searchInput.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemName = adapterView.getItemAtPosition(i).toString();
                Log.i("Recipes", "Selected item is: "+itemName);
                CraftableItem targetItem = findItem(itemName);
                fillInterface(errorItem);
                fillInterface(targetItem);
            }

        });

        //Find the image views for each slot
        r1c1 = (ImageView) findViewById(R.id.r1c1_image);
        r1c2 = (ImageView) findViewById(R.id.r1c2_image);
        r1c3 = (ImageView) findViewById(R.id.r1c3_image);
        r2c1 = (ImageView) findViewById(R.id.r2c1_image);
        r2c2 = (ImageView) findViewById(R.id.r2c2_image);
        r2c3 = (ImageView) findViewById(R.id.r2c3_image);
        r3c1 = (ImageView) findViewById(R.id.r3c1_image);
        r3c2 = (ImageView) findViewById(R.id.r3c2_image);
        r3c3 = (ImageView) findViewById(R.id.r3c3_image);


    }

    public CraftableItem findItem(String name) {
        CraftableItem foundItem = errorItem;
        for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getName().equals(name)) {
                Log.i("Recipes", "Found item!");
                foundItem = allItems.get(i);
                break;
            }
        }
        return foundItem;
    }

    public void fillInterface(CraftableItem targetItem) {
        if (targetItem.getLayout()[0][0] != null) {
            r1c1.setImageResource(getDrawable(targetItem.getLayout()[0][0], thisContext));
        }
        if (targetItem.getLayout()[0][1] != null) {
            r1c2.setImageResource(getDrawable(targetItem.getLayout()[0][1], thisContext));
        }
        if (targetItem.getLayout()[0][2] != null) {
            r1c3.setImageResource(getDrawable(targetItem.getLayout()[0][2], thisContext));
        }
        if (targetItem.getLayout()[1][0] != null) {
            r2c1.setImageResource(getDrawable(targetItem.getLayout()[1][0], thisContext));
        }
        if (targetItem.getLayout()[1][1] != null) {
            r2c2.setImageResource(getDrawable(targetItem.getLayout()[1][1], thisContext));
        }
        if (targetItem.getLayout()[1][2] != null) {
            r2c3.setImageResource(getDrawable(targetItem.getLayout()[1][2], thisContext));
        }
        if (targetItem.getLayout()[2][0] != null) {
            r3c1.setImageResource(getDrawable(targetItem.getLayout()[2][0], thisContext));
        }
        if (targetItem.getLayout()[2][1] != null) {
            r3c2.setImageResource(getDrawable(targetItem.getLayout()[2][1], thisContext));
        }
        if (targetItem.getLayout()[2][2] != null) {
            r3c3.setImageResource(getDrawable(targetItem.getLayout()[2][2], thisContext));
        }
    }

    private int getDrawable(String name, Context c) {
        Resources r = c.getResources();
        return r.getIdentifier(name, "drawable", c.getPackageName());
    }
}
