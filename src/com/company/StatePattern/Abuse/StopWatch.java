package com.company.StatePattern.Abuse;

public class StopWatch {
   private State currentstate=new StoppedState(this);
    /*public void click () {
        if(isRunning){
            isRunning=false;
            System.out.println("stopped");
        }
        else{
            isRunning=true;
            System.out.println("Running");
        }
    }*/
    public void click () {
currentstate.click();
    }
    public State getCurrentstate() {
        return currentstate;
    }

    public void setCurrentstate(State currentstate) {
        this.currentstate = currentstate;
    }
}
