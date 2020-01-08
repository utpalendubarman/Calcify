package com.pavitrawalia.calcify.ui.unit_conversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthCoverterTest {


    @Test
    public void convert() {
        String type = LengthCoverter.Type;
        String fromunit = "KiloMeter";
        String tounit = "Meter";
        double res = Converter.convert(type, fromunit, tounit, 10);
        assertEquals(10000, res, 0.05);

    }

    @Test
    public void convertSmalToBig() {
        String type = LengthCoverter.Type;
        String fromunit = "Meter";
        String tounit = "KiloMeter";

        double res = Converter.convert(type, fromunit, tounit, 1000);
        assertEquals(1, res, 0.05);

    }

}