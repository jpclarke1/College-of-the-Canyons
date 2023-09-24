/* 
      * Project #2 GroceryList ADT
      * Source Code File: ADTGroceryList.java 
      * Programmer: Joshua Clarke
      * Due: 3/22/22 
      * Description: This ADT "simulates" a unsorted grocery list using an interface and a 
      * linear linked list "behind" that interface.
      */ 

      public class ADTGroceryList { 
        private Node head;

        //creates a new empty grocery ADT
        public ADTGroceryList() {
           head = null;
        }

        //creates a new grocery list ADT from an array
        public ADTGroceryList(String[] listItems) {
            for (int i = 0; i < listItems.length; i++) {
                this.add(i, listItems[i]);
            }
        } 
        
        //adds a node to the list with user inputted index
        public void add(int index, String newItem) {
            if (0 <= index && index <= size()) {
                if (index == 0) {
                    if (head == null) {
                        Node i = new Node(newItem);
                        head = i;
                } else {
                Node i = new Node();
                i = head;
                Node j = new Node(newItem);
                j.setNext(i);
                head = j;
                    }
                }
                if (index > 0 && index < size()) {
                    int count = 0;
                    for (Node curr = head; curr != null; curr = curr.getNext()) {
                        if (count == index-1) {
                            Node j = curr.getNext();
                            Node i = new Node(newItem);
                            curr.setNext(i);
                            i.setNext(j);
                        }
                        count ++;
                        }
                }
                if (index == size()) {
                    for (Node curr = head; curr != null; curr = curr.getNext()) {
                        if (curr.getNext() == null) {
                            Node i = new Node(newItem);
                            curr.setNext(i);
                            break;
                        }
                        }
                }
            }
            else {
                System.out.println("error " + index + " is an invalid index number for the item " + 
                newItem);
            }
        }

        //returns item at user inputted index
        public String get(int index) {
            int count = 0;
            Node curr;
            for (curr = head; curr != null; curr = curr.getNext()) {
                if (count == index) {
                    return (curr.getItem());
                }
                count ++;
                }
                return("");
        }

        //removes a node from the list with user inputted index
        public void remove(int index) {
            Node prev = null;
            if (index == 0) {
                head = head.getNext();
            } else if (index > 0 && index < size()-1) {
                int count = 0;
                for (Node curr = head; curr != null; curr = curr.getNext()) {
                    if (count == index-1) {
                        prev = curr;
                    }
                    if (count == index+1)
                    {
                        prev.setNext(curr);
                    }
                    count ++;
                    }
            } else if (index == size()-1) {
                int count = 0;
                for (Node curr = head; curr != null; curr = curr.getNext()) {
                    if (count == index-1) {
                        curr.setNext(null);
                    }
                    count ++;
                    }
            }
        }

        //checks if the grocery linked list is empty
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        //returns the size of the list
        public int size() {
            int size = 0;
            for (Node curr = head; curr != null; curr = curr.getNext())
            {
                size++;
            }
            return size;
        }

        //removes all nodes from linked list by setting head to null
        public void removeAll() {
            head = null;
        }

        // converts elements of Grocery linked list to a string
        public String toString() {
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < this.size(); i++) {
                 str.append("\n" + i + " " + this.get(i));
            }
            return str.toString();
        }
      }