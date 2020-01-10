package com.pavitrawalia.calcify.ui.unit_conversion;

public class PressureCoverter implements IConverter {

    final static String Type = "Pressure";
    double[] scales = new double[]{100_000.0, 1.0};
    private String[] types = new String[]{"Bar", "Pascal"};

    @Override
    public double convert(String fromUnit, String toUnit, double fromValue) {
        int fromIndex = UnitUtils.indexFromList(types, fromUnit);
        int toIndex = UnitUtils.indexFromList(types, toUnit);
        double scale = scales[fromIndex] / scales[toIndex];
        return scale * fromValue;
    }

    @Override
    public String[] getTypes() {
        return types;
    }
}
