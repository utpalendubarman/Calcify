package com.pavitrawalia.calcify.ui.unit_conversion;

public interface IConverter {
    double convert(String fromUnit, String toUnit, double fromValue);

    String[] getTypes();
}
