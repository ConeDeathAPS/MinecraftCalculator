package com.example.andrew.minecraftcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ItemCalculatorUnitTests {

    private final ItemCalculator itemCalc = new ItemCalculator();

    @Test
    public void testStackBaseToggle() {
        assertEquals(64, itemCalc.stackBase);
        itemCalc.toggleStackBase();
        assertEquals(16, itemCalc.stackBase);
        itemCalc.toggleStackBase();
        assertEquals(64, itemCalc.stackBase);
    }
}