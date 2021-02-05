import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame {

    Font fontForButtons = new Font("Tacoma", Font.PLAIN, 20);

    Board board = new Board();

    public GUI() {

        interfaceWindow();

        setBoard();

        fastHertzButton();

        normalHertzButton();

        slowHertzButton();

        decreaseHertzButton();

        increaseHertzButton();
    }


    /**
     * Method that sets the board
     */
    private void setBoard() {

        this.setContentPane(this.board);
        this.setBackground(Color.WHITE);
        this.board.setLayout(null);
    }

    /**
     * Method that sets a few things about interface window
     */
    private void interfaceWindow() {

        this.setTitle("BLUR BUSTER");

        this.setSize(640,450);

        this.setResizable(false);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Method that sets the 240Hz button
     */
    private void fastHertzButton() {

        JButton fastHertzButton = new JButton();

        fastHertzButton.setBounds(400,50,200,50);
        fastHertzButton.setBackground(Color.ORANGE);
        fastHertzButton.setText("240Hz");
        fastHertzButton.setFont(this.fontForButtons);
        fastHertzButton.setVisible(true);

        fastestHertzButton hertzFastButton = new fastestHertzButton();
        fastHertzButton.addActionListener(hertzFastButton);

        this.board.add(fastHertzButton);
    }

    /**
     * Method that sets the 60Hz button
     */
    private void normalHertzButton() {

        JButton hertzNormalButton = new JButton();

        hertzNormalButton.setBounds(400,150,200,50);
        hertzNormalButton.setBackground(Color.ORANGE);
        hertzNormalButton.setText("60Hz");
        hertzNormalButton.setFont(this.fontForButtons);
        hertzNormalButton.setVisible(true);

        middletHertzButton normalHertzButton = new middletHertzButton();
        hertzNormalButton.addActionListener(normalHertzButton);

        this.board.add(hertzNormalButton);
    }

    /**
     * Method that sets the 24Hz button
     */
    private void slowHertzButton() {

        JButton hertzSlowButton = new JButton();

        hertzSlowButton.setBounds(400,250,200,50);
        hertzSlowButton.setBackground(Color.ORANGE);
        hertzSlowButton.setText("24Hz");
        hertzSlowButton.setFont(this.fontForButtons);
        hertzSlowButton.setVisible(true);

        slowestHertzButton slowButton = new slowestHertzButton();
        hertzSlowButton.addActionListener(slowButton);

        this.board.add(hertzSlowButton);
    }

    /**
     * Method that decreases the current Hz value
     */
    private void decreaseHertzButton() {

        JButton hertzDecreaseButton = new JButton();

        hertzDecreaseButton.setBounds(400,350,50,50);

        hertzDecreaseButton.setBackground(Color.ORANGE);
        hertzDecreaseButton.setText("-");
        hertzDecreaseButton.setFont(this.fontForButtons);
        hertzDecreaseButton.setVisible(true);

        decreaseHertzButton decreaseButton = new decreaseHertzButton();
        hertzDecreaseButton.addActionListener(decreaseButton);

        this.board.add(hertzDecreaseButton);
    }

    /**
     * Method that increases the current Hz value
     */
    private void increaseHertzButton() {

        JButton hertzIncreaseButton = new JButton();

        hertzIncreaseButton.setBounds(550,350,50,50);
        hertzIncreaseButton.setBackground(Color.ORANGE);
        hertzIncreaseButton.setText("+");
        hertzIncreaseButton.setFont(this.fontForButtons);
        hertzIncreaseButton.setVisible(true);

        increaseHertzButton increaseButton = new increaseHertzButton();
        hertzIncreaseButton.addActionListener(increaseButton);

        this.board.add(hertzIncreaseButton);
    }

    public static class fastestHertzButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Main.hertz = 240;
        }
    }
    public static class middletHertzButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Main.hertz = 60;
        }
    }
    public static class slowestHertzButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Main.hertz = 24;
        }
    }

    public static class decreaseHertzButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(Main.hertz > 1) {

                Main.hertz--;
            }
        }
    }

    public static class increaseHertzButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(Main.hertz > 1) {

                Main.hertz++;
            }
        }
    }
}