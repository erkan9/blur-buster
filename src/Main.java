/**
 * @author Erkan Kamber
 */
public class Main implements Runnable {

    GUI gui = new GUI();

    public static int hertz = 60;

    final int NANO_SECONDS_IN_ONE_SECOND = 1_000_000_000;

    // Method that returns the current value of the most precise available system timer, in nanoseconds
    long timeElapsed = System.nanoTime();

    public static void main(String[] args) {

        new Thread(new Main()).start();
    }

    @Override
    public void run() {

        while (true) {

            if( (System.nanoTime() - timeElapsed) > NANO_SECONDS_IN_ONE_SECOND / hertz) {

                gui.repaint();

                timeElapsed = System.nanoTime();
            }
        }
    }
}
