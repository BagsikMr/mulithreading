package pl.KacperSuzonowicz;

public class DivisibleByTwoThread extends Thread {
    private volatile int sharedValue;
    private int value;

    public void setSharedValue(int value) {
        sharedValue = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        while (true) {
            value +=1;

            if (value % 2 == 0) {
                if(value <= sharedValue && value % 3 == 0)
                {
                    System.out.println("Watek pz2: Powtorzona wartosc" + value);
                }
                else
                {
                    System.out.println("Watek podzielny przez 2: " + value);
                }

            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
