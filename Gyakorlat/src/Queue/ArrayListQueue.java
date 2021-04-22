package Queue;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue {

   private ArrayList<Object> items;
   private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new ArrayList<>(CAPACITY);
    }

    @Override
    public boolean isEmplty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
    if (!isFull()){
        this.items.add(obj);
    }
    else
        System.out.println("Tele van");
    }

    @Override
    public Object deQueue() {
       if(!isEmplty())
       {
           Object aux = this.items.get(0);
           this.items.remove(0);
           return aux;
       }
         return null;
    }

    @Override
    public void printQueue() {
        for (Object i : items) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayListQueue)) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        if(this.items.size() != that.items.size()) return false;
        for (int i = 0; i < this.items.size(); ++i)
        {
            if(this.items.get(i) != that.items.get(i)) return false;
        }
        return Objects.equals(items, that.items);
    }
}
