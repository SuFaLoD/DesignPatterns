package com.example.statepattern.state.model;

import android.util.Log;
import android.widget.TextView;

import com.example.statepattern.state.State;
import com.example.statepattern.state.UserStatus;

class Admin implements State {

    @Override
    public void pushMeUp(UserStatus wrapper) {
        Log.d(TAG, "- no state upper than god mode, you are admin -");
        wrapper.setState(new Admin());
    }

    @Override
    public void pullMeDown(UserStatus wrapper) {
        Log.d(TAG, "<--");
        wrapper.setState(new Premium());
    }

    @Override
    public void print(TextView textView) {
        textView.setText("I am Admin of system |z:D)))");
    }


    // TODO: 1/30/19 setter special state changer for admin
}

