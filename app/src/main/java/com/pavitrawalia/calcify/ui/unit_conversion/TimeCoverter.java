package com.pavitrawalia.calcify.ui.unit_conversion;

public class TimeCoverter implements IConverter {

    final static String Type = "Time";
    double[] scales = new double[]{3600.0, 60.0, 1.0, 0.001, 0.000001};
    private String[] types = new String[]{"Hour", "Minute", "Second", "Millisecond", "Microsecond"};

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
