package Domain.ADTs;

import java.util.Stack;

public class MyStack<T1> implements IStack<T1> {
    private Stack<T1> stack;

    public MyStack() {
        this.stack = new Stack<T1>();
    }

    @Override
    public void push(T1 elem) {
        this.stack.push(elem);
    }

    @Override
    public T1 pop() {
        return this.stack.pop();
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public int size() {
        return this.stack.size();
    }


    @Override
    public String toString() {
       String printStack = "";
       for (T1 elem : this.stack)
           printStack = printStack + elem.toString() + "\n";
       return printStack;
    }

    public Stack<T1> getStack() {
        return this.stack;
    }
}
