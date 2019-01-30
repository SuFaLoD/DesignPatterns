package com.example.statepattern;

import android.widget.TextView;

import com.example.statepattern.state.State;

public class PresenterImpl implements Presenter {
    @Override
    public void myStrategyTextPrinter(State currentState, TextView textView) {
        currentState.print(textView);
    }
}
