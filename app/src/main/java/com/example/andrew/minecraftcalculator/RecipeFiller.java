package com.example.andrew.minecraftcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andsorensen on 12/14/16.
 */


public class RecipeFiller {
    private List<CraftableItem> itemArr = new ArrayList<CraftableItem>();

    public List<CraftableItem> setAllRecipes() {
        // ================================================= //
        // =============== Building Blocks ================= //
        // ================================================= //

        // ================== Wood Planks =================== //
        String[][] tempLayout = new String[][] {
                {null, null, null},
                {null, "oak_log", null},
                {null, null, null}
        };
        String[] ingredients = {"oak_log"};
        itemArr.add(new CraftableItem.Builder("Wood Planks")
            .withLayout(tempLayout)
            .ofType("shapeless")
            .usingIngredients(ingredients)
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
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Slab")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"quartz"};
        itemArr.add(new CraftableItem.Builder("Quartz Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/quartz_block")
                .build());
        // ================== Chiseled Quartz =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "quartz_slab", null},
                {null, "quartz_slab", null}
        };
        ingredients = new String[] {"quartz_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Quartz")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/chiseled_quartz")
                .build());
        // ================== Pillar Quartz =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "quartz_block", null},
                {null, "quartz_block", null}
        };
        ingredients = new String[] {"quartz_block"};
        itemArr.add(new CraftableItem.Builder("Chiseled Quartz")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/pillar_quartz")
                .build());
        // ================== Granite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diorite", "quartz", null},
                {null, null, null}
        };
        ingredients = new String[] {"quartz", "diorite"};
        itemArr.add(new CraftableItem.Builder("Granite")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/granite")
                .build());
        // ================== Polished Granite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"granite", "granite", null},
                {"granite", "granite", null}
        };
        ingredients = new String[] {"granite"};
        itemArr.add(new CraftableItem.Builder("Polished Granite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/polished_granite")
                .build());
        // ================== Sandstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"sand", "sand", null},
                {"sand", "sand", null}
        };
        ingredients = new String[] {"sand"};
        itemArr.add(new CraftableItem.Builder("Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"sandstone"};
        itemArr.add(new CraftableItem.Builder("Smooth Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"sandstone_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"red_sandstone_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Red Sandstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"quartz", "cobblestone"};
        itemArr.add(new CraftableItem.Builder("Diorite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/diorite")
                .build());
        // ================== Polished Diorite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diorite", "diorite", null},
                {"diorite", "diorite", null}
        };
        ingredients = new String[] {"diorite"};
        itemArr.add(new CraftableItem.Builder("Polished Diorite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/polished_diorite")
                .build());
        // ================== Andesite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diorite", "cobblestone", null},
                {null, null, null}
        };
        ingredients = new String[] {"diorite", "cobblestone"};
        itemArr.add(new CraftableItem.Builder("Andesite")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/andesite")
                .build());
        // ================== Polished Andesite =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"andesite", "andesite", null},
                {"andesite", "andesite", null}
        };
        ingredients = new String[] {"andesite"};
        itemArr.add(new CraftableItem.Builder("Polished Andesite")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/polished_andesite")
                .build());
        // ================== Block of Gold =================== //
        tempLayout = new String[][] {
                {"gold_ingot", "gold_ingot", "gold_ingot"},
                {"gold_ingot", "gold_ingot", "gold_ingot"},
                {"gold_ingot", "gold_ingot", "gold_ingot"}
        };
        ingredients = new String[] {"gold_ingot"};
        itemArr.add(new CraftableItem.Builder("Block of Gold")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/gold_block")
                .build());
        // ================== Block of Iron =================== //
        tempLayout = new String[][] {
                {"iron_ingot", "iron_ingot", "iron_ingot"},
                {"iron_ingot", "iron_ingot", "iron_ingot"},
                {"iron_ingot", "iron_ingot", "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Block of Iron")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/iron_block")
                .build());
        // ================== Block of Diamond =================== //
        tempLayout = new String[][] {
                {"diamond", "diamond", "diamond"},
                {"diamond", "diamond", "diamond"},
                {"diamond", "diamond", "diamond"}
        };
        ingredients = new String[] {"diamond"};
        itemArr.add(new CraftableItem.Builder("Block of Diamond")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/diamond_block")
                .build());
        // ================== Bookshelf =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"book", "book", "book"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank", "book"};
        itemArr.add(new CraftableItem.Builder("Bookshelf")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"snow_ball"};
        itemArr.add(new CraftableItem.Builder("Snow Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/snow_block")
                .build());
        // ================== Clay Block =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"clay_ball", "clay_ball", null},
                {"clay_ball", "clay_ball", null}
        };
        ingredients = new String[] {"clay_ball"};
        itemArr.add(new CraftableItem.Builder("Clay Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/clay_block")
                .build());
        // ================== Jack o'Lantern =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "pumpkin", null},
                {null, "torch", null}
        };
        ingredients = new String[] {"pumpkin", "torch"};
        itemArr.add(new CraftableItem.Builder("Jack o'Lantern")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/jack_o_lantern")
                .build());
        // ================== Glowstone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"glowstone_dust", "glowstone_dust", null},
                {"glowstone_dust", "glowstone_dust", null}
        };
        ingredients = new String[] {"glowstone_dust"};
        itemArr.add(new CraftableItem.Builder("Glowstone")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/glowstone")
                .build());
        // ================== Block of Lapis Lazuli =================== //
        tempLayout = new String[][] {
                {"lapis", "lapis", "lapis"},
                {"lapis", "lapis", "lapis"},
                {"lapis", "lapis", "lapis"}
        };
        ingredients = new String[] {"lapis"};
        itemArr.add(new CraftableItem.Builder("Block of Lapis Lazuli")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/lapis_block")
                .build());
        // ================== Melon =================== //
        tempLayout = new String[][] {
                {"melon_slice", "melon_slice", "melon_slice"},
                {"melon_slice", "melon_slice", "melon_slice"},
                {"melon_slice", "melon_slice", "melon_slice"}
        };
        ingredients = new String[] {"melon_slice"};
        itemArr.add(new CraftableItem.Builder("Melon")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/melon")
                .build());
        // ================== Mossy Cobblestone =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"cobblestone", "vines", null},
                {null, null, null}
        };
        ingredients = new String[] {"cobblestone", "vines"};
        itemArr.add(new CraftableItem.Builder("Mossy Cobblestone")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/mossy_cobblestone")
                .build());
        // ================== Block of Emerald =================== //
        tempLayout = new String[][] {
                {"emerald", "emerald", "emerald"},
                {"emerald", "emerald", "emerald"},
                {"emerald", "emerald", "emerald"}
        };
        ingredients = new String[] {"emerald"};
        itemArr.add(new CraftableItem.Builder("Block of Emerald")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/emerald_block")
                .build());
        // ================== Stained Glass =================== //
        tempLayout = new String[][] {
                {"glass", "glass", "glass"},
                {"glass", "light_blue_dye", "glass"},
                {"glass", "glass", "glass"}
        };
        ingredients = new String[] {"glass", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Stained Glass")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(8)
                .looksLike("@drawable/light_blue_stained_glass")
                .describedAs("This recipe is valid for all colors of dye.")
                .build());
        // ================== Stairs =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", null, null},
                {"oak_wood_plank", "oak_wood_plank", null},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plans"};
        itemArr.add(new CraftableItem.Builder("Stairs")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
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
        ingredients = new String[] {"stone_brick", "vines"};
        itemArr.add(new CraftableItem.Builder("Mossy Stone Bricks")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/mossy_stone_brick")
                .build());
        // ================== Stone Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"stone", "stone", null},
                {"stone", "stone", null}
        };
        ingredients = new String[] {"stone_brick"};
        itemArr.add(new CraftableItem.Builder("Stone Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/stone_brick")
                .build());
        // ================== Chiseled Stone Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "stone_brick_slab", null},
                {null, "stone_brick_slab", null}
        };
        ingredients = new String[] {"stone_brick_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Stone Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/chiseled_stone_brick")
                .build());
        // ================== Nether Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"nether_brick", "nether_brick", null},
                {"nether_brick", "nether_brick", null}
        };
        ingredients = new String[] {"nether_brick"};
        itemArr.add(new CraftableItem.Builder("Nether Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/nether_bricks")
                .build());
        // ================== Red Nether Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"nether_wart", "nether_brick", null},
                {"nether_brick", "nether_wart", null}
        };
        ingredients = new String[] {"nether_brick", "nether_wart"};
        itemArr.add(new CraftableItem.Builder("Red Nether Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/red_nether_bricks")
                .build());
        // ================== Hay Bale =================== //
        tempLayout = new String[][] {
                {"wheat", "wheat", "wheat"},
                {"wheat", "wheat", "wheat"},
                {"wheat", "wheat", "wheat"}
        };
        ingredients = new String[] {"wheat"};
        itemArr.add(new CraftableItem.Builder("Hay Bale")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/hay_bale")
                .build());
        // ================== Stained Clay =================== //
        tempLayout = new String[][] {
                {"hardened_clay", "hardened_clay", "hardened_clay"},
                {"hardened_clay", "light_blue_dye", "hardened_clay"},
                {"hardened_clay", "hardened_clay", "hardened_clay"}
        };
        ingredients = new String[] {"hardened_clay", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Stained Clay")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(8)
                .describedAs("This recipe is valid for all colors of dye")
                .looksLike("@drawable/light_blue_hardened_clay")
                .build());
        // ================== Block of Coal =================== //
        tempLayout = new String[][] {
                {"coal", "coal", "coal"},
                {"coal", "coal", "coal"},
                {"coal", "coal", "coal"}
        };
        ingredients = new String[] {"coal"};
        itemArr.add(new CraftableItem.Builder("Block of Coal")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/coal_block")
                .build());
        // ================== Prismarine =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"prismarine_shard", "prismarine_shard", null},
                {"prismarine_shard", "prismarine_shard", null}
        };
        ingredients = new String[] {"prismarine_shard"};
        itemArr.add(new CraftableItem.Builder("Prismarine")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/prismarine")
                .build());
        // ================== Prismarine Bricks =================== //
        tempLayout = new String[][] {
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"},
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"},
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"}
        };
        ingredients = new String[] {"prismarine_shard"};
        itemArr.add(new CraftableItem.Builder("Prismarine Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/prismarine_bricks")
                .build());
        // ================== Dark Prismarine =================== //
        tempLayout = new String[][] {
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"},
                {"prismarine_shard", "ink_sac", "prismarine_shard"},
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"}
        };
        ingredients = new String[] {"prismarine_shard", "ink_sac"};
        itemArr.add(new CraftableItem.Builder("Dark Prismarine")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/dark_prismarine")
                .build());
        // ================== Coarse Dirt =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"dirt", "gravel", null},
                {"gravel", "dirt", null}
        };
        ingredients = new String[] {"dirt", "gravel"};
        itemArr.add(new CraftableItem.Builder("Coarse Dirt")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .looksLike("@drawable/coarse_dirt")
                .build());
        // ================== Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"brick", "brick", null},
                {"brick", "brick", null}
        };
        ingredients = new String[] {"brick"};
        itemArr.add(new CraftableItem.Builder("Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/bricks")
                .build());
        // ================== Purpur Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"popped_chorus_fruit", "popped_chorus_fruit", null},
                {"popped_chorus_fruit", "popped_chorus_fruit", null}
        };
        ingredients = new String[] {"popped_chorus_fruit"};
        itemArr.add(new CraftableItem.Builder("Purpur Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .looksLike("@drawable/purpur_bricks")
                .build());
        // ================== Purpur Pillar =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "purpur_slab", null},
                {null, "purpur_slab", null}
        };
        ingredients = new String[] {"purpur_slabr"};
        itemArr.add(new CraftableItem.Builder("Purpur Pillar")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/purpur_pillar")
                .build());
        // ================== Magma Block =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"magma_cream", "magma_cream", null},
                {"magma_cream", "magma_cream", null}
        };
        ingredients = new String[] {"magma_cream"};
        itemArr.add(new CraftableItem.Builder("Magma Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/magma_block")
                .build());
        // ================== Bone Block =================== //
        tempLayout = new String[][] {
                {"bonemeal", "bonemeal", "bonemeal"},
                {"bonemeal", "bonemeal", "bonemeal"},
                {"bonemeal", "bonemeal", "bonemeal"}
        };
        ingredients = new String[] {"bonemeal"};
        itemArr.add(new CraftableItem.Builder("Bone Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/bone_block")
                .build());
        // ================== Nether Wart Block =================== //
        tempLayout = new String[][] {
                {"nether_wart", "nether_wart", "nether_wart"},
                {"nether_wart", "nether_wart", "nether_wart"},
                {"nether_wart", "nether_wart", "nether_wart"}
        };
        ingredients = new String[] {"nether_wart"};
        itemArr.add(new CraftableItem.Builder("Nether Wart Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/nether_wart_block")
                .build());
        // ================== Wool =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"string", "string", null},
                {"string", "string", null}
        };
        ingredients = new String[] {"string"};
        itemArr.add(new CraftableItem.Builder("Wool")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/wool")
                .build());
        // ================== Dyed Wool =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"wool", "light_blue_dye", null},
                {null, null, null}
        };
        ingredients = new String[] {"wool", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Dyed Wool")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all colors of dye.")
                .looksLike("@drawable/light_blue_wool")
                .build());
        // ================== Sea Lantern =================== //
        tempLayout = new String[][] {
                {"prismarine_shard", "prismarine_crystals", "prismarine_shard"},
                {"prismarine_crystals", "prismarine_crystals", "prismarine_crystals"},
                {"prismarine_shard", "prismarine_crystals", "prismarine_shard"}
        };
        ingredients = new String[] {"prismarine_shard", "prismarine_crystals"};
        itemArr.add(new CraftableItem.Builder("Sea Lantern")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/sea_lantern")
                .build());
        // ================================================= //
        // =============== Decoration Blocks =============== //
        // ================================================= //

        // ================== Enchanting Table =================== //
        tempLayout = new String[][] {
                {null, "book", null},
                {"diamond", "obsidian", "diamond"},
                {"obsidian", "obsidian", "obsidian"}
        };
        ingredients = new String[] {"diamond", "obsidian", "book"};
        itemArr.add(new CraftableItem.Builder("Enchanting Table")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/enchanting_table")
                .build());
        // ================== Painting =================== //
        tempLayout = new String[][] {
                {"stick", "stick", "stick"},
                {"stick", "light_blue_wool", "stick"},
                {"stick", "stick", "stick"}
        };
        ingredients = new String[] {"stick", "light_blue_wool"};
        itemArr.add(new CraftableItem.Builder("Painting")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/painting")
                .build());
        // ================== Torch =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "coal", null},
                {null, "stick", null}
        };
        ingredients = new String[] {"stick", "light_blue_wool"};
        itemArr.add(new CraftableItem.Builder("Torch")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .describedAs("This recipe is valid for both coal and charcoal.")
                .looksLike("@drawable/torch")
                .build());
        // ================== Crafting Table =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"oak_wood_plank", "oak_wood_plank", null},
                {"oak_wood_plank", "oak_wood_plank", null}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Crafting Table")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for any type of wood.")
                .looksLike("@drawable/crafting_table")
                .build());
        // ================== Ladder =================== //
        tempLayout = new String[][] {
                {"stick", null, "stick"},
                {"stick", "stick", "stick"},
                {"stick", null, "stick"}
        };
        ingredients = new String[] {"stick"};
        itemArr.add(new CraftableItem.Builder("Ladder")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is valid for any type of wood.")
                .looksLike("@drawable/ladder")
                .build());
        // ================== Snow =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, null, null},
                {"snow_block", "snow_block", "snow_block"}
        };
        ingredients = new String[] {"snow_block"};
        itemArr.add(new CraftableItem.Builder("Snow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(6)
                .looksLike("@drawable/snow")
                .build());
        // ================== Jukebox =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", "diamond", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank", "diamond"};
        itemArr.add(new CraftableItem.Builder("Jukebox")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for any type of wood.")
                .looksLike("@drawable/jukebox")
                .build());
        // ================== Iron Bars =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"iron_ingot", "iron_ingot", "iron_ingot"},
                {"iron_ingot", "iron_ingot", "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Iron Bars")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(16)
                .looksLike("@drawable/iron_bars")
                .build());
        // ================== Wood Fence =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"oak_wood_plank", "stick", "oak_wood_plank"},
                {"oak_wood_plank", "stick", "oak_wood_plank"}
        };
        ingredients = new String[] {"stick", "oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Wood Fence")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is valid for all types of wood.")
                .looksLike("@drawable/oak_fence")
                .build());
        // ================== Nether Brick Fence =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"nether_brick", "nether_brick", "nether_brick"},
                {"nether_brick", "nether_brick", "nether_brick"}
        };
        ingredients = new String[] {"nether_brick"};
        itemArr.add(new CraftableItem.Builder("Nether Brick Fence")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(6)
                .looksLike("@drawable/nether_brick_fence")
                .build());
        // ================== Glass Pane =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"glass", "glass", "glass"},
                {"glass", "glass", "glass"}
        };
        ingredients = new String[] {"glass"};
        itemArr.add(new CraftableItem.Builder("Glass Pane")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(16)
                .describedAs("This recipe is valid for all colors of glass.")
                .looksLike("@drawable/glass_pane")
                .build());
        // ================== End Crystal =================== //
        tempLayout = new String[][] {
                {"glass", "glass", "glass"},
                {"glass", "eye_of_ender", "glass"},
                {"glass", "ghast_tear", "glass"}
        };
        ingredients = new String[] {"glass", "eye_of_ender", "ghast_tear"};
        itemArr.add(new CraftableItem.Builder("End Crystal")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/end_crystal")
                .build());
        // ================== Ender Chest =================== //
        tempLayout = new String[][] {
                {"obsidian", "obsidian", "obsidian"},
                {"obsidian", "eye_of_ender", "obsidian"},
                {"obsidian", "obsidian", "obsidian"}
        };
        ingredients = new String[] {"obsidian", "eye_of_ender"};
        itemArr.add(new CraftableItem.Builder("Ender Chest")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/ender_chest")
                .build());
        // ================== Chest =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", null, "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Chest")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood.")
                .looksLike("@drawable/chest") //This image has a white background for some reason
                .build());
        // ================== Sign =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {null, "stick", null}
        };
        ingredients = new String[] {"oak_wood_plank", "stick"};
        itemArr.add(new CraftableItem.Builder("Sign")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is valid for all types of wood.")
                .looksLike("@drawable/sign")
                .build());
        // ================== Item Frame =================== //
        tempLayout = new String[][] {
                {"stick", "stick", "stick"},
                {"stick", "leather", "stick"},
                {"stick", "stick", "stick"}
        };
        ingredients = new String[] {"leather", "stick"};
        itemArr.add(new CraftableItem.Builder("Item Frame")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/item_frame")
                .build());
        // ================== Cobblestone Wall =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"cobblestone", "cobblestone", "cobblestone"},
                {"cobblestone", "cobblestone", "cobblestone"}
        };
        ingredients = new String[] {"cobblestone"};
        itemArr.add(new CraftableItem.Builder("Cobblestone Wall")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(6)
                .describedAs("This recipe is valid for mossy cobblestone as well.")
                .looksLike("@drawable/cobblestone_fence")
                .build());
        // ================== Flower Pot =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"brick", null, "brick"},
                {null, "brick", null}
        };
        ingredients = new String[] {"brick"};
        itemArr.add(new CraftableItem.Builder("Flower Pot")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/flower_pot")
                .build());
        // ================== Trapped Chest =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "tripwire_hook", "chest"},
                {null, null, null}
        };
        ingredients = new String[] {"chest", "tripwire_hook"};
        itemArr.add(new CraftableItem.Builder("Trapped Chest")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/trapped_chest")
                .build());
        // ================== Bed =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"wool", "wool", "wool"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank", "wool"};
        itemArr.add(new CraftableItem.Builder("Bed")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for any type of wood and any color of wool.")
                .looksLike("@drawable/bed")
                .build());
        // ================== Slime Block =================== //
        tempLayout = new String[][] {
                {"slime_ball", "slime_ball", "slime_ball"},
                {"slime_ball", "slime_ball", "slime_ball"},
                {"slime_ball", "slime_ball", "slime_ball"}
        };
        ingredients = new String[] {"slime_ball"};
        itemArr.add(new CraftableItem.Builder("Slime Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/slime_block")
                .build());
        // ================== Armor Stand =================== //
        tempLayout = new String[][] {
                {"stick", "stick", "stick"},
                {null, "stick", null},
                {"stick", "stone_slab", "stick"}
        };
        ingredients = new String[] {"stick", "stone_slab"};
        itemArr.add(new CraftableItem.Builder("Armor Stand")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/armor_stand")
                .build());
        // ================== Furnace =================== //
        tempLayout = new String[][] {
                {"cobblestone", "cobblestone", "cobblestone"},
                {"cobblestone", null, "cobblestone"},
                {"cobblestone", "cobblestone", "cobblestone"}
        };
        ingredients = new String[] {"cobblestone"};
        itemArr.add(new CraftableItem.Builder("Furnace")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/furnace")
                .build());
        // ================== Carpet =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, null, null},
                {"wool", "wool", null}
        };
        ingredients = new String[] {"wool"};
        itemArr.add(new CraftableItem.Builder("Carpet")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is valid for all colors of wool.")
                .looksLike("@drawable/carpet")
                .build());
        // ================== Anvil =================== //
        tempLayout = new String[][] {
                {"iron_block", "iron_block", "iron_block"},
                {null, "iron_ingot", null},
                {"iron_ingot", "iron_ingot", "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Anvil")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/anvil")
                .build());
        // ================== End Rod =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "blaze_rod", null},
                {null, "popped_chorus_fruit", null}
        };
        ingredients = new String[] {"blaze_rod", "popped_chorus_fruit"};
        itemArr.add(new CraftableItem.Builder("End Rod")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .looksLike("@drawable/end_rod")
                .build());
        // ================== Shulker Box =================== //
        tempLayout = new String[][] {
                {null, "shulker_shell", null},
                {null, "chest", null},
                {null, "shulker_shell", null}
        };
        ingredients = new String[] {"chest", "shulker_shell"};
        itemArr.add(new CraftableItem.Builder("Shulker Box")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/purple_shulker_box")
                .build());
        // ================== Colored Shulker Box =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"purple_shulker_box", "light_blue_dye", null},
                {null, null, null}
        };
        ingredients = new String[] {"purple_shulker_box", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Colored Shulker Box")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all colors of dye.")
                .looksLike("@drawable/light_blue_shulker_box")
                .build());
        // ================== Banner =================== //
        tempLayout = new String[][] {
                {"wool", "wool", "wool"},
                {"wool", "wool", "wool"},
                {null, "stick", null}
        };
        ingredients = new String[] {"wool", "stick"};
        itemArr.add(new CraftableItem.Builder("Banner")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all colors of wool. To copy a banner, place the original and another banner of the same base color in the crafting interface.")
                .looksLike("@drawable/banner")
                .build());
        // ================================================= //
        // ==================== Redstone =================== //
        // ================================================= //

        // ================== Lever =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "stick", null},
                {null, "cobblestone", null}
        };
        ingredients = new String[] {"cobblestone", "stick"};
        itemArr.add(new CraftableItem.Builder("Lever")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/lever")
                .build());
        // ================== Button =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "stone", null},
                {null, null, null}
        };
        ingredients = new String[] {"stone"};
        itemArr.add(new CraftableItem.Builder("Button")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood as well.")
                .looksLike("@drawable/stone_button")
                .build());
        // ================== Pressure Plate =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"stone", "stone", null},
                {null, null, null}
        };
        ingredients = new String[] {"stone"};
        itemArr.add(new CraftableItem.Builder("Pressure Plate")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood as well. Note: A Stone plate is activated only by mobs, while a wooden one is also activated by items and provides signal for >1 second.")
                .looksLike("@drawable/stone_pressure_plate")
                .build());
        // ================== Redstone Torch =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "redstone_dust", null},
                {null, "stick", null}
        };
        ingredients = new String[] {"stick"};
        itemArr.add(new CraftableItem.Builder("Redstone Torch")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/redstone_torch")
                .build());
        // ================== Note Block =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", "redstone_dust", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Note Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood.")
                .looksLike("@drawable/note_block")
                .build());
        // ================== Fence Gate =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"stick", "oak_wood_plank", "stick"},
                {"stick", "oak_wood_plank", "stick"}
        };
        ingredients = new String[] {"oak_wood_plank", "stick"};
        itemArr.add(new CraftableItem.Builder("Fence Gate")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood. This gate can also be opened via a redstone pulse.")
                .looksLike("@drawable/fence_gate")
                .build());
        // ================== Trapdoor =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Trapdoor")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is valid for Iron and all types of wood. This trapdoor can also be opened via a redstone pulse.")
                .looksLike("@drawable/trapdoor")
                .build());
        // ================== Redstone Dust =================== //
        tempLayout = new String[][] {
                {"redstone_dust", "redstone_dust", "redstone_dust"},
                {"redstone_dust", "redstone_dust", "redstone_dust"},
                {"redstone_dust", "redstone_dust", "redstone_dust"}
        };
        ingredients = new String[] {"redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Redstone Dust")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/redstone_dust")
                .build());
        // ================== Weighted Pressure Plate (Heavy) =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"iron_ingot", "iron_ingot", null},
                {null, null, null}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Weighted Pressure Plate (Heavy)")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/weighted_pressure_plate_heavy")
                .build());
        // ================== Weighted Pressure Plate (Light) =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"gold_ingot", "gold_ingot", null},
                {null, null, null}
        };
        ingredients = new String[] {"gold_ingot"};
        itemArr.add(new CraftableItem.Builder("Weighted Pressure Plate (Light)")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/weighted_pressure_plate_light")
                .build());
        // ================== Redstone Repeater =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"redstone_torch", "redstone_dust", "redstone_torch"},
                {"stone", "stone", "stone"}
        };
        ingredients = new String[] {"stone", "redstone_dust", "redstone_torch"};
        itemArr.add(new CraftableItem.Builder("Redstone Repeater")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/repeater")
                .build());
        // ================== Hopper =================== //
        tempLayout = new String[][] {
                {"iron_ingot", null, "iron_ingot"},
                {"iron_ingot", "chest", "iron_ingot"},
                {null, "iron_ingot", null}
        };
        ingredients = new String[] {"iron_ingot", "chest"};
        itemArr.add(new CraftableItem.Builder("Hopper")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/hopper")
                .build());
        // ================== Redstone Lamp =================== //
        tempLayout = new String[][] {
                {null, "redstone_dust", null},
                {"redstone_dust", "glowstone", "redstone_dust"},
                {null, "redstone_dust", null}
        };
        ingredients = new String[] {"glowstone", "redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Redstone Lamp")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/redstone_lamp")
                .build());
        // ================== Daylight Sensor =================== //
        tempLayout = new String[][] {
                {"glass", "glass", "glass"},
                {"quartz", "quartz", "quartz"},
                {"oak_wood_slab", "oak_wood_slab", "oak_wood_slab"}
        };
        ingredients = new String[] {"glass", "quartz", "oak_wood_slab"};
        itemArr.add(new CraftableItem.Builder("Daylight Sensor")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood.")
                .looksLike("@drawable/daylight_sensor")
                .build());
        // ================== Door =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", null},
                {"oak_wood_plank", "oak_wood_plank", null},
                {"oak_wood_plank", "oak_wood_plank", null}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Door")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is valid for Iron and all types of wood. Note: Doors can be opened via a redstone pulse.")
                .looksLike("@drawable/oak_wood_door")
                .build());
        // ================== Dispenser =================== //
        tempLayout = new String[][] {
                {"cobblestone", "cobblestone", "cobblestone"},
                {"cobblestone", "bow", "cobblestone"},
                {"cobblestone", "redstone_dust", "cobblestone"}
        };
        ingredients = new String[] {"cobblestone", "bow", "redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Dispenser")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/dispenser")
                .build());
        // ================== Piston =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"cobblestone", "iron_ingot", "cobblestone"},
                {"cobblestone", "redstone_dust", "cobblestone"}
        };
        ingredients = new String[] {"oak_wood_plank", "iron_ingot", "redstone_dust", "cobblestone"};
        itemArr.add(new CraftableItem.Builder("Piston")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/piston")
                .build());
        // ================== Sticky Piston =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "slime_ball", null},
                {null, "piston", null}
        };
        ingredients = new String[] {"slime_ball", "piston"};
        itemArr.add(new CraftableItem.Builder("Sticky Piston")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/sticky_piston")
                .build());
        // ================== Comparator =================== //
        tempLayout = new String[][] {
                {null, "redstone_torch", null},
                {"redstone_torch", "quartz", "redstone_torch"},
                {"stone", "stone", "stone"}
        };
        ingredients = new String[] {"redstone_torch", "piston", "stone"};
        itemArr.add(new CraftableItem.Builder("Comparator")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/comparator")
                .build());
        // ================== TNT =================== //
        tempLayout = new String[][] {
                {"gunpowder", "sand", "gunpowder"},
                {"sand", "gunpowder", "sand"},
                {"gunpowder", "sand", "gunpowder"}
        };
        ingredients = new String[] {"gunpowder", "sand"};
        itemArr.add(new CraftableItem.Builder("TNT")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for red sand as well.")
                .looksLike("@drawable/tnt")
                .build());
        // ================== Observer =================== //
        tempLayout = new String[][] {
                {"cobblestone", "cobblestone", "cobblestone"},
                {"redstone_dust", "redstone_dust", "quartz"},
                {"cobblestone", "cobblestone", "cobblestone"}
        };
        ingredients = new String[] {"cobblestone", "redstone_dust", "quartz"};
        itemArr.add(new CraftableItem.Builder("Observer")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/observer")
                .build());
        // ================================================= //
        // ================= Transportation ================ //
        // ================================================= //

        // ================== Carrot on a Stick =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"fishing_rod", null, null},
                {null, "carrot", null}
        };
        ingredients = new String[] {"fishing_rod", "carrot"};
        itemArr.add(new CraftableItem.Builder("Carrot on a Stick")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/carrot_on_stick")
                .build());
        // ================== Rail =================== //
        tempLayout = new String[][] {
                {"iron_ingot", null, "iron_ingot"},
                {"iron_ingot", "stick", "iron_ingot"},
                {"iron_ingot", null, "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot", "stick"};
        itemArr.add(new CraftableItem.Builder("Rail")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(16)
                .looksLike("@drawable/rail")
                .build());
        // ================== Minecart with Chest =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "chest", null},
                {null, "minecart", null}
        };
        ingredients = new String[] {"chest", "minecart"};
        itemArr.add(new CraftableItem.Builder("Minecart with Chest")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/minecart_with_chest")
                .build());
        // ================== Powered Rail =================== //
        tempLayout = new String[][] {
                {"gold_ingot", null, "gold_ingot"},
                {"gold_ingot", "stick", "gold_ingot"},
                {"gold_ingot", "redstone_dust", "gold_ingot"}
        };
        ingredients = new String[] {"redstone_dust", "stick", "gold_ingot"};
        itemArr.add(new CraftableItem.Builder("Powered Rail")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(6)
                .looksLike("@drawable/powered_rail")
                .build());
        // ================== Detector Rail =================== //
        tempLayout = new String[][] {
                {"iron_ingot", null, "iron_ingot"},
                {"iron_ingot", "stone_pressure_plate", "iron_ingot"},
                {"iron_ingot", "redstone_dust", "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot", "stone_pressure_plate", "redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Detector Rail")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(6)
                .looksLike("@drawable/detector_rail")
                .build());
        // ================== Minecart =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"iron_ingot", null, "iron_ingot"},
                {"iron_ingot", "iron_ingot", "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Minecart")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/minecart")
                .build());
        // ================== Minecart with TNT =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "tnt", null},
                {null, "minecart", null}
        };
        ingredients = new String[] {"minecart", "tnt"};
        itemArr.add(new CraftableItem.Builder("Minecart with TNT")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/minecart_with_tnt")
                .build());
        // ================== Activator Rail =================== //
        tempLayout = new String[][] {
                {"iron_ingot", "stick", "iron_ingot"},
                {"iron_ingot", "redstone_torch", "iron_ingot"},
                {"iron_ingot", "stick", "iron_ingot"}
        };
        ingredients = new String[] {"iron_ingot", "stick", "redstone_torch"};
        itemArr.add(new CraftableItem.Builder("Activator Rail")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(6)
                .looksLike("@drawable/activator_rail")
                .build());
        // ================== Minecart with Hopper =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "hopper", null},
                {null, "minecart", null}
        };
        ingredients = new String[] {"hopper", "minecart"};
        itemArr.add(new CraftableItem.Builder("Minecart with Hopper")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/minecart_with_hopper")
                .build());
        // ================== Boat =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"oak_wood_plank", null, "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Boat")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all types of wood.")
                .looksLike("@drawable/boat")
                .build());
        // ================== Minecart with Furnace =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "furnace", null},
                {null, "minecart", null}
        };
        ingredients = new String[] {"minecart", "furnace"};
        itemArr.add(new CraftableItem.Builder("Minecart with Furnace")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/minecart_with_furnace")
                .build());
        // ================================================= //
        // =================== Foodstuffs ================== //
        // ================================================= //

        // ================== Mushroom Stew =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"red_mushroom", "brown_mushroom", null},
                {null, "bowl", null}
        };
        ingredients = new String[] {"red_mushroom", "brown_mushroom", "bowl"};
        itemArr.add(new CraftableItem.Builder("Mushroom Stew")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/mushroom_soup")
                .build());
        // ================== Bread =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"wheat", "wheat", "wheat"},
                {null, null, null}
        };
        ingredients = new String[] {"wheat"};
        itemArr.add(new CraftableItem.Builder("Bread")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/bread")
                .build());
        // ================== Cookie =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"wheat", "cocoa_beans", "wheat"},
                {null, null, null}
        };
        ingredients = new String[] {"wheat", "cocoa_beans"};
        itemArr.add(new CraftableItem.Builder("Cookie")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(8)
                .looksLike("@drawable/cookie")
                .build());
        // ================== Golden Carrot =================== //
        tempLayout = new String[][] {
                {"gold_nugget", "gold_nugget", "gold_nugget"},
                {"gold_nugget", "carrot", "gold_nugget"},
                {"gold_nugget", "gold_nugget", "gold_nugget"}
        };
        ingredients = new String[] {"carrot", "gold_nugget"};
        itemArr.add(new CraftableItem.Builder("Golden Carrot")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/golden_carrot")
                .build());
        // ================== Pumpkin Pie =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"pumpkin", "sugar", null},
                {null, "egg", null}
        };
        ingredients = new String[] {"sugar", "egg", "pumpkin"};
        itemArr.add(new CraftableItem.Builder("Pumpkin Pie")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/pumpkin_pie")
                .build());
        // ================== Cake =================== //
        tempLayout = new String[][] {
                {"milk", "milk", "milk"},
                {"sugar", "egg", "sugar"},
                {"wheat", "wheat", "wheat"}
        };
        ingredients = new String[] {"sugar", "egg", "milk", "wheat"};
        itemArr.add(new CraftableItem.Builder("Cake")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/cake")
                .build());
        // ================== Rabbit Stew =================== //
        tempLayout = new String[][] {
                {null, "cooked_rabbit", null},
                {"carrot", "baked_potato", "red_mushroom"},
                {null, "bowl", null}
        };
        ingredients = new String[] {"carrot", "bowl", "cooked_rabbit", "red_mushroom", "baked_potato"};
        itemArr.add(new CraftableItem.Builder("Rabbit Stew")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/rabbit_stew")
                .build());
        // ================== Golden Apple =================== //
        tempLayout = new String[][] {
                {"gold_ingot", "gold_ingot", "gold_ingot"},
                {"gold_ingot", "apple", "gold_ingot"},
                {"gold_ingot", "gold_ingot", "gold_ingot"}
        };
        ingredients = new String[] {"gold_ingot", "apple"};
        itemArr.add(new CraftableItem.Builder("Golden Apple")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/golden_apple")
                .build());
        // ================================================= //
        // ====================== Tools ==================== //
        // ================================================= //

        // ================== Flint and Steel =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"iron_ingot", "flint", null},
                {null, null, null}
        };
        ingredients = new String[] {"iron_ingot", "flint"};
        itemArr.add(new CraftableItem.Builder("Flint and Steel")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/flint_and_steel")
                .build());
        // ================== Pickaxe =================== //
        tempLayout = new String[][] {
                {"diamond", "diamond", "diamond"},
                {null, "stick", null},
                {null, "stick", null}
        };
        ingredients = new String[] {"diamond", "stick"};
        itemArr.add(new CraftableItem.Builder("Pickaxe")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for Iron, all wood, Gold, and Cobblestone.")
                .looksLike("@drawable/diamond_pickaxe")
                .build());
        // ================== Shovel =================== //
        tempLayout = new String[][] {
                {null, "diamond", null},
                {null, "stick", null},
                {null, "stick", null}
        };
        ingredients = new String[] {"diamond", "stick"};
        itemArr.add(new CraftableItem.Builder("Shovel")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for Iron, all wood, Gold, and Cobblestone.")
                .looksLike("@drawable/diamond_shovel")
                .build());
        // ================== Shears =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "iron_ingot", null},
                {"iron_ingot", null, null}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Shears")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/shears")
                .build());
        // ================== Hoe =================== //
        tempLayout = new String[][] {
                {null, "diamond", null},
                {null, "stick", null},
                {null, "stick", null}
        };
        ingredients = new String[] {"diamond", "stick"};
        itemArr.add(new CraftableItem.Builder("Hoe")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for Iron, all wood, Gold, and Cobblestone.")
                .looksLike("@drawable/diamond_hoe")
                .build());
        // ================== Fishing Rod =================== //
        tempLayout = new String[][] {
                {null, null, "stick"},
                {null, "stick", "string"},
                {"stick", "string", "string"}
        };
        ingredients = new String[] {"stick", "diamond"};
        itemArr.add(new CraftableItem.Builder("Fishing Rod")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/fishing_rod")
                .build());
        // ================== Axe =================== //
        tempLayout = new String[][] {
                {null, "diamond", "diamond"},
                {null, "stick", "diamond"},
                {null, "stick", null}
        };
        ingredients = new String[] {"stick", "diamond"};
        itemArr.add(new CraftableItem.Builder("Axe")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for Iron, all wood planks, Gold, and Cobblestone.")
                .looksLike("@drawable/diamond_axe")
                .build());
        // ================== Clock =================== //
        tempLayout = new String[][] {
                {null, "gold_ingot", null},
                {"gold_ingot", "redstone_dust", "gold_ingot"},
                {null, "gold_ingot", null}
        };
        ingredients = new String[] {"gold_ingot", "redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Clock")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/clock")
                .build());
        // ================== Compass =================== //
        tempLayout = new String[][] {
                {null, "iron_ingot", null},
                {"iron_ingot", "redstone_dust", "iron_ingot"},
                {null, "iron_ingot", null}
        };
        ingredients = new String[] {"iron_ingot", "redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Compass")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/compass")
                .build());
        // ================== Lead =================== //
        tempLayout = new String[][] {
                {"string", "string", null},
                {"string", "slime_ball", null},
                {null, null, "string"}
        };
        ingredients = new String[] {"string", "slime_ball"};
        itemArr.add(new CraftableItem.Builder("Lead")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(2)
                .looksLike("@drawable/lead")
                .build());
        // ================== Sword =================== //
        tempLayout = new String[][] {
                {null, "diamond", null},
                {null, "diamond", null},
                {null, "stick", null}
        };
        ingredients = new String[] {"stick", "diamond"};
        itemArr.add(new CraftableItem.Builder("Sword")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for all wood planks, Cobblestone, Iron, Gold, and Diamond.")
                .looksLike("@drawable/sword_diamond")
                .build());
        // ================== Helmet =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diamond", "diamond", "diamond"},
                {"diamond", null, "diamond"}
        };
        ingredients = new String[] {"diamond"};
        itemArr.add(new CraftableItem.Builder("Helmet")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for leather, Iron, Gold, and Diamond")
                .looksLike("@drawable/helmet_diamond")
                .build());
        // ================== Chestplate =================== //
        tempLayout = new String[][] {
                {"diamond", null, "diamond"},
                {"diamond", "diamond", "diamond"},
                {"diamond", "diamond", "diamond"}
        };
        ingredients = new String[] {"diamond"};
        itemArr.add(new CraftableItem.Builder("Chestplate")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for leather, Iron, Gold, and Diamond")
                .looksLike("@drawable/chestplate_diamond")
                .build());
        // ================== Leggingredients =================== //
        tempLayout = new String[][] {
                {"diamond", "diamond", "diamond"},
                {"diamond", null, "diamond"},
                {"diamond", null, "diamond"}
        };
        ingredients = new String[] {"diamond"};
        itemArr.add(new CraftableItem.Builder("Leggingredients")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for leather, Iron, Gold, and Diamond")
                .looksLike("@drawable/leggingredients_diamond")
                .build());
        // ================== Boots =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"diamond", null, "diamond"},
                {"diamond", null, "diamond"}
        };
        ingredients = new String[] {"diamond"};
        itemArr.add(new CraftableItem.Builder("Boots")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for leather, Iron, Gold, and Diamond")
                .looksLike("@drawable/boots_diamond")
                .build());
        // ================== Bow =================== //
        tempLayout = new String[][] {
                {null, "stick", "string"},
                {"stick", null, "string"},
                {null, "stick", "string"}
        };
        ingredients = new String[] {"stick", "string"};
        itemArr.add(new CraftableItem.Builder("Bow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/bow")
                .build());
        // ================== Shield =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "iron_ingot", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {null, "oak_wood_plank", null}
        };
        ingredients = new String[] {"oak_wood_plank", "iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Shield")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("This recipe is valid for any combinations of types of wood planks.")
                .looksLike("@drawable/shield")
                .build());
        // ================== Arrow =================== //
        tempLayout = new String[][] {
                {null, "flint", null},
                {null, "stick", null},
                {null, "feather", null}
        };
        ingredients = new String[] {"flint", "stick", "feather"};
        itemArr.add(new CraftableItem.Builder("Arrow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .looksLike("@drawable/arrow")
                .build());
        // ================== Spectral Arrow =================== //
        tempLayout = new String[][] {
                {null, "glowstone_dust", null},
                {"glowstone_dust", "arrow", "glowstone_dust"},
                {null, "glowstone_dust", null}
        };
        ingredients = new String[] {"arrow", "glowstone_dust"};
        itemArr.add(new CraftableItem.Builder("Spectral Arrow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(2)
                .describedAs("This recipe is valid for any combinations of types of wood planks.")
                .looksLike("@drawable/arrow_spectral")
                .build());
        // ================== Tipped Arrow =================== //
        tempLayout = new String[][] {
                {"arrow", "arrow", "arrow"},
                {"arrow", "water_bottle", "arrow"},
                {"arrow", "arrow", "arrow"}
        };
        ingredients = new String[] {"arrow", "water_bottle"};
        itemArr.add(new CraftableItem.Builder("Tipped Arrow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(8)
                .describedAs("This recipe is valid for any Lingering Potion.")
                .looksLike("@drawable/arrow")
                .build());
        // ================== Wheat =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "hay_bale", null},
                {null, null, null}
        };
        ingredients = new String[] {"hay_bale"};
        itemArr.add(new CraftableItem.Builder("Wheat")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/wheat")
                .build());
        // ================== Bowl =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"oak_wood_plank", null, "oak_wood_plank"},
                {null, "oak_wood_plank", null}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Bowl")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .looksLike("@drawable/bowl")
                .build());
        // ================== Coal =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "coal_block", null},
                {null, null, null}
        };
        ingredients = new String[] {"coal_block"};
        itemArr.add(new CraftableItem.Builder("Coal")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/coal")
                .build());
        // ================== Sugar =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "sugar_cane", null},
                {null, null, null}
        };
        ingredients = new String[] {"sugar_cane"};
        itemArr.add(new CraftableItem.Builder("Sugar")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/sugar")
                .build());
        // ================== Leather =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"rabbit_hide", "rabbit_hide", null},
                {"rabbit_hide", "rabbit_hide", null}
        };
        ingredients = new String[] {"rabbit_hide"};
        itemArr.add(new CraftableItem.Builder("Leather")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/leather")
                .build());
        // ================== Dandelion Yellow =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "dandelion", null},
                {null, null, null}
        };
        ingredients = new String[] {"dandelion"};
        itemArr.add(new CraftableItem.Builder("Dandelion Yellow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Dandelion Yellow can also be crafted from one Sunflower (yields 2).")
                .looksLike("@drawable/dandelion_yellow")
                .build());
        // ================== Gray Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"ink_sac", "bonemeal", null},
                {null, null, null}
        };
        ingredients = new String[] {"ink_sac", "bonemeal"};
        itemArr.add(new CraftableItem.Builder("Gray Dye")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(2)
                .looksLike("@drawable/gray_dye")
                .build());
        // ================== Pumpkin Seeds =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "pumpkin", null},
                {null, null, null}
        };
        ingredients = new String[] {"pumpkin"};
        itemArr.add(new CraftableItem.Builder("Pumpkin Seeds")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .looksLike("@drawable/pumpkin_seeds")
                .build());
        // ================== Gold Nugget =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "gold_ingot", null},
                {null, null, null}
        };
        ingredients = new String[] {"gold_ingot"};
        itemArr.add(new CraftableItem.Builder("Gold Nugget")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/gold_nugget")
                .build());
        // ================== Gold Ingot =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "gold_block", null},
                {null, null, null}
        };
        ingredients = new String[] {"gold_block"};
        itemArr.add(new CraftableItem.Builder("Gold Ingot")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .describedAs("Gold ingots can also be crafted using a full crafting interface of, or 9, gold nuggets.")
                .looksLike("@drawable/gold_ingot")
                .build());
        // ================== Rose Red =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "red_tulip", null},
                {null, null, null}
        };
        ingredients = new String[] {"red_tulip"};
        itemArr.add(new CraftableItem.Builder("Rose Red")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Rose Red can also be crafted from one Poppy, Beetroot, or Rose Bush (yields 2)")
                .looksLike("@drawable/rose_red")
                .build());
        // ================== Orange Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "orange_tulip", null},
                {null, null, null}
        };
        ingredients = new String[] {"orange_tulip"};
        itemArr.add(new CraftableItem.Builder("Orange Dye")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Orange Dye can also be crafted via combining Rose Red and Dandelion Yellow (shapeless recipe, yields 2)")
                .looksLike("@drawable/orange_dye")
                .build());
        // ================== Pink Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "pink_tulip", null},
                {null, null, null}
        };
        ingredients = new String[] {"pink_tulip"};
        itemArr.add(new CraftableItem.Builder("Pink Dye")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Pink Dye can also be crafted from one Peony (yields 2), or from one Rose Red and one Bonemeal (shapeless recipe, yields 2).")
                .looksLike("@drawable/pink_dye")
                .build());
        // ================== Lime Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"cactus_green", "bonemeal", null},
                {null, null, null}
        };
        ingredients = new String[] {"cactus_green", "bonemeal"};
        itemArr.add(new CraftableItem.Builder("Lime Dye")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(2)
                .looksLike("@drawable/lime_dye")
                .build());
        // ================== Purple Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"lapis", "rose_red", null},
                {null, null, null}
        };
        ingredients = new String[] {"lapis", "rose_red"};
        itemArr.add(new CraftableItem.Builder("Purple Dye")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(2)
                .looksLike("@drawable/purple_dye")
                .build());
        // ================== Cyan Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"lapis", "cactus_green", null},
                {null, null, null}
        };
        ingredients = new String[] {"lapis", "cactus_green"};
        itemArr.add(new CraftableItem.Builder("Cyan Dye")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(2)
                .looksLike("@drawable/cyan_dye")
                .build());
        // ================== Light Grey Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "white_tulip", null},
                {null, null, null}
        };
        ingredients = new String[] {"white_tulip"};
        itemArr.add(new CraftableItem.Builder("Light Grey Dye")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Light Gray Dye can also be crafted from one Azure Bluet or one Oxeye Daisy, from two Bonemeal and one Ink Sac (shapeless, yields 3), or from one Gray Dye and one Bonemeal (shapeless, yields 2).")
                .looksLike("@drawable/light_gray_dye")
                .build());
        // ================== Magenta Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "allium", null},
                {null, null, null}
        };
        ingredients = new String[] {"allium"};
        itemArr.add(new CraftableItem.Builder("Magenta Dye")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Magenta dye can also be crafted from one Lilac (yields 2), from Purple and Pink dyes (shapeless, yields 2), from two Rose Red with one Lapis and one Bonemeal (shapeless, yields 4), or from one Pink Dye and one Rose Red and One Lapis (shapeless, yields 3).")
                .looksLike("@drawable/magenta_dye")
                .build());
        // ================== Light Blue Dye =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "blue_orchid", null},
                {null, null, null}
        };
        ingredients = new String[] {"blue_orchid"};
        itemArr.add(new CraftableItem.Builder("Light Blue Dye")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Light Blue Dye can also be crafted from one Lapis and one Bonemeal (shapeless, yields 2)")
                .looksLike("@drawable/light_blue_dye")
                .build());
        // ================== Emerald =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "emerald_block", null},
                {null, null, null}
        };
        ingredients = new String[] {"emerald_block"};
        itemArr.add(new CraftableItem.Builder("Emerald")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/emerald")
                .build());
        // ================== Iron Ingot =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "iron_block", null},
                {null, null, null}
        };
        ingredients = new String[] {"iron_block"};
        itemArr.add(new CraftableItem.Builder("Iron Ingot")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .describedAs("Iron Ingot can also be crafted from a full crafting interface of Iron Nuggets (yields 1).")
                .looksLike("@drawable/iron_ingot")
                .build());
        // ================== Lapis Lazuli =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "lapis_block", null},
                {null, null, null}
        };
        ingredients = new String[] {"lapis_block"};
        itemArr.add(new CraftableItem.Builder("Lapis Lazuli")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/lapis")
                .build());
        // ================== Bonemeal =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "bone", null},
                {null, null, null}
        };
        ingredients = new String[] {"bone"};
        itemArr.add(new CraftableItem.Builder("Bonemeal")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("This recipe is also valid for one Bone Block (yields 9).")
                .looksLike("@drawable/bonemeal")
                .build());
        // ================== Stick =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "oak_wood_plank", null},
                {null, "oak_wood_plank", null}
        };
        ingredients = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Stick")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(4)
                .describedAs("This recipe is valid for any combination of types of wood planks.")
                .looksLike("@drawable/stick")
                .build());
        // ================== Iron Nugget =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "iron_ingot", null},
                {null, null, null}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Iron Nugget")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/iron_nugget")
                .build());
        // ================== Melon Seeds =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "melon_slice", null},
                {null, null, null}
        };
        ingredients = new String[] {"melon_slice"};
        itemArr.add(new CraftableItem.Builder("Melon Seeds")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/melon_seeds")
                .build());
        // ================== Diamond =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "diamond_block", null},
                {null, null, null}
        };
        ingredients = new String[] {"diamond_block"};
        itemArr.add(new CraftableItem.Builder("Diamond")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(9)
                .looksLike("@drawable/diamond")
                .build());
        // ================== Firework Star =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"gunpowder", "light_blue_dye", "feather"},
                {"glowstone_dust", "diamond", null}
        };
        ingredients = new String[] {"gunpowder", "light_blue_dye", "feather", "glowstone_dust", "diamond"};
        itemArr.add(new CraftableItem.Builder("Firework Star")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Firework Star recipes are fairly complex. A basic star (Small Ball explosion) is simply Gunpowder and Dye. Special effects may be achieved via adding the following ingredients: Fire Charge (Large Ball), Gold Nugget (Star Explision), any Head (Creeper face), Feather (Burst), Glowstone Dust (Twinkle/Crackle), Diamond (Trail/Willow). A Fade may be added by combinin an existing star with Dye.")
                .looksLike("@drawable/firework_star")
                .build());
        // ================== Bucket =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"iron_ingot", null, "iron_ingot"},
                {null, "iron_ingot", null}
        };
        ingredients = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Bucket")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/bucket")
                .build());
        // ================== Eye of Ender =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"blaze_powder", "ender_pearl", null},
                {null, null, null}
        };
        ingredients = new String[] {"blaze_powder", "ender_pearl"};
        itemArr.add(new CraftableItem.Builder("Eye of Ender")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/eye_of_ender")
                .build());
        // ================== Book and Quill =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"book", "ink_sac", null},
                {null, "feather", null}
        };
        ingredients = new String[] {"book", "ink_sac", "feather"};
        itemArr.add(new CraftableItem.Builder("Book and Quill")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/book_and_quill")
                .build());
        // ================== Written Book =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"book_and_quill", "book", null},
                {null, null, null}
        };
        ingredients = new String[] {"book", "book_and_quill"};
        itemArr.add(new CraftableItem.Builder("Written Book")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("The yield of this recipe can be increased by adding more Book and Quills to the recipe, up to 8.")
                .looksLike("@drawable/book")
                .build());
        // ================== Map (Empty) =================== //
        tempLayout = new String[][] {
                {"paper", "paper", "paper"},
                {"paper", "compass", "paper"},
                {"paper", "paper", "paper"}
        };
        ingredients = new String[] {"compass", "paper"};
        itemArr.add(new CraftableItem.Builder("Map (Empty)")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/map")
                .build());
        // ================== Map (Zoomed Out) =================== //
        tempLayout = new String[][] {
                {"paper", "paper", "paper"},
                {"paper", "map", "paper"},
                {"paper", "paper", "paper"}
        };
        ingredients = new String[] {"paper", "map"};
        itemArr.add(new CraftableItem.Builder("Map (Zoomed Out)")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/map")
                .build());
        // ================== Fire Charge =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"blaze_powder", "coal", null},
                {null, "gunpowder", null}
        };
        ingredients = new String[] {"blaze_powder", "coal", "gunpowder"};
        itemArr.add(new CraftableItem.Builder("Fire Charge")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .describedAs("Fire Charge can also be created using charcoal instead of coal.")
                .looksLike("@drawable/fire_charge")
                .build());
        // ================== Beacon =================== //
        tempLayout = new String[][] {
                {"glass", "glass", "glass"},
                {"glass", "nether_star", "glass"},
                {"obsidian", "obsidian", "obsidian"}
        };
        ingredients = new String[] {"glass", "nether_star", "obsidian"};
        itemArr.add(new CraftableItem.Builder("Beacon")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/beacon")
                .build());
        // ================== Firework Rocket =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"paper", null, null},
                {"gunpowder", null, null}
        };
        ingredients = new String[] {"nether_star", "obsidian"};
        itemArr.add(new CraftableItem.Builder("Firework Rocket")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(3)
                .describedAs("The addition of more gunpowder increases the duration of the rocket (up to 3 gunpowders). You may also include Firework Stars (up to 7).")
                .looksLike("@drawable/firework_rocket")
                .build());
        // ================== Paper =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"sugar_cane", "sugar_cane", "sugar_cane"},
                {null, null, null}
        };
        ingredients = new String[] {"sugar_cane"};
        itemArr.add(new CraftableItem.Builder("Paper")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ingredients)
                .yielding(3)
                .looksLike("@drawable/paper")
                .build());
        // ================== Book =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"paper", "paper", null},
                {"paper", "leather", null}
        };
        ingredients = new String[] {"paper", "leather"};
        itemArr.add(new CraftableItem.Builder("Book")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ingredients)
                .yielding(1)
                .looksLike("@drawable/book")
                .build());

        return itemArr;
    }

}
