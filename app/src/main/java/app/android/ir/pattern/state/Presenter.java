package app.android.ir.pattern.state;

import android.widget.TextView;

import app.android.ir.pattern.state.state.State;

public interface Presenter {
    void myStrategyTextPrinter(State currentState, TextView textView);
}
