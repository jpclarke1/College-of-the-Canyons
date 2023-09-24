
/**
 *
 * Programmer: Benjamin Riveira
 */
public class Node {
    private char item;
    private Node next;
    
    public Node() {
        item = ' ';
        next = null;
    }
    public Node(char newItem) {
        setItem(newItem);
        next = null;
    }
    public Node(char newItem, Node newNext) {
        setItem(newItem);
        setNext(newNext);    
    }
    public void setItem(char newItem) {
        item = newItem;
    }
    public void setNext(Node newNext) {
        next = newNext;
    }
    public char getItem() {
        return item;
    }
    public Node getNext() {
        return next;
    }
}
