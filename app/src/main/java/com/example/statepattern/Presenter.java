package com.example.statepattern;

import android.widget.TextView;

import com.example.statepattern.state.State;

interface Presenter {
    void myStrategyTextPrinter(State currentState, TextView textView);
}
