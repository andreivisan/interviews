import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyStack {

    private List<Integer> data;

    public MyStack() {
        data = new ArrayList<>();
    }

    public void push(int value) {
        data.add(value);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public boolean pop() {
        if (data.isEmpty()) {
            return false;
        }

        data.remove(data.size() - 1);
        return true;
    }

    public void printStack() {
        List<Integer> reverse = new ArrayList<>(data);
        Collections.reverse(reverse);
        reverse.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("==== MY STACK ====");
        myStack.printStack();

        System.out.println("Top of my stack:" + myStack.top());

        myStack.pop();

        System.out.println("==== MY STACK AFTER POP ====");
        myStack.printStack();

    }

}
