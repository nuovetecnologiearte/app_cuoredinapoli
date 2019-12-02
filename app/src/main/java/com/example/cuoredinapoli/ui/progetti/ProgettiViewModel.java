package com.example.cuoredinapoli.ui.progetti;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgettiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProgettiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("EDIZIONI");
    }

    public LiveData<String> getText() {
        return mText;
    }
}