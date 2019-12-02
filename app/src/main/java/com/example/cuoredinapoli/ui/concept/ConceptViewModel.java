package com.example.cuoredinapoli.ui.concept;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConceptViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConceptViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("CCA c'essa sta a sezione concept");
    }

    public LiveData<String> getText() {
        return mText;
    }
}