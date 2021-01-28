package com.company;

public class RightPocked {
    private PaperBased paperBased;

    public void print(){
        System.out.println("Paper-based: " + paperBased);
    }

    public PaperBased getPaperBased() {
        return paperBased;
    }

    public void setPaperBased(PaperBased paperBased) {
        this.paperBased = paperBased;
    }
}
