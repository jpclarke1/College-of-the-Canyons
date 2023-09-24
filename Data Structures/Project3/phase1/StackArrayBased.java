/* 
      * Project #3 StackArrayBased
      * Source Code File: StackArrayBased.java 
      * Programmer: copied from the book
      */ 
public class StackArrayBased implements StackInterface {
private Object items[];
private int top;

public StackArrayBased() {
    items = new Object[50];
    top = -1;
    } // end default constructor

    public boolean isEmpty() {
    return top < 0;
    } // end isEmpty

    public boolean isFull() {
    int StackSize = items.length;
    return top == StackSize-1;
    } //end isFull

    public void push(Object newItem) throws StackException {
    if (!isFull()) {
    items[++top] = newItem;
    }
    else {
      Object newArray[] = new Object[items.length*2];
      System.arraycopy(items, 0, newArray, 0, items.length);
      items = newArray;
      items[++top] = newItem;
    } // end if
    } // end push

    public void popAll() {
    int StackSize = items.length;
    items = new Object[StackSize];
    top = -1;
    } // end popAll

    public Object pop() throws StackException {
    if (!isEmpty()) {
    return items[top--];
    }
    else {
    throw new StackException("StackException on " +
    "pop: stack empty");
    } // end if
    } // end pop

    public Object peek() throws StackException {
    if (!isEmpty()) {
    return items[top];
    }
    else {
    throw new StackException("Stack exception on " +
    "peek - stack empty");
    } // end if
    } // end peek
    } // end StackArrayBased