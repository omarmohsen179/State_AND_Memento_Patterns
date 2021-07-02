package com.company;

import com.company.MomentoPattern.Editor;
import com.company.MomentoPattern.History;
import com.company.StatePattern.Abuse.StopWatch;
import com.company.StatePattern.Objects.EraserTool;
import com.company.StatePattern.StateConvas;

public class Main {

    public static void main(String[] args) {
        stopWatchFunction();
    }
    public static  void Memento(){
        Editor editor= new Editor();
        History history= new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
    public static  void state(){
        StateConvas convas = new StateConvas();
        convas.setCurrentTool(new EraserTool());
        convas.mouseDown();
        convas.mouseUp();
    }
    public static  void stopWatchFunction(){
        StopWatch stopwarch=new StopWatch();
        stopwarch.click();
        stopwarch.click();
        stopwarch.click();
    }
}
