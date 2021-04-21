package Stack;

import java.util.ArrayList;

public class StackAggregation {

    private ArrayList<Object> items;
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    public Object top()
    {
        if(!isEmpty())
        {
            return items.get(items.size()-1);
        }
        return null;
    }

    public boolean isFull(){
        if(items.size()==capacity-1){
            return true;
        }
        return false;
        //items.size() == capacity;
    }

    public void pop(){
        items.remove(items.size()-1);
    }

    public void push(int item){
        if(!isFull()){
            items.add(item);
        }
        else{
            System.out.println("A verem ures!");
        }
    }

    public void push(ArrayList items, int item, int sp){
        if(!isFull()){
            items.add(item);
        }
        else{
            System.out.println("A verem ures!");
        }
}

    public int getSize(){
        return this.items.size();
    }

    public boolean isEmpty(){
        if(items.size()==capacity){
            return true;
        }
        return false;
    }
}
