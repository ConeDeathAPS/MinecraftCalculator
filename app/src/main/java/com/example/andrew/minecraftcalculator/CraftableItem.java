package com.example.andrew.minecraftcalculator;

/**
 * Created by andsorensen on 11/23/16.
 */

public class CraftableItem extends Object {
    //Initialize the default values for the item attributes
    public String name = "undefined"; //normalized to lowercase
    public String[][] layout = {
        {null, null, null}, //Row 1
        {null, null, null}, //Row 2
        {null, null, null}  //Row 3
    };
    public String[] ingredients = {null};
    public int yield = 1;
    private String img = "@drawable/undefined.png";

    // ============= BEGIN CONSTRUCTOR ============= //
    //This item requires <String> 'name', 2 dimensional <String> array 'layout', <int> 'yield'
    public CraftableItem(String _name, String[][] _layout, int _yield, String[] _ingredients ) {
        name = _name;
        layout = _layout;
        ingredients = _ingredients;
        yield = _yield;
        img = "@drawable/"+_name+".png";
    }

    public String[][] getLayout() {
        return layout;
    }

    public String getImg() {
        return img;
    }
}
