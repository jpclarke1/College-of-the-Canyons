/* 
      * Project #4 Queue ADT
      * Source Code File: ADTQueue.java 
      * Programmer: Joshua Clarke
      * Due: 4/28/22 
      * Description: This ADT is a queue
      */ 

      public class ADTQueue { 
        private Node head, tail;

        public ADTQueue() {
          head = null;
          tail = null;
        }

        //enqueue method adds an object to the end of the queue
        public void enqueue(String newItem) {
                Node i = new Node(newItem, null);
                if (isEmpty()) {
                        head = i;
                        tail = i;
                } else {
                        tail.setNext(i);
                        tail = i;
                }
        }

        //dequeue method dequeues an object and returns that object, returns "Queue is Empty" if empty
        public String dequeue() {
                if (head != null) {
                        String item = head.getItem();
                        head = head.getNext();
                        if (head == null) {
                        tail = null;
                        }
                        return item;
                }
            return "Queue is Empty";
        }

        //dequeueAll method clears the queue
        public void dequeueAll() {
          int size = this.size();
          for(int i = 0; i < size; i++) {
            this.dequeue();
        }
        }

        //peek method outputs the head node without deleting it from the queue
        public String peek() {
          return head.getItem();
        }

        //get method returns the object at any index of the linked list (only included for use in toString method, should be private)
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

      //isEmpty method returns true if the queue is empty
        public boolean isEmpty() {
          if (size() == 0) {
              return true;
          } else {
              return false;
          }
      }

      //size method returns the size of the queue
        public int size() {
          int size = 0;
          for (Node curr = head; curr != null; curr = curr.getNext())
          {
              size++;
          }
          return size;
      }

      //toString returns the objects in the queue as a string
      public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < this.size(); i++) {
             str.append("\n" + this.get(i));
        }
        return str.toString();
    }
      }