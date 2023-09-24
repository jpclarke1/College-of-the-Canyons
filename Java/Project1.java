import java.util.Scanner;
public class Project1 {
    /**
     * 
     * @author Joshua Clarke
     * All Code for Programming Project #1
     */
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);

    /**         
     * CircleArea prompts the user to enter a number as the radius and 
     * returns the area of a circle with the given radius.
     */
    System.out.println("\nCircleArea:");
    //prompts the user to input a number for radius
    System.out.println("Enter a Radius");
       double radius = scan.nextDouble();
       //computes the area of a circle with user defined radius
       double area = 3.14159*radius*radius;
       System.out.println("The area of a circle with radius " + radius + " is " + area + ".");

    /**
     * TicTacSchmoe prints out three different tic tac toe winning results 
     * making each one bigger than the last, separated by more spaces and lines.
     */
       System.out.println("\nTicTacSchmoe:");
       System.out.println("XOO\nOXO\nOOX\n");
       System.out.println("O O X\n\nO X O\n\nX O O\n\n");
       System.out.println("X  X  X\n\n\nO  X  O\n\n\nX  O  O\n\n");

    /**
     * TriangleArea computes the area of a triangle with a given base of 3.5 and height of 4.85.
     */
       System.out.println("TriangleArea:");
       //define variables for base and height
       double base = 3.5;
       double height = 4.85;
       //compute for area
       double Triarea = 0.5*base*height;
       System.out.println("The area of a triangle with base 3.5 and height 4.85 is " + Triarea + ".");

    /**
     * MilestoKilometers converts the given quantity of 60 miles to kilometers.
     */
       System.out.println("\nMilestoKilometers:");
       //define variable miles
       double miles = 60;
       //converts miles to kilometers 
       double kiloconversion = miles*1.60934;
       System.out.println("60 Miles = " + kiloconversion + " Kilometers.");

    /**
     * MyInitials displays my initials (JC) in a cool pattern.
     */
       System.out.println("\nMyInitials:\n");
       System.out.println("J J J J J J J J         CCCCCCC )");
       System.out.println("J J J J J J J J      CCC )       CC)");
       System.out.println("      J J          CC )");
       System.out.println("      J J         CC )");
       System.out.println("      J J         CC )");
       System.out.println("      J J         CC )");
       System.out.println("J J   J J          CC )");
       System.out.println("J J J J J            CCC )        CC)");
       System.out.println("  J J J                 CCCCCCC )\n");

    /**
     * DoubleUp prompts the user to enter a number, then outputs double that number
     */
       System.out.println("DoubleUp:");
       //prompts the user to input a number
       System.out.println("Input a number");
       double num = scan.nextDouble();
       //doubles user inputed number
       double doubnum = 2*num;
       System.out.println("Double up is " + doubnum);
    }
}