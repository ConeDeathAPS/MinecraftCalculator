package com.example.andrew.minecraftcalculator;

import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class Recipes extends AppCompatActivity {

    private final String[] items = new String[] {
        "Wood Planks", "Slab", "Quartz Block", "Chiseled Quartz", "Pillar Quartz", "Granite",
        "Polished Granite", "Sandstone", "Red Sandstone", "Smooth Sandstone", "Smooth Red Sandstone",
        "Chiseled Sandstone", "Chiseled Red Sandstone", "Diorite", "Polished Diorite", "Andesite", "Polished Andesite",
        "Block of Gold", "Block of Iron", "Block of Diamond", "Bookshelf", "Snow Block", "Clay Block",
        "Jack o'Lantern", "Glowstone", "Block of Lapis Lazuli", "Melon", "Mossy Cobblestone", "Block of Emerald", "Stained Glass",
        "Stairs", "Mossy Stone Bricks", "Stone Bricks", "Chiseled Stone Bricks", "Nether Bricks", "Red Nether Bricks",
        "Hay Bale", "Stained Clay", "Block of Coal", "Prismarine", "Prismarine Bricks", "Dark Prismarine",
        "Coarse Dirt", "Bricks", "Purpur Bricks", "Purpur Pillar", "Magma Block", "Bone Block", "Nether Wart Block",
        "Wool", "Dyed Wool", "Sea Lantern", "Enchanting Table", "Painting", "Torch", "Crafting Table",
        "Ladder", "Snow", "Jukebox", "Iron Bars", "Wood Fence", "Nether Brick Fence", "Glass Pane", "End Crystal",
        "Ender Chest", "Chest", "Sign", "Item Frame", "Cobblestone Wall", "Flower Pot", "Trapped Chest",
        "Bed", "Slime Block", "Armor Stand", "Furnace", "Carpet", "Anvil", "End Rod", "Shulker Box", "Colored Shulker Box",
        "Banner", "Lever", "Button", "Pressure Plate", "Redstone Torch", "Note Block", "Fence Gate", "Trapdoor",
        "Redstone Dust", "Weighted Pressure Plate (Heavy)", "Weighted Pressure Plate (Light)", "Redstone Repeater",
        "Hopper", "Redstone Lamp", "Daylight Sensor", "Door", "Dispenser", "Piston", "Sticky Piston",
        "Comparator", "TNT", "Observer", "Carrot on a Stick", "Rail", "Minecart with Chest", "Powered Rail",
        "Detector Rail", "Minecart", "Minecart with TNT", "Activator Rail", "Minecart with Hopper",
        "Boat", "Minecart with Furnace", "Mushroom Stew", "Bread", "Cookie", "Golden Carrot", "Pumpkin Pie",
        "Rabbit Stew", "Golden Apple", "Pickaxe", "Shovel", "Shears", "Hoe", "Fishing Rod", "Axe", "Clock",
        "Compass", "Lead", "Sword", "Helmet", "Chestplate", "Leggings", "Boots", "Bow", "Shield", "Arrow",
        "Spectral Arrow", "Tipped Arrow", "Wheat", "Bowl", "Sugar", "Leather", "Dandelion Yellow", "Gray Dye",
        "Pumpkin Seeds", "Gold Nugget", "Gold Ingot", "Rose Red", "Orange Dye", "Pink Dye", "Lime Dye",
        "Purple Dye", "Light Gray Dye", "Magenta Dye", "Light Blue Dye", "Emerald", "Iron Ingot", "Lapis Lazuli",
        "Bonemeal", "Stick", "Iron Nugget", "Melon Seeds", "Diamond", "Firework Star", "Bucket", "Eye of Ender",
        "Book and Quill", "Written Book", "Map (Empty)", "Map (Zoomed Out)", "Fire Charge", "Beacon", "Firework Rocket",
        "Book", "Paper"
    };

    public List<CraftableItem> allItems;
    public CraftableItem errorItem;
    public RecipeFiller populator = new RecipeFiller();
    public Context thisContext;
    public AutoCompleteTextView searchInput;
    public ImageView r1c1, r1c2, r1c3, r2c1, r2c2, r2c3, r3c1, r3c2, r3c3;
    public ImageView outputItem;
    public TextView yieldOutput;
    public TextView recipeDescription;

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
        String[] tempIngredients = {null};
        errorItem = new CraftableItem.Builder("unknownItem")
            .withLayout(tempLayout)
            .ofType("shapeless")
            .usingIngredients(tempIngredients)
            .yielding(1)
            .looksLike("@drawable/stone")
            .build();
        allItems = populator.setAllRecipes();

        //Init the auto-completing search bar
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        searchInput = findViewById(R.id.itemInput);
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
        r1c1 = findViewById(R.id.r1c1_image);
        r1c2 = findViewById(R.id.r1c2_image);
        r1c3 = findViewById(R.id.r1c3_image);
        r2c1 = findViewById(R.id.r2c1_image);
        r2c2 = findViewById(R.id.r2c2_image);
        r2c3 = findViewById(R.id.r2c3_image);
        r3c1 = findViewById(R.id.r3c1_image);
        r3c2 = findViewById(R.id.r3c2_image);
        r3c3 = findViewById(R.id.r3c3_image);
        outputItem = findViewById(R.id.output_image);
        yieldOutput = findViewById(R.id.yield);
        recipeDescription = findViewById(R.id.recipeDescription);
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
        } else {
            r1c1.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[0][1] != null) {
            r1c2.setImageResource(getDrawable(targetItem.getLayout()[0][1], thisContext));
        } else {
            r1c2.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[0][2] != null) {
            r1c3.setImageResource(getDrawable(targetItem.getLayout()[0][2], thisContext));
        } else {
            r1c3.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[1][0] != null) {
            r2c1.setImageResource(getDrawable(targetItem.getLayout()[1][0], thisContext));
        } else {
            r2c1.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[1][1] != null) {
            r2c2.setImageResource(getDrawable(targetItem.getLayout()[1][1], thisContext));
        } else {
            r2c2.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[1][2] != null) {
            r2c3.setImageResource(getDrawable(targetItem.getLayout()[1][2], thisContext));
        } else {
            r2c3.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[2][0] != null) {
            r3c1.setImageResource(getDrawable(targetItem.getLayout()[2][0], thisContext));
        } else {
            r3c1.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[2][1] != null) {
            r3c2.setImageResource(getDrawable(targetItem.getLayout()[2][1], thisContext));
        } else {
            r3c2.setImageResource(android.R.color.transparent);
        }
        if (targetItem.getLayout()[2][2] != null) {
            r3c3.setImageResource(getDrawable(targetItem.getLayout()[2][2], thisContext));
        } else {
            r3c3.setImageResource(android.R.color.transparent);
        }
        outputItem.setImageResource(getDrawable(targetItem.getImg(), thisContext));
        if (targetItem.getYield() > 1) {
            String yield = String.valueOf(targetItem.getYield());
            yieldOutput.setText(yield);
        } else {
            yieldOutput.setText("");
        }
        if (targetItem.getDescription() != null) {
            recipeDescription.setText(targetItem.getDescription());
        } else {
            recipeDescription.setText("");
        }

    }

    private int getDrawable(String name, Context c) {
        Resources r = c.getResources();
        return r.getIdentifier(name, "drawable", c.getPackageName());
    }
}
