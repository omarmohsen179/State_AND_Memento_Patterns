package com.company.StatePattern;

import com.company.StatePattern.Objects.Tool;

public class StateConvas {
    private Tool currentTool;
    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseup();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
