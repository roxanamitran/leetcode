package recapitulare_colectii;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    private Deque<Integer> myStack;

    public MyStack() {
        this.myStack = new ArrayDeque();
    }

    public void push(int x) {
        myStack.addFirst(x);
    }

    public int pop() {
        return myStack.removeFirst();
    }

    public int top() {
        return myStack.peekFirst();
    }

    public boolean empty() {
        return myStack.isEmpty();
    }
}
