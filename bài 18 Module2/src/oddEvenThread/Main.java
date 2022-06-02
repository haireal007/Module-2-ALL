package oddEvenThread;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.run();
        try {
            oddThread.join();

        } catch (Exception e) {
            System.err.println(e);
        }
        evenThread.run();
    }
}
