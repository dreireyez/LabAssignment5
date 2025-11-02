public class HelpDesk {
    public static void main(String[] args) {
        
        System.out.println("PAG-IBIG Centralized Queuing System");
        
        // Three help desks obtain the same QueueSystem instance
        QueueSystem helpDesk1 = QueueSystem.getInstance();
        QueueSystem helpDesk2 = QueueSystem.getInstance();
        QueueSystem helpDesk3 = QueueSystem.getInstance();
        System.out.println("Three help desks are now accepting inquiries.\n");
        
        // Each desk requests next number
        helpDesk1.getNextNumber();
        helpDesk2.getNextNumber();
        helpDesk3.getNextNumber();

        // Online queue monitoring
        QueueSystem monitor = QueueSystem.getInstance();
        System.out.println("\nOnline Monitoring System");
        monitor.getCurrentNumber();

        // Resetting the queue
        helpDesk1.resetQueue(1);

        // Displaying updated number
        System.out.println("\nOnline Monitoring System");
        monitor.getCurrentNumber();
    }
}