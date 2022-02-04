package no7;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DrawingRect extends JFrame {
    public DrawingRect() {
        super("Kelas DrawingRect");
        setSize(260, 165);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawRect(20, 40, 220, 50);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(20, 100, 220, 50);
    }

    public static void main(String[] args) {
        DrawingRect frame = new DrawingRect();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
