package com.company.MomentoPattern;

public class Editor {
    private String content ;
    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState state){
        content = state.getContent();
    }
    public  String getContent(){
        return content;
    }
    public  void setContent(String con){
        this.content=con;
    }
}
