package no5;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

public class TicTacToe extends JFrame {
    private JButton oButton, xButton;
    private Board board;
    private int lineThickness = 4;
    private Color oColor = Color.BLUE, xColor = Color.RED;
    static final char BLANK = ' ', O = 'O', X = 'X';
    private char position[] = {
            BLANK, BLANK, BLANK,
            BLANK, BLANK, BLANK,
            BLANK, BLANK, BLANK
    };
    private int wins = 0, losses = 0, draws = 0;

    public static void main(String[] args) {
        new TicTacToe();
    }

    public TicTacToe() {
        super("Tic Tac Toe");
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        add(topPanel, BorderLayout.NORTH);
        add(board = new Board(), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    private class Board extends JPanel implements MouseListener {
        private Random random = new Random();
        private int rows[][] = { { 0, 2 }, { 3, 5 }, { 6, 8 }, { 0, 6 }, { 1, 7 }, { 2, 8 }, { 0, 8 }, { 2, 6 } };

        public Board() {
            addMouseListener(this);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth();
            int h = getHeight();
            Graphics2D g2d = (Graphics2D) g;

            g2d.setPaint(Color.WHITE);
            g2d.fill(new Rectangle2D.Double(0, 0, w, h));
            g2d.setPaint(Color.BLACK);
            g2d.setStroke(new BasicStroke(lineThickness));
            g2d.draw(new Line2D.Double(0, h / 3, w, h / 3));
            g2d.draw(new Line2D.Double(0, h * 2 / 3, w, h * 2 / 3));
            g2d.draw(new Line2D.Double(w / 3, 0, w / 3, h));
            g2d.draw(new Line2D.Double(w * 2 / 3, 0, w * 2 / 3, h));

            for (int i = 0; i < 9; ++i) {
                double xpos = (i % 3 + 0.5) * w / 3.0;
                double ypos = (i / 3 + 0.5) * h / 3.0;
                double xr = w / 8.0;
                double yr = h / 8.0;
                if (position[i] == O) {
                    g2d.setPaint(oColor);
                    g2d.draw(new Ellipse2D.Double(xpos - xr, ypos - yr, xr * 2, yr * 2));
                } else if (position[i] == X) {
                    g2d.setPaint(xColor);
                    g2d.draw(new Line2D.Double(xpos - xr, ypos - yr, xpos + xr, ypos + yr));
                    g2d.draw(new Line2D.Double(xpos - xr, ypos + yr, xpos + xr, ypos - yr));
                }
            }
        }

        public void mouseClicked(MouseEvent e) {
            int xpos = e.getX() * 3 / getWidth();
            int ypos = e.getY() * 3 / getHeight();
            int pos = xpos + 3 * ypos;
            if (pos >= 0 && pos < 9 && position[pos] == BLANK) {
                position[pos] = O;
                repaint();
                putX();
                repaint();
            }
        }

        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}

        void putX() {
            if (won(O))
                newGame(O);
            else if (isDraw())
                newGame(BLANK);
            else {
                nextMove();
                if (won(X))
                    newGame(X);
                else if (isDraw())
                    newGame(BLANK);
            }
        }

        boolean won(char player) {
            for (int i = 0; i < 8; ++i)
                if (testRow(player, rows[i][0], rows[i][1]))
                    return true;
            return false;
        }

        boolean testRow(char player, int a, int b) {
            return position[a] == player && position[b] == player
                    && position[(a + b) / 2] == player;
        }

        void nextMove() {
            int r = findRow(X);
            if (r < 0)
                r = findRow(O);
            if (r < 0) {
                do
                    r = random.nextInt(9);
                while (position[r] != BLANK);
            }
            position[r] = X;
        }

        int findRow(char player) {
            for (int i = 0; i < 8; ++i) {
                int result = find1Row(player, rows[i][0], rows[i][1]);
                if (result >= 0)
                    return result;
            }
            return -1;
        }

        int find1Row(char player, int a, int b) {
            int c = (a + b) / 2;
            if (position[a] == player && position[b] == player && position[c] == BLANK)
                return c;
            if (position[a] == player && position[c] == player && position[b] == BLANK)
                return b;
            if (position[b] == player && position[c] == player && position[a] == BLANK)
                return a;
            return -1;
        }

        boolean isDraw() {
            for (int i = 0; i < 9; ++i)
                if (position[i] == BLANK)
                    return false;
            return true;
        }

        void newGame(char winner) {
            repaint();
            String result;
            if (winner == O) {
                ++wins;
                result = "You Win!";
            } else if (winner == X) {
                ++losses;
                result = "I Win!";
            } else {
                result = "Tie";
                ++draws;
            }
            if (JOptionPane.showConfirmDialog(null,
                    "You have " + wins + " wins, " + losses + " losses, " + draws + " draws\n"
                            + "Play again?",
                    result, JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
                System.exit(0);
            }

            for (int j = 0; j < 9; ++j)
                position[j] = BLANK;

            if ((wins + losses + draws) % 2 == 1)
                nextMove();
        }
    }
}