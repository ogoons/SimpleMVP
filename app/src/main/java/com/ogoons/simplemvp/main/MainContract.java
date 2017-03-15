package com.ogoons.simplemvp.main;

import com.ogoons.simplemvp.base.BasePresenter;
import com.ogoons.simplemvp.base.BaseView;

/**
 * Created by OGOONS on 2017. 3. 15..
 */

public class MainContract {

    interface View extends BaseView<Presenter> {

        void showToast(String text);

    }

    interface Presenter extends BasePresenter {

        void loadData();

    }
}
