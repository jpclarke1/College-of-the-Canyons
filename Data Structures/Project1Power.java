/* 
      * Project #1 Exercise 1 
      * Source Code File: Project1Power.java 
      * Programmer: Joshua Clarke
      * Due: 3/8/22 
      * Description: This shows an iterative and recursive way of calculating a power in Java.  
      */ 
      import java.lang.Math;
      public class Project1Power {

        //power1 method calculates x to the n power iteratively 
        private static double power1(double x, int n) {
          double power;
          if (n >= 0){
          power = Math.pow(x,n);
          }
          //power set to -1 to produce error message if n < 0
          else {
           power = -1; 
          }
          return power; 
      }

      //power2 method calculates x to the n power recursively
      private static double power2(double x, int n) {
        double power;
        if (n > 0){
          power = x * power2(x,n-1);
          }
          else {
          if (n == 0) {
            power = 1;
          }
          //power set to -1 to produce error message if n < 0
          else {
           power = -1; 
          }
        }
          return power;  
    }

        public static void main(String[] args) {
            double x=2;
            for (int n = 0; n <= 10; n++)
            {
              if (power1(x,n) >= 0 && power2(x,n) >= 0) {
              System.out.println(x + "^" + n + " = " + power1(x,n) + " computed iteratively.");
              System.out.println(x + "^" + n + " = " + power2(x,n) + " computed recursively.");
              }
              //error message if n < 0
              else {
                System.out.println("error, n must be greater than 0");
              }
            }
            }
          }