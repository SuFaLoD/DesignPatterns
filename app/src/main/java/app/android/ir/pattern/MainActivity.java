package app.android.ir.pattern;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import app.android.ir.pattern.state.Presenter;
import app.android.ir.pattern.state.PresenterImpl;
import app.android.ir.pattern.state.state.UserStatus;


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


        AlarmManager alarmMgr = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        PendingIntent pendingIntent =
                PendingIntent.getBroadcast(this, 0, new Intent(this
                          ,AlarmReceiver.class), 0);
        alarmMgr.s;
    }
}
