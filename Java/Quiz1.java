import java.util.Scanner;
import java.lang.Math;
public class Quiz1 {
    /**
     * 
     * @author Joshua Clarke
     * All Code for Quiz #1
     */
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);

    /**         
     * Name uses a for loop to print out my name 10 times
     */
    System.out.println("\nName:");
    //for loop print my name 10 times
    for (int i = 0; i < 10; i++) {
        System.out.println("Joshua Clarke");
      }

    /**         
     * Fifty checks if a user entered double is greater than, equal to, or less than 50
     */
    System.out.println("\nFifty:");
    System.out.println("Enter a Number:");
    double num = scan.nextDouble();
    //checks if number is greater than 50
    if (num > 50) {
    System.out.println("Your number is greater than Fifty");
    }
    else {
    //checks if number is equal than 50
    if (num == 50)
    {
    System.out.println("Your number is equal to Fifty");
    }
    else {
    //if a number is not greater than or equal to 50, it is less
    System.out.println("Your number is less than Fifty");
    }
    }

    /**
     * Absolute find the absolute value of a user inputted double
     */
    System.out.println("\nAbsolute:");
    System.out.println("Enter a Number:");
    //prompts the user to enter a number to find absolute value of
    double val = scan.nextDouble();
    //uses Math.abs function to find absolute value
    System.out.println("The absolute value of your number is " + Math.abs(val));

    /**
     * Random produces a random number between 100 and 200
     */
    System.out.println("\nRandom:");
    //produces a random number between min 100 and max 200
    double rand = (Math.random()) * (100) + 100;
    System.out.println("Here is your random number: " + rand);

    /**
     * Free Choice converts any double entered by the user into radians
     */
    System.out.println("\nFree Choice:");
    System.out.println("Enter a number in Degrees to be converted to Radians:");
    //prompts the user to enter a number in degrees and converts to radians
    double deg = scan.nextDouble();
    double rad = Math.toRadians(deg);
    System.out.println(deg + " degrees equals " + rad + " radians");

    /**
     * Voltage prompts the user to enter a voltage then determines whether or not
     * it is low (0v-29V), medium (30V-60V), high (61V-100V), or very high (100V+).
     */
    System.out.println("\nVoltage:");
    System.out.println("Enter a voltage:");
    //prompts user to enter a voltage and converts to absolute value
    double volt = scan.nextDouble();
    double abvolt = Math.abs(volt);
    //checks if voltage is less than 30V
    if (abvolt < 30){
        System.out.println("Low Voltage");
    }
    else {
        //checks if voltage is less than or equal to 60V and greater than or equal to 30V
        if ((60 >= abvolt) && (abvolt >= 30)){
            System.out.println("Medium Voltage");
        }
        else {
        //checks if voltage is less than or equal to 100V and greater than 60V    
            if ((100 >= abvolt) && (abvolt > 60)){
                System.out.println("High Voltage");
            }
            //any other voltage not between 0 and 100 must be greater than 100
            else {
                System.out.println("CAUTION!!! Very High Voltage!!!");
            }
        }
    }

    /**
     * Namecount prints my name 10 times with the loop count (0-9) next to it
     */
    System.out.println("\nNamecount:");
    for (int i = 0; i < 10; i++) {
        //prints my name 10 times with loop counter i
        System.out.println("Joshua Clarke " + i);
      }

    /**
     * Fiftytally prompts the user to enter nonzero numbers and checks if they are 
     * greater than 50, the user enters 0 to exit, and the program outputs the amount of 
     * entered numbers that are greater than 50.
     */
    System.out.println("\nFiftytally:");
    //variable declaration starts tally at 0 and number at an arbitrary nonzero number less than 50
    int numcount = 0;
    double number = 1;
    //while loop allows for user to exit by entering 0
    while (number != 0) {
    System.out.println("Enter a number (Enter 0 to exit): ");
    //prompts the user to enter a number
    number = scan.nextDouble();
    //checks if number is greater than 50, if it is then 1 is added to the tally
    if (number > 50){
        numcount ++;
    }
    //loop 0 escape statement 
    else {
        if (number == 0) {
            break;
        }
    }
    }
    //outputs tally of numbers greater than 50
    System.out.println(numcount + " of your numbers are greater than 50");
}
}