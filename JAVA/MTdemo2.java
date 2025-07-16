class Clock implements Runnable {
    private int hour = 0;
    private int min = 0;
    private int sec = 0;

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000); // 1 second delay
                sec++;
                if (sec == 60) {
                    sec = 0;
                    min++;
                }

                if (min == 60) {
                    min = 0;
                    hour++;
                }

                if (hour == 24) {
                    hour = 0;
                }

                // Print in same line using carriage return \r
                System.out.printf("\rTime => %02d:%02d:%02d", hour, min, sec);
               // System.out.flush();
	       //00:00:02
            }
        } catch (InterruptedException e) {
            System.out.println("Clock interrupted");
        }
    }
}

public class MTdemo2 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Thread t = new Thread(clock);
        t.start(); // Start the clock thread
    }
}
