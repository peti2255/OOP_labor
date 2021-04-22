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
        return items.size()==capacity;
    }

    public void pop(){
        items.remove(items.size()-1);
    }

    public void push(int item){
        if(!isFull()){
            items.add(item);
        }
        else{
            System.out.println("A verem tele van");
        }
    }

    public void push(Object obj){

        if(!isFull()){
            items.add(obj);
        }else {
            System.out.println("A verem tele van");
        }
    }

    public int getSize(){
        return this.items.size();
    }

    public boolean isEmpty(){
        if(items.size()==0){
            return true;
        }
        return false;
    }
}
