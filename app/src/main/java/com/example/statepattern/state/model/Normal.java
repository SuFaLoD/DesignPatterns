package com.example.statepattern.state.model;

import android.util.Log;
import android.widget.TextView;

import com.example.statepattern.state.UserStatus;
import com.example.statepattern.state.State;

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
