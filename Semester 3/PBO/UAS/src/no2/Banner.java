package no2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Banner extends JFrame {
    private JPanel Container;
    private JLabel labelNama;
    private JTextField inputNama;
    private JButton submitNama;

    Thread thread = new Thread() {
        public void run() {
            String sayHello = "Halo " + inputNama.getText() + "!";
            String outputNama = "";

            for (int i = 0; i < sayHello.length(); i++) {
                try {
                    outputNama += sayHello.charAt(i);
                    labelNama.setText(outputNama);
                    Thread.sleep(200); // pause 1 detik
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    };

    public Banner() {
        setContentPane(Container);
        setTitle("Banner Sederhana");
        setSize(360,240);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

        submitNama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread.start();
            }
        });
    }

    public static void main(String[] args) {
        Banner banner = new Banner();
    }
}