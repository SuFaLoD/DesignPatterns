package com.example.statepattern.state;

import com.example.statepattern.state.model.Guest;

public class UserStatus {
    private State currentState;

    public UserStatus() {
        currentState = new Guest();
    }

    public void setState(State s) {
        currentState = s;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void pushMeUp() {
        currentState.pushMeUp(this);
    }

    public void pullMeDown() {
        currentState.pullMeDown(this);
    }
}