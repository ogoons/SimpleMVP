package com.ogoons.simplemvp.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ogoons.simplemvp.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainContract.Presenter mPresenter;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(new MainRepository(), this);

        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.loadData();
            }
        });
    }

    // 하나의 presenter를 child view(fragment)와 공유하기 위한 정책
    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        // fragment가 구현되어 있지 않으므로 생략
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgressView() {
        // TODO: 네트워크 작업 시 로딩 view를 보여준다.
    }

    @Override
    public void hideProgressView() {
        // TODO: 네트워크 작업 시 로딩 view를 숨긴다.
    }
}
