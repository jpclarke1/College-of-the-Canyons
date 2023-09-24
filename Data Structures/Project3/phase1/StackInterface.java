/* 
      * Project #3 StackInterface
      * Source Code File: StackInterface.java 
      * Programmer: copied from the book
      */ 
public interface StackInterface {
public boolean isEmpty();
// Determines whether the stack is empty.
// Precondition: None.
// Postcondition: Returns true if the stack is empty;
// otherwise returns false.

public void popAll();
// Removes all the items from the stack.
// Precondition: None.
// Postcondition : Stack is empty.

public void push(Object newitem) throws StackException;
// Adds an item to the top of a stack.
// Preconditi on : newitem is the item to be added .
// Postcondi tion : If insertion is successful, newitem
// is on the top of the stack.
// Exception: Some implementations may throw
// StackException when newitem cannot be placed on
// the stack.

public Object pop() throws StackException;
// Removes the top of a stack.
// Precondition: None.
// Postcondition: If the stack is not empty, the item
// that was added most recently is removed from the
// stack and returned.
// Exception: Throws StackException if the stack is
// empty.

public Object peek() throws StackException;
// Retrieves the top of a stack.
// Precondition: None.
// Postcondition: If the stack is not empty, the item
// that was added most recently is returned. The
// stack is unchanged.
// Exception: Throws StackException if the stack is
// empty.
} // end StackInterface