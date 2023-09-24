/**
 *
 * Programmer: Benjamin Riveira
 */
public class Node {
    private String item;
    private Node next;
    
    public Node() {
        item = "";
        next = null;
    }
    public Node(String newItem) {
        setItem(newItem);
        next = null;
    }
    public Node(String newItem, Node newNext) {
        setItem(newItem);
        setNext(newNext);    
    }
    public void setItem(String newItem) {
        item = newItem;
    }
    public void setNext(Node newNext) {
        next = newNext;
    }
    public String getItem() {
        return item;
    }
    public Node getNext() {
        return next;
    }
}
