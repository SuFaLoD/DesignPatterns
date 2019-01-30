package com.example.statepattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.statepattern.state.UserStatus;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private Presenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserStatus UserStatusHelper = new UserStatus();
        textView = findViewById(R.id.text);
        myPresenter = new PresenterImpl();
        myPresenter.myStrategyTextPrinter(UserStatusHelper.getCurrentState(), textView);

        findViewById(R.id.button_upgrade_state).setOnClickListener(v -> {
            UserStatusHelper.pushMeUp();
            myPresenter.myStrategyTextPrinter(UserStatusHelper.getCurrentState(), textView);
        });

        findViewById(R.id.button_downgrade_state).setOnClickListener(v -> {
            UserStatusHelper.pullMeDown();
            myPresenter.myStrategyTextPrinter(UserStatusHelper.getCurrentState(), textView);
        });
    }
}
