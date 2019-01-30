package com.example.statepattern.state;


import android.widget.TextView;

public interface State {
    String TAG = "State";

    void pushMeUp(UserStatus wrapper);

    void pullMeDown(UserStatus wrapper);

    void print(TextView textView);
}
