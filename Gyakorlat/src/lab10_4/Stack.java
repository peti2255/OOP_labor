package lab10_4;

import java.util.ArrayList;

public class Stack {

    private final ArrayList<Object>items;
    private final int capacity;

    public  Stack (int capacity)
    {
        this.capacity = capacity;
        this.items = new ArrayList<>(this.capacity);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public boolean isFull() {
        return items.size() == this.capacity;
    }

    public void push(Object o) throws StackException {
        if (isFull())
            throw new StackException("stack is full!");
        items.add(o);
    }

    public Object pop() throws StackException {
        if (!isEmpty()) {
            Object o = items.get(items.size() - 1);
            items.remove(items.size() - 1);

            return o;
        }

        throw new StackException("stack is empty!");
    }

    public Object top(){
        if (!isEmpty())
            return items.get(items.size() - 1);
        return null;
  }

  }
