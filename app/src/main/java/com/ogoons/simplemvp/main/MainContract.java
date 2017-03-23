package com.ogoons.simplemvp.main;

import com.ogoons.simplemvp.base.BasePresenter;
import com.ogoons.simplemvp.base.BaseView;

/**
 * Created by OGOONS on 2017. 3. 15..
 */

public class MainContract {

    public interface View extends BaseView<Presenter> {

        void showToast(String text);

    }

    public interface Presenter extends BasePresenter {

        void loadData();

    }
}
