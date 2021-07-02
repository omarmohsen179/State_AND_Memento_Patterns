package com.company.StatePattern.Objects;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon ");
    }

    @Override
    public void mouseup() {
        System.out.println("Eraser up ");
    }
}
