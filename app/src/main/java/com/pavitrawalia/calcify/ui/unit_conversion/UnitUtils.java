package com.pavitrawalia.calcify.ui.unit_conversion;

import java.util.Arrays;

public final class UnitUtils {

    private UnitUtils() {
    }

    public static int indexFromList(String[] arr, String value) {
        return Arrays.asList(arr).indexOf(value);
    }
}
