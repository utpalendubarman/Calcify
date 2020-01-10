package com.pavitrawalia.calcify.ui.unit_conversion;

public class WeightCoverter implements IConverter {

    final static String Type = "Weight";
    double[] scales = new double[]{1000.0, 1.0, 0.001, 2204.62262};
    private String[] types = new String[]{"Kilogram", "Gram", "Milligram", "Pound"};

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
