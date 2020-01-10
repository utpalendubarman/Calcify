package com.pavitrawalia.calcify.ui.unit_conversion;

public class TemperatureCoverter implements IConverter {

    final static String Type = "Temperature";
    double[] scales = new double[]{0, -273.15, 32};
    private String[] types = new String[]{"Celsius", "Kelvin", "Fahrenheit"};

    @Override
    public double convert(String fromUnit, String toUnit, double fromValue) {
        int fromIndex = UnitUtils.indexFromList(types, fromUnit);
        int toIndex = UnitUtils.indexFromList(types, toUnit);
        double scale = scales[fromIndex] - scales[toIndex];
        return fromValue + scale;
    }

    @Override
    public String[] getTypes() {
        return types;
    }
}
