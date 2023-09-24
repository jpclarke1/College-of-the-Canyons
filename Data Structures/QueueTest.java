/* 
      * Project #4 Queue ADT Test class
      * Source Code File: QueueTest.java 
      * Programmer: Joshua Clarke
      * Due: 4/28/22 
      * Description: This is a test class for ADTQueue.java that tests all of the ADTQueue methods
      */ 
public class QueueTest {
    public static void main(String[] args) {
        ADTQueue Queue1 = new ADTQueue();
        //Test 1 create and populate new Queue object
        System.out.println("Test1: ");
        System.out.println("Successfully Created Empty Queue");

        Queue1.enqueue("A");
        Queue1.enqueue("B");
        Queue1.enqueue("C");
        Queue1.enqueue("D");
        Queue1.enqueue("E");
        Queue1.enqueue("F");
        Queue1.enqueue("G");
        Queue1.enqueue("H");
        Queue1.enqueue("I");
        Queue1.enqueue("J");
        System.out.println("Successfully Enqueued 10 items (letters A - J)\n");

        //Test 2 toString method
        System.out.print("Test2: ");
        System.out.println(Queue1.toString());
        System.out.println("toString Successful");
        System.out.println("Size: "+Queue1.size() + "\n");

        //Test 3 dequeue method
        System.out.println("Test3: ");
        System.out.println("Dequeueing...");
        for(int i = 0; i < 5; i++) {
            System.out.println(Queue1.dequeue());
       }
       System.out.println("Successfully Dequeued 5 items");
       System.out.println("Queue: " + Queue1.toString() + "\n");

       //Test 4 enqueue method
       System.out.println("Test4: ");
       Queue1.enqueue("X");
        Queue1.enqueue("Y");
        Queue1.enqueue("Z");
       System.out.println("Successfully Enqueued 3 items (X,Y,Z)");
       System.out.println("Queue: " + Queue1.toString() + "\n");

       //Test 5 peek method
       System.out.println("Test5: ");
       System.out.println(Queue1.peek() + " is the first item in Queue\n");
        
        //Test 6 get method (I included this for the sake of testing ALL methods but this method would be private otherwise)
        System.out.println("\nTest6: ");
        System.out.println("Printing second item in Queue (G)");
        System.out.println(Queue1.get(1));

        System.out.println("Printing fifth item in Queue (J)");
        System.out.println(Queue1.get(4));

        System.out.println("Printing first item in Queue (F)");
        System.out.println(Queue1.get(0));

        System.out.println("Printing ninth item in Queue (Blank if successful)");
        System.out.println(Queue1.get(8));

        System.out.println("Printing hundredth item in Queue (Blank if successful)");
        System.out.println(Queue1.get(99));

        System.out.println("Printing negative 1 item in Queue (Blank if successful)");
        System.out.println(Queue1.get(-1));

     //Test 7 dequeueAll method
     System.out.println("Test7: ");
     Queue1.dequeueAll();
      if (Queue1.isEmpty() == true) {
          System.out.println("Successfully Emptied Queue1");
      }
      else { 
          System.out.println("Error, Queue1 not empty");
      }
      System.out.println("Queue1 contains " 
              + Queue1.size() + " items. \n");
    }
}
