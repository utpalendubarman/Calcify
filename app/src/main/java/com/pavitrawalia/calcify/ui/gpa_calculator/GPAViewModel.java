package com.pavitrawalia.calcify.ui.gpa_calculator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GPAViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GPAViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gpa calculaotr fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}