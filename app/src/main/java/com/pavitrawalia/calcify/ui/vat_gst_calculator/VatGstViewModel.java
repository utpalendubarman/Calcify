package com.pavitrawalia.calcify.ui.vat_gst_calculator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VatGstViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VatGstViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is VAT & GST fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}