import java.util.Stack;

public class CustomStack {
    private int capacity ;
    private Stack <Integer> S = new Stack<>();
    public CustomStack(int c)  {
        capacity=c;
    }
    public void AddElement(int element) {
        if (S.size() < capacity )
            S.push(element);
        else System.out.println("StackFullException");
    }
    public void RemoveElement() {
        if (!S.isEmpty())
                S.pop();
    }
    public int LastInStack ()  {
        if (!S.isEmpty())
            return S.peek();
        else return -11111;
    }
    public boolean StackIsEmpty() {
        return S.isEmpty();
    }
    public boolean StackIsFull() {
        return (S.size()==capacity);
    }
    public int get_cap() {
        return this.capacity;
    }


}
