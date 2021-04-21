package Stack;

import java.util.ArrayList;

public class StackInheritance {
    private ArrayList<Object> items;

    public StackInheritance(ArrayList<Object> items) {
        this.items = items;
    }

    boolean isEmpty()
    {
     return items.isEmpty();
    }

    public int getSize()
    {
        return items.size();
    }

    public Object pop()
    {
        Object o = items.get(getSize()-1);
        items.remove(getSize()-1);
        return o;
    }
}
