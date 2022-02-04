package no5;

import javax.swing.*;

public class ContohSwing extends JFrame {
    public ContohSwing() {
        setTitle("Contoh Swing");
        setSize(360,240);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        ContohSwing frame = new ContohSwing();
    }
}
