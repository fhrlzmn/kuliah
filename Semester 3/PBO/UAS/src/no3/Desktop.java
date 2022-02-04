package no3;

import javax.swing.*; // import library Java Swing

public class Desktop extends JFrame { // membuat class JFrame
    // Constructor untuk FRame
    public Desktop() {
        setTitle("Java API Untuk Desktop");
        setSize(360,240);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
    }
}
