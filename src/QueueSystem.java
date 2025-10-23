// Singleton Class
public class QueueSystem {
    private static volatile QueueSystem instance; // 
    private int currentNumber;

    // Ensures this cannot be accessed directly from the outside
    private QueueSystem() {
        currentNumber = 0;
    }

    public static QueueSystem getInstance() {
        if (instance == null) {
            synchronized (QueueSystem.class) {
                if (instance == null) {
                    instance = new QueueSystem();
                }
            }
        }
        return instance;
    }

    public synchronized void getNextNumber() {
        currentNumber++;
        System.out.println("Next number in queue: " + currentNumber);
    }

    public synchronized void getCurrentNumber() {
        System.out.println("Current number in queue: " + currentNumber);
    }

    public synchronized void resetQueue(int newNumber) {
        currentNumber =  newNumber;
        System.out.println("Queue has been reset. New number is " + currentNumber);
    }
}