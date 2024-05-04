package recapitulare_colectii;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private Deque<Integer> values;
    private Deque<Integer> min;


    public MinStack() {
        this.values = new ArrayDeque<>();
        this.min = new ArrayDeque<>();
    }

    public void push(int val) {
        if (values.isEmpty()) {
            values.addFirst(val);
            min.addFirst(val);
        } else {
            values.addFirst(val);
            min.addFirst(val < min.peekFirst() ? val : min.peekFirst());
        }
    }

    public void pop() {
        values.removeFirst();
        min.removeFirst();
    }

    public int top() {
        return values.peekFirst();
    }

    public int getMin() {
        return min.peekFirst();
    }
}
