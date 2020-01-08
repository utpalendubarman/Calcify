package com.pavitrawalia.calcify.ui.unit_conversion;

public class Converter {

    final static String[] converters = {
            LengthCoverter.Type,
            TemperatureCoverter.Type,
            PressureCoverter.Type,
            WeightCoverter.Type,
            TimeCoverter.Type,
    };

    private final static IConverter[] iConverters = new IConverter[]{
            new LengthCoverter(),
            new TemperatureCoverter(),
            new PressureCoverter(),
            new WeightCoverter(),
            new TimeCoverter()
    };

    /**
     * convert values
     *
     * @param type
     * @param fromUnit
     * @param toUnit
     * @param from
     * @return
     */
    public static double convert(int type, String fromUnit, String toUnit, double from) {
        IConverter iConverter = iConverters[type];
        return iConverter.convert(fromUnit, toUnit, from);
    }

    public static String[] getConverterUnit(int index) {
        return iConverters[index].getTypes();
    }
}
