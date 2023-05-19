package pl.KacperSuzonowicz;

public class DivisibleByThreeThread extends Thread {
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
            value += 1;
            //System.out.println("PZ3: "+ value);
            if (value % 3 == 0 ) {
                if(value <= sharedValue && value % 2 == 0)
                {
                    System.out.println("Watek pz3: Powtorzona wartosc" + value);
                }
                else
                {
                    System.out.println("Watek podzielny przez 3: " + value);
                }


            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
