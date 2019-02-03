package app.android.ir.pattern.state.state.model;

import android.util.Log;
import android.widget.TextView;

import app.android.ir.pattern.state.state.State;
import app.android.ir.pattern.state.state.UserStatus;


public class Normal implements State {
    @Override
    public void pushMeUp(UserStatus wrapper) {
        Log.d(TAG, "--->");
        wrapper.setState(new Premium());
    }

    @Override
    public void pullMeDown(UserStatus wrapper) {
        Log.d(TAG, "<----");
        wrapper.setState(new Guest());
    }

    @Override
    public void print(TextView textView) {
        textView.setText("I am a Normal user :|");
    }
}
