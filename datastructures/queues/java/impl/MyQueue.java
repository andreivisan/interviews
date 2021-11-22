import java.util.ArrayList;
import java.util.List;

class MyQueue {
    private List<Integer> data;

    private int startPointer;

    public MyQueue() {
        data = new ArrayList<>();
        startPointer = 0;
    }

    public boolean isEmpty() {
        return startPointer >= data.size();
    }

    public boolean enqueue(int x) {
        data.add(x);
        return true;
    }

    public boolean dequeue() {
        if (isEmpty() == true) {
            return false;
        }

        data.remove(startPointer);
        return true;
    }

    public int front() {
        return data.get(startPointer);
    }

    public void print() {
        data.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        System.out.println("My Queue");
        myQueue.print();

        System.out.println("First Element Added: " + myQueue.front());

        myQueue.dequeue();
        System.out.println("First Element after dequeue: " + myQueue.front());

        myQueue.print();
    }
}