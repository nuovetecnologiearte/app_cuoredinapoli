package com.example.cuoredinapoli.ui.opzioni;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OpzioniViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OpzioniViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("IMPOSTAZIONI");
    }

    public LiveData<String> getText() {
        return mText;
    }
}