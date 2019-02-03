package app.android.ir.pattern.state;

import android.widget.TextView;

import app.android.ir.pattern.state.state.State;

public class PresenterImpl implements Presenter {
    @Override
    public void myStrategyTextPrinter(State currentState, TextView textView) {
        currentState.print(textView);
    }
}
