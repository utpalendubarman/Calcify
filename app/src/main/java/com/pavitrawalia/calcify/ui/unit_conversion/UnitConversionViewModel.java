package com.pavitrawalia.calcify.ui.unit_conversion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UnitConversionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UnitConversionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Unit Conversion fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}