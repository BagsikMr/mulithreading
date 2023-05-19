package pl.KacperSuzonowicz;

public class Main {
    public static void main(String[] args) {
        DivisibleByTwoThread thread1 = new DivisibleByTwoThread();
        DivisibleByThreeThread thread2 = new DivisibleByThreeThread();

        thread2.start();
        thread1.start();


        while (true) {
            thread1.setSharedValue(thread2.getValue());
            thread2.setSharedValue(thread1.getValue());
        }
    }
}

