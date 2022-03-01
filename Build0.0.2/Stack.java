import java.util.ArrayList;
import java.util.List;

public class Stack{
    List<Integer> container = new ArrayList<>();
    public void add(int data){
        container.add(data);
    }
    public void remove(){
        container.remove(container.size()-1);
    }
    public int peek(){
        if(container.isEmpty())return -1;
        int top = container.get(container.size()-1);
        return top;
    }
}