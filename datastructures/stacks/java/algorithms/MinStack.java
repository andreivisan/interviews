import java.util.Stack;

public class MinStack {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        dataStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (dataStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public void printStack() {
        dataStack.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MinStack myStack = new MinStack();

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

        System.out.println("Minimum: " + myStack.getMin());

    }
}
