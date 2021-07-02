package com.company.StatePattern.Objects;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("selectionIcon");
    }

    @Override
    public void mouseup() {
        System.out.println("Draw dash");
    }
}
