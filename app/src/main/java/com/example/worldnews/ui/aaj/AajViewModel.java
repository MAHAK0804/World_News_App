package com.example.worldnews.ui.aaj;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AajViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AajViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Aaj Tak fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}