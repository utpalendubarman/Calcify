package com.pavitrawalia.calcify.ui.unit_conversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureCoverterTest {

    TemperatureCoverter temperatureCoverter = new TemperatureCoverter();

    @Test
    public void convert() {
        String fromUnit = temperatureCoverter.getTypes()[0];
        String toUnit = temperatureCoverter.getTypes()[1];
        double from = 1;
        double expected = 274;
        double res = temperatureCoverter.convert(fromUnit, toUnit, from);
        assertEquals(expected, res, 1.0);
    }

    @Test
    public void convertReverse() {
        String fromUnit = temperatureCoverter.getTypes()[1];
        String toUnit = temperatureCoverter.getTypes()[0];
        double from = 274;
        double expected = 1;
        double res = temperatureCoverter.convert(fromUnit, toUnit, from);
        assertEquals(expected, res, 1.0);
    }


}