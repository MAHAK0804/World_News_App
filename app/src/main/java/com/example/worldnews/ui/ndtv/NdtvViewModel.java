package com.example.worldnews.ui.ndtv;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NdtvViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NdtvViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NDTV fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}