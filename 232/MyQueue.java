package recapitulare_colectii;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    private Deque<Integer> myQueue;

    public MyQueue() {
        this.myQueue = new ArrayDeque<>();
    }

    public void push(int x) {
        myQueue.addLast(x);
    }

    public int pop() {
        return myQueue.removeFirst();
    }

    public int peek() {
        return myQueue.peekFirst();
    }

    public boolean empty() {
        return myQueue.isEmpty();
    }
}
