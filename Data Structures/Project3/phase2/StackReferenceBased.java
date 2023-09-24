/* 
      * Project #3 StackReferenceBased
      * Source Code File: StackReferenceBased.java 
      * Programmer: copied from the book
      */ 
public class StackReferenceBased
implements StackInterface {
private Node top;

public StackReferenceBased() {
top = null;
} // end default constructor

public boolean isEmpty() {
if (top == null) {
return true;
}
else { return false;
}
}

public void push(char newItem) {
top = new Node(newItem, top);
}// end push

public Object pop() throws StackException {
if (!isEmpty()) {
Node temp = top;
top = top.getNext();
return temp.getItem();
}
else {
throw new StackException("StackException on " +
"pop: stack empty");
}// end if
}// end pop

public void popAll() {
top = null;
}// end popAll

public Object peek() throws StackException {
if (!isEmpty()) {
return top.getItem();
}
else {
throw new StackException("StackException on " +
"peek: stack empty");
}// end if
}// end peek
}// end StackReferenceBased