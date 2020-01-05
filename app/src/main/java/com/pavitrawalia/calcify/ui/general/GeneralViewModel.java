package com.pavitrawalia.calcify.ui.general;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GeneralViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GeneralViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is General fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}