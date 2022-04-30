package com.example.andrew.minecraftcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearDistanceTests {

    private final LinearDistance linearDistance = new LinearDistance();

    @Test
    public void initialStateTest() {
        assertEquals(LinearDistance.Mode.THREE_DIMENSIONS, linearDistance.mode);
    }
}
