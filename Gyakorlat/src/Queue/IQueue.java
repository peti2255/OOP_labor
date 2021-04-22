package Queue;

public interface IQueue {
   boolean isEmplty();
   boolean isFull();
   void enQueue(Object obj);
   Object deQueue();
   void printQueue();
}
