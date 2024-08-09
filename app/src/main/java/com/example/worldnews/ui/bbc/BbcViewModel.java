package com.example.worldnews.ui.bbc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BbcViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BbcViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is BBC fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}