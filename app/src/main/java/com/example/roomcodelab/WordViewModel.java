package com.example.roomcodelab;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private final LiveData<List<Word>> mAllWords;
    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
        mRepository.getAllPosts();
    }

    LiveData<List<Word>> getAllWords() { return mAllWords; }

    public void insert(Word word){
        mRepository.insert(word);
    }
}
