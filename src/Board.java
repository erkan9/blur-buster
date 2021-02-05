import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Board extends JPanel {

    Date startDate = new Date();

    Font fontForHertzDisplay = new Font("Tacoma", Font.PLAIN, 55);
    Font fontForProgramTopic = new Font("Tacoma", Font.PLAIN, 15);

    /**
     * Method that paints the spinning triangles
     * @param g Object of Graphics
     */
    public void paintComponent(Graphics g) {

        int seconds = (int) ((new Date().getTime() - this.startDate.getTime()) / 5);

        g.setColor(Color.ORANGE);

        for(int arcCounter = 0; arcCounter < 3; arcCounter++) {

            g.fillArc(50,50,300,300, seconds + 120 * arcCounter, 60);
        }

        displayHertzNumber(g);

       displayTopic(g);
    }

    /**
     * Method that displays the name of the program
     * @param g Object of Graphics g
     */
    private void displayTopic(Graphics g) {

        g.setFont(this.fontForProgramTopic);
        g.drawString("BLUR BLUSTER", 5 ,40);
    }

    /**
     * Method that parses the Hz value to string, so it can be displayed
     * @param g Object of Graphics g
     */
    private void displayHertzNumber(Graphics g) {

        String hertzCount = Integer.toString(Main.hertz);
        g.setFont(this.fontForHertzDisplay);
        g.drawString(hertzCount, 452, 395);
    }
}