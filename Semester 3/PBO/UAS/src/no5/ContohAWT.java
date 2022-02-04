package no5;

import java.awt.*;

public class ContohAWT {
    public static void main(String[] args) {
        Frame myFrame = new Frame("Contoh AWT");
        Label myLabel = new Label("Hello World!");
        myFrame.add(myLabel);
        myFrame.setSize(240,150);
        myFrame.show();
    }
}