package com.example.andrew.minecraftcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andsorensen on 12/14/16.
 */


public class RecipeFiller {
    private List<CraftableItem> itemArr = new ArrayList<CraftableItem>();
    private String[][] tempLayout;
    private String[] tempIngs;

    public List<CraftableItem> setAllRecipes() {
        // ==================Wood Planks =================== //
        String[][] tempLayout = {
                {null, null, null},
                {null, "oak_log", null},
                {null, null, null}
        };
        String[] ings = {"oak_log"};
        itemArr.add(new CraftableItem.Builder("Wood Planks")
            .withLayout(tempLayout)
            .ofType("shapeless")
            .usingIngredients(ings)
            .yielding(4)
            .looksLike("@drawable/oak_wood_plank")
            .describedAs("This recipe is valid for all types of wood.")
            .build());
        // ================== Slab =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, null, null},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Slab")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(6)
                .looksLike("@drawable/oak_wood_slab")
                .describedAs("This recipe is valid for all wood and construction materials.")
                .build());
        // ================== Quartz Block =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"quartz", "quartz", null},
                {"quartz", "quartz", null}
        };
        ings = new String[] {"quartz"};
        itemArr.add(new CraftableItem.Builder("Quartz Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/quartz_block")
                .build());
        // ================== Chiseled Quartz =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "quartz_slab", null},
                {null, "quartz_slab", null}
        };
        ings = new String[] {"quartz_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Quartz")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/chiseled_quartz")
                .build());
        // ================== Pillar Quartz =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "quartz_block", null},
                {null, "quartz_block", null}
        };
        ings = new String[] {"quartz_block"};
        itemArr.add(new CraftableItem.Builder("Chiseled Quartz")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/pillar_quartz")
                .build());
        // ================== Granite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diorite", "quartz", null},
                {null, null, null}
        };
        ings = new String[] {"quartz", "diorite"};
        itemArr.add(new CraftableItem.Builder("Granite")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/granite")
                .build());
        // ================== Polished Granite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"granite", "granite", null},
                {"granite", "granite", null}
        };
        ings = new String[] {"granite"};
        itemArr.add(new CraftableItem.Builder("Polished Granite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/polished_granite")
                .build());
        // ================== Sandstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"sand", "sand", null},
                {"sand", "sand", null}
        };
        ings = new String[] {"sand"};
        itemArr.add(new CraftableItem.Builder("Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/sandstone")
                .describedAs("This recipe is valid for red sandstone as well.")
                .build());
        // ================== Smooth Sandstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"sandstone", "sandstone", null},
                {"sandstone", "sandstone", null}
        };
        ings = new String[] {"sandstone"};
        itemArr.add(new CraftableItem.Builder("Smooth Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(4)
                .looksLike("@drawable/sandstone")
                .describedAs("This recipe is valid for red sandstone as well.")
                .build());
        // ================== Chiseled Sandstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "sandstone_slab", null},
                {null, "sandstone_slab", null}
        };
        ings = new String[] {"sandstone_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/sandstone")
                .describedAs("This recipe is valid for red sandstone as well.")
                .build());
        // ================== Chiseled Red Sandstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "red_sandstone_slab", null},
                {null, "red_sandstone_slab", null}
        };
        ings = new String[] {"red_sandstone_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Red Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/chiseled_red_sandstone")
                .describedAs("This recipe is valid for red sandstone as well.")
                .build());
        // ================== Diorite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"cobblestone", "quartz", null},
                {"quartz", "cobblestone", null}
        };
        ings = new String[] {"quartz", "cobblestone"};
        itemArr.add(new CraftableItem.Builder("Diorite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/diorite")
                .build());
        // ================== Polished Diorite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diorite", "diorite", null},
                {"diorite", "diorite", null}
        };
        ings = new String[] {"diorite"};
        itemArr.add(new CraftableItem.Builder("Polished Diorite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/polished_diorite")
                .build());
        // ================== Andesite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diorite", "cobblestone", null},
                {null, null, null}
        };
        ings = new String[] {"diorite", "cobblestone"};
        itemArr.add(new CraftableItem.Builder("Andesite")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/andesite")
                .build());
        // ================== Polished Andesite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"andesite", "andesite", null},
                {"andesite", "andesite", null}
        };
        ings = new String[] {"andesite"};
        itemArr.add(new CraftableItem.Builder("Polished Andesite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/polished_andesite")
                .build());
        // ================== Block of Gold =================== //
        tempLayout = new String[][] {
                {"gold_ingot", "gold_ingot", "gold_ingot"},
                {"gold_ingot", "gold_ingot", "gold_ingot"},
                {"gold_ingot", "gold_ingot", "gold_ingot"}
        };
        ings = new String[] {"gold_ingot"};
        itemArr.add(new CraftableItem.Builder("Block of Gold")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/gold_block")
                .build());
        // ================== Block of Iron =================== //
        tempLayout = new String[][] {
                {"iron_ingot", "iron_ingot", "iron_ingot"},
                {"iron_ingot", "iron_ingot", "iron_ingot"},
                {"iron_ingot", "iron_ingot", "iron_ingot"}
        };
        ings = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Block of Iron")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/iron_block")
                .build());
        // ================== Block of Diamond =================== //
        tempLayout = new String[][] {
                {"diamond", "diamond", "diamond"},
                {"diamond", "diamond", "diamond"},
                {"diamond", "diamond", "diamond"}
        };
        ings = new String[] {"diamond"};
        itemArr.add(new CraftableItem.Builder("Block of Diamond")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/diamond_block")
                .build());
        // ================== Bookshelf =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"book", "book", "book"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plank", "book"};
        itemArr.add(new CraftableItem.Builder("Bookshelf")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/bookshelf")
                .describedAs("This recipe accepts all types of wood.")
                .build());
        // ================== Snow Block =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"snow_ball", "snow_ball", null},
                {"snow_ball", "snow_ball", null}
        };
        ings = new String[] {"snow_ball"};
        itemArr.add(new CraftableItem.Builder("Snow Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/snow_block")
                .build());
        // ================== Clay Block =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"clay_ball", "clay_ball", null},
                {"clay_ball", "clay_ball", null}
        };
        ings = new String[] {"clay_ball"};
        itemArr.add(new CraftableItem.Builder("Clay Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/clay_block")
                .build());
        // ================== Jack o'Lantern =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "pumpkin", null},
                {null, "torch", null}
        };
        ings = new String[] {"pumpkin", "torch"};
        itemArr.add(new CraftableItem.Builder("Jack o'Lantern")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/jack_o_lantern")
                .build());
        // ================== Glowstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"glowstone_dust", "glowstone_dust", null},
                {"glowstone_dust", "glowstone_dust", null}
        };
        ings = new String[] {"glowstone_dust"};
        itemArr.add(new CraftableItem.Builder("Glowstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/glowstone")
                .build());
        // ================== Block of Lapis Lazuli =================== //
        tempLayout = new String[][] {
                {"lapis", "lapis", "lapis"},
                {"lapis", "lapis", "lapis"},
                {"lapis", "lapis", "lapis"}
        };
        ings = new String[] {"lapis"};
        itemArr.add(new CraftableItem.Builder("Block of Lapis Lazuli")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/lapis_block")
                .build());
        // ================== Melon =================== //
        tempLayout = new String[][] {
                {"melon_slice", "melon_slice", "melon_slice"},
                {"melon_slice", "melon_slice", "melon_slice"},
                {"melon_slice", "melon_slice", "melon_slice"}
        };
        ings = new String[] {"melon_slice"};
        itemArr.add(new CraftableItem.Builder("Melon")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/melon")
                .build());
        // ================== Mossy Cobblestone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"cobblestone", "vines", null},
                {null, null, null}
        };
        ings = new String[] {"cobblestone", "vines"};
        itemArr.add(new CraftableItem.Builder("Mossy Cobblestone")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/mossy_cobblestone")
                .build());
        // ================== Block of Emerald =================== //
        tempLayout = new String[][] {
                {"emerald", "emerald", "emerald"},
                {"emerald", "emerald", "emerald"},
                {"emerald", "emerald", "emerald"}
        };
        ings = new String[] {"emerald"};
        itemArr.add(new CraftableItem.Builder("Block of Emerald")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/emerald_block")
                .build());
        // ================== Stained Glass =================== //
        tempLayout = new String[][] {
                {"glass", "glass", "glass"},
                {"glass", "light_blue_dye", "glass"},
                {"glass", "glass", "glass"}
        };
        ings = new String[] {"glass", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Stained Glass")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(8)
                .looksLike("@drawable/light_blue_stained_glass")
                .describedAs("This recipe is valid for all colors of dye.")
                .build());
        // ================== Stairs =================== //
        tempLayout = new String[][] {
                {"oak_wood_planks", null, null},
                {"oak_wood_planks", "oak_wood_planks", null},
                {"oak_wood_planks", "oak_wood_planks", "oak_wood_planks"}
        };
        ings = new String[] {"oak_wood_planks"};
        itemArr.add(new CraftableItem.Builder("Stairs")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(4)
                .looksLike("@drawable/oak_wood_stairs")
                .describedAs("This recipe is valid for all wood and construction materials.")
                .build());
        // ================== Mossy Stone Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"stone_brick", "vines", null},
                {null, null, null}
        };
        ings = new String[] {"stone_brick", "vines"};
        itemArr.add(new CraftableItem.Builder("Mossy Stone Bricks")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/mossy_stone_brick")
                .build());
        // ================== Stone Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"stone", "stone", null},
                {"stone", "stone", null}
        };
        ings = new String[] {"stone_brick", "vines"};
        itemArr.add(new CraftableItem.Builder("Stone Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/stone_brick")
                .build());



        return itemArr;
    }

}
