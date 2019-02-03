package app.android.ir.pattern.state.state.model;

import android.util.Log;
import android.widget.TextView;


import app.android.ir.pattern.state.state.State;
import app.android.ir.pattern.state.state.UserStatus;

class Premium implements State {

    @Override
    public void pushMeUp(UserStatus wrapper) {
        Log.d(TAG, "-->");
        wrapper.setState(new Admin());
    }

    @Override
    public void pullMeDown(UserStatus wrapper) {
        Log.d(TAG, "<---");
        wrapper.setState(new Normal());
    }

    @Override
    public void print(TextView textView) {
        textView.setText("I am a Premium :D");
    }
}