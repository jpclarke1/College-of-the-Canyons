/* 
      * Project #3 StackTester
      * Source Code File: StackTester.java 
      * Programmer: Joshua Clarke
      * Due: 4/12/22 
      * Description: This is a test of my modified implementation of StackArrayBased, it pushes 
      * and pops 50, 100, and 200 items from a StackArrayBased object and displays those items 
      * in the order that they are pushed and popped.
      */ 
public class StackTester {


public static void main(String[] args) {
StackArrayBased stack= new StackArrayBased();

for (int i=0; i<51 ; i++) {
System.out.println(i);
stack.push(i);
}
System.out.println("Successfully pushed 51 items\n");

while (!stack.isEmpty()) {
System.out.println((stack.pop()));
}
System.out.println("Successfully popped 51 items\n");

for (int i=0; i<101 ; i++) {
    System.out.println(i);
    stack.push(i);
    }
    System.out.println("Successfully pushed 101 items\n");
    
    while (!stack.isEmpty()) {
    System.out.println((stack.pop()));
    }
    System.out.println("Successfully popped 101 items\n");

for (int i=0; i<201 ; i++) {
    System.out.println(i);
    stack.push(i);
    }
    System.out.println("Successfully pushed 201 items\n");
    
    while (!stack.isEmpty()) {
    System.out.println((stack.pop()));
    }
    System.out.println("Successfully popped 201 items");
}
}