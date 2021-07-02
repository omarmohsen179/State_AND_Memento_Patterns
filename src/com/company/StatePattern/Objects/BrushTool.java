package com.company.StatePattern.Objects;

public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseup() {
        System.out.println("Draw a line");
    }
}
