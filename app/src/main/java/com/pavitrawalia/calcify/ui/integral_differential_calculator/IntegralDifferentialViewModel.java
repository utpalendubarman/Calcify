package com.pavitrawalia.calcify.ui.integral_differential_calculator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IntegralDifferentialViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IntegralDifferentialViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Integral Differential Calculator fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}