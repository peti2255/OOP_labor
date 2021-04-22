package Stack;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {

    private int capacity=10;

    public StackInheritance(int capacity) {
        super(capacity);
        this.capacity = capacity;
    }

    public void push(Object obj){

        if(super.size()!=capacity){
            super.add(obj);
        }else
        {
            System.out.println("A verem tele van");
        }
    }
    public int getSize(){
        return this.size();
    }

    public boolean isFull(){
        return this.getSize()==this.capacity;
    }

    public boolean isEmpty(){
        return this.getSize()==0;
    }

    public Object pop(){

        if(!this.isEmpty()){
            Object ob = super.get((this.getSize()-1));
            super.remove(this.getSize()-1);
            return ob;
        }
        return null;
    }
    public Object top(){
        if(!this.isEmpty())
            return super.get(getSize()-1);
        return null;
    }
}
