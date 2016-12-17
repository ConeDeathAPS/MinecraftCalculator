package com.example.andrew.minecraftcalculator;

/**
 * Created by andsorensen on 11/23/16.
 */
import java.util.List;

public class CraftableItem {
    //Initialize the default values for the item attributes

    public static class Builder {
        private String name;
        private String[][] layout;
        private String type;
        private String[] ingredients;
        private int yield;
        private String img;
        private String description;

        public Builder(String name) {
            this.name = name;
        }
        public Builder withLayout(String[][] layout) {
            this.layout = layout;
            return this;
        }
        public Builder ofType(String type) {
            this.type = type;
            return this;
        }
        public Builder usingIngredients(String[] ingredients) {
            this.ingredients = ingredients;
            return this;
        }
        public Builder yielding(int yield) {
            this.yield = yield;
            return this;
        }
        public Builder looksLike(String img) {
            this.img = img;
            return this;
        }
        public Builder describedAs(String description) {
            this.description = description;
            return this;
        }

        public CraftableItem build() {
            CraftableItem item = new CraftableItem();
            item.name = this.name;
            item.layout = this.layout;
            item.ingredients = this.ingredients;
            item.yield = this.yield;
            item.img = this.img;
            item.type = this.type;
            item.description = this.description;

            return item;
        }

    }
    private String name;
    private String[][] layout;
    private String[] ingredients;
    private int yield;
    private String img;
    private String type;
    private String description;

    private CraftableItem() {

    }

    public int getYield() { return this.yield; };
    public String getName() { return this.name; };
    public String[] getIngredients() { return this.ingredients; };
    public String[][] getLayout() {
        return this.layout;
    };
    public String getImg() {
        return this.img;
    };
    public String getType() { return this.type; };
    public String getDescription() { return this.description; };
}
