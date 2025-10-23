public class HelpDesk {
    public static void main(String[] args) {
        QueueSystem queue = QueueSystem.getInstance();

        // Displays the current number in queue
        queue.getCurrentNumber();
        
        // Displays the next number in queue
        queue.getNextNumber();
        
        // Resets queue and replaces it with a new number as parameter
        queue.resetQueue(0);
    }
}