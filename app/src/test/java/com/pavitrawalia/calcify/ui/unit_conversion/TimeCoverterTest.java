package com.pavitrawalia.calcify.ui.unit_conversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeCoverterTest {

    TimeCoverter coverter = new TimeCoverter();

    @Test
    public void convert() {
        String fromUnit = coverter.getTypes()[0];
        String toUnit = coverter.getTypes()[1];
        double from = 1;
        double expected = 60;
        double res = coverter.convert(fromUnit, toUnit, from);
        assertEquals(expected, res, 1.0);

    }

    @Test
    public void convertReverse() {
        String fromUnit = coverter.getTypes()[1];
        String toUnit = coverter.getTypes()[0];
        double from = 60;
        double expected = 1;
        double res = coverter.convert(fromUnit, toUnit, from);
        assertEquals(expected, res, 1.0);
    }

}