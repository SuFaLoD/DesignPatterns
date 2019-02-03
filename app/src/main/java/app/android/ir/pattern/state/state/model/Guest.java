package app.android.ir.pattern.state.state.model;

import android.util.Log;
import android.widget.TextView;

import app.android.ir.pattern.state.state.State;
import app.android.ir.pattern.state.state.UserStatus;

public class Guest implements State {

    @Override
    public void pushMeUp(UserStatus wrapper) {
        Log.d(TAG, "---->");
        wrapper.setState(new Normal());
    }

    @Override
    public void pullMeDown(UserStatus wrapper) {
        wrapper.setState(new Guest());
        Log.d(TAG, "- no state below guest -");
    }

    @Override
    public void print(TextView textView) {
        textView.setText("I am a Guest user :(");
    }
}