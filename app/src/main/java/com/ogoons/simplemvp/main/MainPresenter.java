package com.ogoons.simplemvp.main;

import android.support.annotation.NonNull;

/**
 * Created by OGOONS on 2017. 3. 15..
 */

public class MainPresenter implements MainContract.Presenter {
    private MainRepository mRepository;
    private MainContract.View mView;

    public MainPresenter(@NonNull MainRepository repository, @NonNull MainContract.View view) {
        mRepository = repository;
        mView = view;

        mView.setPresenter(this); // Child view를 위한 presenter 할당 정책, 정말 필요한지는 잘 모르겠다.
    }

    @Override
    public void start() { // From the base interface
        loadData();
    }

    @Override
    public void loadData() {  // From the sub interface
        /**
         * TODO: UI 작업 수행, 태스크 수행
         */

        // Get data from the model
        String data = mRepository.getData();

        // UI tasks
        mView.showToast(data);
    }
}
