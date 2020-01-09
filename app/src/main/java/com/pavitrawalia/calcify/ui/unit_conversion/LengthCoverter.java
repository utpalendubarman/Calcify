package com.pavitrawalia.calcify.ui.unit_conversion;

public class LengthCoverter implements IConverter {

    final static String Type = "Length";
    double[] scales = new double[]{1000.0, 1.0, 0.01, 0.9144, 0.3048, 0.0254};
    private String[] types = new String[]{"KiloMeter", "Meter", "Centimeter", "Yard", "Foot", "Inch"};

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
