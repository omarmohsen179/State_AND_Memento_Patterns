package com.company.StatePattern.Abuse;

public class RunningState implements State {
    StopWatch stopWatch;
    public RunningState(StopWatch stopWatch){
    this.stopWatch= stopWatch;
    }
    @Override
    public void click() {
        stopWatch.setCurrentstate(new StoppedState(stopWatch));

        System.out.println("running");
    }
}
