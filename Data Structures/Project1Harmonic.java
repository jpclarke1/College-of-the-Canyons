/* 
      * Project #1 Exercise 2 
      * Source Code File: Project1Harmonic.java 
      * Programmer: Joshua Clarke
      * Due: 3/8/22 
      * Description: This shows a recursive way of calculating a harmonic sum in Java using user 
      * inputted numbers.  
      */ 
      import java.util.Scanner;
      public class Project1Harmonic {
          
      private static double harmonicSum(double n){
          double harmonicnum;
          if (n==1) { 
            harmonicnum = 1;
          }
          else {
            harmonicnum = (1/n) + (harmonicSum(n-1));
          }
          return harmonicnum;
      }

      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter a number and I will determine its harmonic sum: ");
          double n = scan.nextDouble();
          System.out.println("The harmonic sum of " + n + " is " + harmonicSum(n));
      }
    }