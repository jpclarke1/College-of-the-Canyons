import java.util.*;
import java.util.Scanner;
/**
     * 
     * @author Joshua Clarke
     * class Race is copied from Prof. Koenig's Midterm directions
     * 
     * class MidtermText is a text based horse betting simulator where the user is given a menu with
     * betting options (exacta, exactabox, trifecta, trifectabox), an option to check balance, and an 
     * option to exit. The user starts the simulation with $200 and has the option to keep betting until 
     * they either run out of money or exit.
     */
public class MidtermText {
    public static class Race {
        // A race simulating bot that Implements a Fisher–Yates shuffle
        
                int[] array = {1, 2, 3, 4};
        // constructor
        
                void Race() {
                }
        // run the imaginary race
        
                void readysetgo() {
                    int n = array.length;
                    Random random = new Random();
        // Loop over array.
                    for (int i = 0; i < array.length; i++) {
        // Get a random index of the array past the current index.
        // ... The argument is an exclusive bound.
        // It will not go past the array's end.
                        int randomValue = i + random.nextInt(n - i);
        // Swap the random element with the present element.
                        int randomElement = array[randomValue];
                        array[randomValue] = array[i];
                        array[i] = randomElement;
                    }
                } // end shuffle
        
                int first() {
                    return array[0];
                }
        
                int second() {
                    return array[1];
                }
        
                int third() {
                    return array[2];
                }
        
                int fourth() {
                    return array[3];
                }
        
                int[] getarray() {
                    return array;
                }
            } // end class

            //class for Bank.money variable to keep track of money
            public static class Bank {
                 static int money = 200;
            }//end class

            public static void main(String args[]) {
                Scanner scan = new Scanner(System.in);
                int exit = 0;
                //loop to keep running races until user exits or runs out of money
                while (exit == 0 && Bank.money > 0) {

                //uses readysetgo function
                Race r = new Race();
                r.readysetgo();
                
                //cheat for testing purposes (usually this info would be shown after a bet is placed)
                System.out.println("\nFirst place is " + r.first());
                System.out.println("Second place is " + r.second());
                System.out.println("Third place is " + r.third());
                System.out.println("Fourth place is " + r.fourth());

                //text menu
                System.out.println("\nWelcome to Horse Betting!:");
                System.out.println("Exacta          Price:$10");
                System.out.println("ExactaBox       Price:$5");
                System.out.println("Trifecta        Price:$25");
                System.out.println("TrifectaBox     Price:$20");
                System.out.println("Balance");
                System.out.println(":Exit:");
                String str = scan.next();

                //switch case for different menu options
                switch (str) {
                //Exacta asks for the first and second place horses and checks if user entered numbers match up directly
                case "Exacta": 
                Scanner scane = new Scanner(System.in);
                    System.out.println("\nChoose a horse to come in first place:");
                    int first = scane.nextInt();
                    System.out.println("Choose a horse to come in second place:");
                    int second = scane.nextInt();

                    //checks if user entered numbers match up, adds or subtracts money from bank based on win or loss
                    if (first == r.first() && second == r.second()) {
                        System.out.println("You won $100!");
                        Bank.money = Bank.money + 100;
                        } else {
                        System.out.println("You lost");
                        Bank.money = Bank.money - 10;
                        }
                break;
                //ExactaBox asks for the first and second place horses and checks if user entered numbers match up, do not need to be in order
                case "ExactaBox":
                Scanner scaneb = new Scanner(System.in);
                    System.out.println("\nChoose a horse to come in first or second place:");
                    int firsteb = scaneb.nextInt();
                    System.out.println("Choose a horse to come in first or second place:");
                    int secondeb = scaneb.nextInt();

                    //checks if user entered numbers match up, adds or subtracts money from bank based on win or loss
                    if (firsteb == r.second() && secondeb == r.first()) {
                        System.out.println("You won $50!");
                        Bank.money = Bank.money + 50;
                        } else { if (firsteb == r.first() && secondeb == r.second()) {
                            System.out.println("You won $50!");
                            Bank.money = Bank.money + 50;
                        } else {
                        System.out.println("You lost");
                        Bank.money = Bank.money - 5;
                        }
                        }
                break;
                //Trifecta asks for the first, second, and Third place horses and checks if user entered numbers match up directly
                case "Trifecta": 
                Scanner scant = new Scanner(System.in);
                    System.out.println("\nChoose a horse to come in first place:");
                    int firstt = scant.nextInt();
                    System.out.println("Choose a horse to come in second place:");
                    int secondt = scant.nextInt();
                    System.out.println("Choose a horse to come in third place:");
                    int thirdt = scant.nextInt();

                    //checks if user entered numbers match up, adds or subtracts money from bank based on win or loss
                    if (firstt == r.first() && secondt == r.second() && thirdt == r.third()) {
                        System.out.println("You won $200!");
                        Bank.money = Bank.money + 200;
                        } else {
                        System.out.println("You lost");
                        Bank.money = Bank.money - 25;
                        }
                break;
                //ExactaBox asks for the first, second, and third place horses and checks if user entered numbers match up, do not need to be in order
                case "TrifectaBox": 
                Scanner scantb = new Scanner(System.in);
                    System.out.println("\nChoose a horse to come in first, second, or third:");
                    int firsttb = scantb.nextInt();
                    System.out.println("Choose a horse to come in first, second, or third:");
                    int secondtb = scantb.nextInt();
                    System.out.println("Choose a horse to come in first, second, or third:");
                    int thirdtb = scantb.nextInt();

                    //checks if user entered numbers match up, adds or subtracts money from bank based on win or loss
                    if ((firsttb == r.first() || firsttb == r.second() || firsttb == r.third()) && (secondtb == r.first() || secondtb == r.second() || secondtb == r.third()) && (thirdtb == r.first() || thirdtb == r.second() || thirdtb == r.third())) {
                        System.out.println("You won $150!");
                        Bank.money = Bank.money + 150;
                        } else {
                        System.out.println("You lost");
                        Bank.money = Bank.money - 20;
                        }
                break;
                //lets user exit with Exit menu option
                case "Exit":
                exit = 1;
                break;
                //Allows user to check balance
                case "Balance":
                System.out.println("You have $" + Bank.money);
                break;
                default: System.out.println("Error Please Enter a Menu Option");
                //breaks loop if user runs out of money
                if (Bank.money <= 0) {
                    System.out.println("You ran out of money!");
                }
                    }
                }
        
            }
            
}