package no7;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class ContohGraphics extends JFrame {
    public ContohGraphics() {
        setTitle("Contoh Graphics");
        setSize(360, 380);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fill3DRect(30, 50, 300, 300, true);
    }

    public static void main(String[] args) {
        ContohGraphics frame = new ContohGraphics();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}