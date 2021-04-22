package Queue;

public class CircularQueue implements IQueue {

    private final int CAPACITY;
    private Object[] items;
    private int first;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.first = -1;
        this.rear = -1;
    }

    @Override
    public boolean isEmplty() {
        return first == -1 && rear == -1;
//        if(items.length == 0)
//            return true;
//        return false;
    }

    @Override
    public boolean isFull() {
        if(first == 0 && rear == CAPACITY)
            return true;
        if(rear + 1 == first)
            return true;
        return false;
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()){
           if (first == -1)
           {
               first = 0;
           }
           rear = (rear +1)%CAPACITY;
           items[rear] = obj;
        }
        else{
            System.out.println("A lista tele van!");
        }

    }

    @Override
    public Object deQueue() {
        return null;
    }

    @Override
    public void printQueue() {
        for (int i = 0; i <CAPACITY; i++)
        {
            System.out.print(items[i]);
        }
    }
}
