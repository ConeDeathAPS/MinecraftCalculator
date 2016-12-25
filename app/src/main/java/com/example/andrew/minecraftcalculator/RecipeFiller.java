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
        // ================================================= //
        // =============== Building Blocks ================= //
        // ================================================= //

        // ================== Wood Planks =================== //
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
                {"oak_wood_plank", null, null},
                {"oak_wood_plank", "oak_wood_plank", null},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plans"};
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
        ings = new String[] {"stone_brick"};
        itemArr.add(new CraftableItem.Builder("Stone Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/stone_brick")
                .build());
        // ================== Chiseled Stone Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "stone_brick_slab", null},
                {null, "stone_brick_slab", null}
        };
        ings = new String[] {"stone_brick_slab"};
        itemArr.add(new CraftableItem.Builder("Chiseled Stone Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/chiseled_stone_brick")
                .build());
        // ================== Nether Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"nether_brick", "nether_brick", null},
                {"nether_brick", "nether_brick", null}
        };
        ings = new String[] {"nether_brick"};
        itemArr.add(new CraftableItem.Builder("Nether Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/nether_bricks")
                .build());
        // ================== Red Nether Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"nether_wart", "nether_brick", null},
                {"nether_brick", "nether_wart", null}
        };
        ings = new String[] {"nether_brick", "nether_wart"};
        itemArr.add(new CraftableItem.Builder("Red Nether Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/red_nether_bricks")
                .build());
        // ================== Hay Bale =================== //
        tempLayout = new String[][] {
                {"wheat", "wheat", "wheat"},
                {"wheat", "wheat", "wheat"},
                {"wheat", "wheat", "wheat"}
        };
        ings = new String[] {"wheat"};
        itemArr.add(new CraftableItem.Builder("Hay Bale")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/hay_bale")
                .build());
        // ================== Stained Clay =================== //
        tempLayout = new String[][] {
                {"hardened_clay", "hardened_clay", "hardened_clay"},
                {"hardened_clay", "light_blue_dye", "hardened_clay"},
                {"hardened_clay", "hardened_clay", "hardened_clay"}
        };
        ings = new String[] {"hardened_clay", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Stained Clay")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"coal"};
        itemArr.add(new CraftableItem.Builder("Block of Coal")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/coal_block")
                .build());
        // ================== Prismarine =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"prismarine_shard", "prismarine_shard", null},
                {"prismarine_shard", "prismarine_shard", null}
        };
        ings = new String[] {"prismarine_shard"};
        itemArr.add(new CraftableItem.Builder("Prismarine")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/prismarine")
                .build());
        // ================== Prismarine Bricks =================== //
        tempLayout = new String[][] {
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"},
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"},
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"}
        };
        ings = new String[] {"prismarine_shard"};
        itemArr.add(new CraftableItem.Builder("Prismarine Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/prismarine_bricks")
                .build());
        // ================== Dark Prismarine =================== //
        tempLayout = new String[][] {
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"},
                {"prismarine_shard", "ink_sac", "prismarine_shard"},
                {"prismarine_shard", "prismarine_shard", "prismarine_shard"}
        };
        ings = new String[] {"prismarine_shard", "ink_sac"};
        itemArr.add(new CraftableItem.Builder("Dark Prismarine")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/dark_prismarine")
                .build());
        // ================== Coarse Dirt =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"dirt", "gravel", null},
                {"gravel", "dirt", null}
        };
        ings = new String[] {"dirt", "gravel"};
        itemArr.add(new CraftableItem.Builder("Coarse Dirt")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(4)
                .looksLike("@drawable/coarse_dirt")
                .build());
        // ================== Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"brick", "brick", null},
                {"brick", "brick", null}
        };
        ings = new String[] {"brick"};
        itemArr.add(new CraftableItem.Builder("Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/bricks")
                .build());
        // ================== Purpur Bricks =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"popped_chorus_fruit", "popped_chorus_fruit", null},
                {"popped_chorus_fruit", "popped_chorus_fruit", null}
        };
        ings = new String[] {"popped_chorus_fruit"};
        itemArr.add(new CraftableItem.Builder("Purpur Bricks")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(4)
                .looksLike("@drawable/purpur_bricks")
                .build());
        // ================== Purpur Pillar =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "purpur_slab", null},
                {null, "purpur_slab", null}
        };
        ings = new String[] {"purpur_slabr"};
        itemArr.add(new CraftableItem.Builder("Purpur Pillar")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/purpur_pillar")
                .build());
        // ================== Magma Block =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"magma_cream", "magma_cream", null},
                {"magma_cream", "magma_cream", null}
        };
        ings = new String[] {"magma_cream"};
        itemArr.add(new CraftableItem.Builder("Magma Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/magma_block")
                .build());
        // ================== Bone Block =================== //
        tempLayout = new String[][] {
                {"bonemeal", "bonemeal", "bonemeal"},
                {"bonemeal", "bonemeal", "bonemeal"},
                {"bonemeal", "bonemeal", "bonemeal"}
        };
        ings = new String[] {"bonemeal"};
        itemArr.add(new CraftableItem.Builder("Bone Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/bone_block")
                .build());
        // ================== Nether Wart Block =================== //
        tempLayout = new String[][] {
                {"nether_wart", "nether_wart", "nether_wart"},
                {"nether_wart", "nether_wart", "nether_wart"},
                {"nether_wart", "nether_wart", "nether_wart"}
        };
        ings = new String[] {"nether_wart"};
        itemArr.add(new CraftableItem.Builder("Nether Wart Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/nether_wart_block")
                .build());
        // ================== Wool =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"string", "string", null},
                {"string", "string", null}
        };
        ings = new String[] {"string"};
        itemArr.add(new CraftableItem.Builder("Wool")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/wool")
                .build());
        // ================== Dyed Wool =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"wool", "light_blue_dye", null},
                {null, null, null}
        };
        ings = new String[] {"wool", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Dyed Wool")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
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
        ings = new String[] {"prismarine_shard", "prismarine_crystals"};
        itemArr.add(new CraftableItem.Builder("Sea Lantern")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"diamond", "obsidian", "book"};
        itemArr.add(new CraftableItem.Builder("Enchanting Table")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/enchanting_table")
                .build());
        // ================== Painting =================== //
        tempLayout = new String[][] {
                {"stick", "stick", "stick"},
                {"stick", "light_blue_wool", "stick"},
                {"stick", "stick", "stick"}
        };
        ings = new String[] {"stick", "light_blue_wool"};
        itemArr.add(new CraftableItem.Builder("Painting")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/painting")
                .build());
        // ================== Torch =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "coal", null},
                {null, "stick", null}
        };
        ings = new String[] {"stick", "light_blue_wool"};
        itemArr.add(new CraftableItem.Builder("Torch")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Crafting Table")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"stick"};
        itemArr.add(new CraftableItem.Builder("Ladder")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"snow_block"};
        itemArr.add(new CraftableItem.Builder("Snow")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(6)
                .looksLike("@drawable/snow")
                .build());
        // ================== Jukebox =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", "diamond", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plank", "diamond"};
        itemArr.add(new CraftableItem.Builder("Jukebox")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Iron Bars")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(16)
                .looksLike("@drawable/iron_bars")
                .build());
        // ================== Wood Fence =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"oak_wood_plank", "stick", "oak_wood_plank"},
                {"oak_wood_plank", "stick", "oak_wood_plank"}
        };
        ings = new String[] {"stick", "oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Wood Fence")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"nether_brick"};
        itemArr.add(new CraftableItem.Builder("Nether Brick Fence")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(6)
                .looksLike("@drawable/nether_brick_fence")
                .build());
        // ================== Glass Pane =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"glass", "glass", "glass"},
                {"glass", "glass", "glass"}
        };
        ings = new String[] {"glass"};
        itemArr.add(new CraftableItem.Builder("Glass Pane")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"glass", "eye_of_ender", "ghast_tear"};
        itemArr.add(new CraftableItem.Builder("End Crystal")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/end_crystal")
                .build());
        // ================== Ender Chest =================== //
        tempLayout = new String[][] {
                {"obsidian", "obsidian", "obsidian"},
                {"obsidian", "eye_of_ender", "obsidian"},
                {"obsidian", "obsidian", "obsidian"}
        };
        ings = new String[] {"obsidian", "eye_of_ender"};
        itemArr.add(new CraftableItem.Builder("Ender Chest")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/ender_chest")
                .build());
        // ================== Chest =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", null, "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Chest")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"oak_wood_plank", "stick"};
        itemArr.add(new CraftableItem.Builder("Sign")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"leather", "stick"};
        itemArr.add(new CraftableItem.Builder("Item Frame")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/item_frame")
                .build());
        // ================== Cobblestone Wall =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"cobblestone", "cobblestone", "cobblestone"},
                {"cobblestone", "cobblestone", "cobblestone"}
        };
        ings = new String[] {"cobblestone"};
        itemArr.add(new CraftableItem.Builder("Cobblestone Wall")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"brick"};
        itemArr.add(new CraftableItem.Builder("Flower Pot")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/flower_pot")
                .build());
        // ================== Trapped Chest =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "tripwire_hook", "chest"},
                {null, null, null}
        };
        ings = new String[] {"chest", "tripwire_hook"};
        itemArr.add(new CraftableItem.Builder("Trapped Chest")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/trapped_chest")
                .build());
        // ================== Bed =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"wool", "wool", "wool"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plank", "wool"};
        itemArr.add(new CraftableItem.Builder("Bed")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"slime_ball"};
        itemArr.add(new CraftableItem.Builder("Slime Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/slime_block")
                .build());
        // ================== Armor Stand =================== //
        tempLayout = new String[][] {
                {"stick", "stick", "stick"},
                {null, "stick", null},
                {"stick", "stone_slab", "stick"}
        };
        ings = new String[] {"stick", "stone_slab"};
        itemArr.add(new CraftableItem.Builder("Armor Stand")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/armor_stand")
                .build());
        // ================== Furnace =================== //
        tempLayout = new String[][] {
                {"cobblestone", "cobblestone", "cobblestone"},
                {"cobblestone", null, "cobblestone"},
                {"cobblestone", "cobblestone", "cobblestone"}
        };
        ings = new String[] {"cobblestone"};
        itemArr.add(new CraftableItem.Builder("Furnace")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/furnace")
                .build());
        // ================== Carpet =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, null, null},
                {"wool", "wool", null}
        };
        ings = new String[] {"wool"};
        itemArr.add(new CraftableItem.Builder("Carpet")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Anvil")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/anvil")
                .build());
        // ================== End Rod =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "blaze_rod", null},
                {null, "popped_chorus_fruit", null}
        };
        ings = new String[] {"blaze_rod", "popped_chorus_fruit"};
        itemArr.add(new CraftableItem.Builder("End Rod")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(4)
                .looksLike("@drawable/end_rod")
                .build());
        // ================== Shulker Box =================== //
        tempLayout = new String[][] {
                {null, "shulker_shell", null},
                {null, "chest", null},
                {null, "shulker_shell", null}
        };
        ings = new String[] {"chest", "shulker_shell"};
        itemArr.add(new CraftableItem.Builder("Shulker Box")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/purple_shulker_box")
                .build());
        // ================== Colored Shulker Box =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"purple_shulker_box", "light_blue_dye", null},
                {null, null, null}
        };
        ings = new String[] {"purple_shulker_box", "light_blue_dye"};
        itemArr.add(new CraftableItem.Builder("Colored Shulker Box")
                .withLayout(tempLayout)
                .ofType("shapeless")
                .usingIngredients(ings)
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
        ings = new String[] {"wool", "stick"};
        itemArr.add(new CraftableItem.Builder("Banner")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"cobblestone", "stick"};
        itemArr.add(new CraftableItem.Builder("Lever")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/lever")
                .build());
        // ================== Button =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {null, "stone", null},
                {null, null, null}
        };
        ings = new String[] {"stone"};
        itemArr.add(new CraftableItem.Builder("Button")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"stone"};
        itemArr.add(new CraftableItem.Builder("Pressure Plate")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"stick"};
        itemArr.add(new CraftableItem.Builder("Redstone Torch")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/redstone_torch")
                .build());
        // ================== Note Block =================== //
        tempLayout = new String[][] {
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"},
                {"oak_wood_plank", "redstone_dust", "oak_wood_plank"},
                {"oak_wood_plank", "oak_wood_plank", "oak_wood_plank"}
        };
        ings = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Note Block")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"oak_wood_plank", "stick"};
        itemArr.add(new CraftableItem.Builder("Fence Gate")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"oak_wood_plank"};
        itemArr.add(new CraftableItem.Builder("Trapdoor")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
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
        ings = new String[] {"redstone_dust"};
        itemArr.add(new CraftableItem.Builder("Redstone Dust")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(9)
                .looksLike("@drawable/redstone_dust")
                .build());
        // ================== Weighted Pressure Plate (Heavy) =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"iron_ingot", "iron_ingot", null},
                {null, null, null}
        };
        ings = new String[] {"iron_ingot"};
        itemArr.add(new CraftableItem.Builder("Weighted Pressure Plate (Heavy)")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/weighted_pressure_plate_heavy")
                .build());
        // ================== Weighted Pressure Plate (Light) =================== //
        tempLayout = new String[][] {
                {null, null, null},
                {"gold_ingot", "gold_ingot", null},
                {null, null, null}
        };
        ings = new String[] {"gold_ingot"};
        itemArr.add(new CraftableItem.Builder("Weighted Pressure Plate (Light)")
                .withLayout(tempLayout)
                .ofType("normal")
                .usingIngredients(ings)
                .yielding(1)
                .looksLike("@drawable/weighted_pressure_plate_light")
                .build());




        return itemArr;
    }

}
