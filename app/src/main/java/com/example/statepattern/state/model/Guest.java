package com.example.statepattern.state.model;

import android.util.Log;
import android.widget.TextView;

import com.example.statepattern.state.UserStatus;
import com.example.statepattern.state.State;

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