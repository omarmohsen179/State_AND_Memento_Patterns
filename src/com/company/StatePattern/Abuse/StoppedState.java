package com.company.StatePattern.Abuse;

public class StoppedState implements State{
    private StopWatch stopWatch;

    public StoppedState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentstate(new RunningState(stopWatch));
        System.out.println("stopped");
    }
}
