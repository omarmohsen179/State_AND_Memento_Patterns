package com.company.StatePattern;

public class Canvas {
    private ToolType currentTool;
    public void mouseDown(){
        if(currentTool == ToolType.SELECTION)
            System.out.println("selection icon");
        else  if(currentTool == ToolType.BRUSH){
            System.out.println("brush icon");
        }
        else  if(currentTool == ToolType.ERASURE){
            System.out.println("Erasur icon");
        }
    }
    public void mouseUp(){

        if(currentTool == ToolType.SELECTION)
            System.out.println("Draw dashed ");
        else  if(currentTool == ToolType.BRUSH){
            System.out.println("Draw a line");
        }
        else  if(currentTool == ToolType.ERASURE){
            System.out.println("Erase something");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
