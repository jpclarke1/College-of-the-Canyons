import java.util.Scanner;
import java.lang.Math;
public class Project2 {
    /**
     * 
     * @author Joshua Clarke
     * All Code for Project #2
     */
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);

    /**         
     * Ticket Discount tells the user that tickets cost $14 and asks the to enter
     * their age to see if they are eligible for either a minor or senior discount,
     * if they are eligible, discounted price of $10 is outputted.
     */
    System.out.println("\nTicket Discount:");
    System.out.println("Tickets cost $14");
    //prompts the user to enter their age
    System.out.println("Please enter your age:");
    double age = scan.nextDouble();
    //fail-safe if negative or decimal is entered 
    age = Math.floor(age);
    while (age < 0) {
        System.out.println("That is not a real age, please enter your age:");
        age = scan.nextDouble();
        age = Math.floor(age);
    }
    //checks for discounts based on entered age 
    if (age < 18) {
        System.out.println("You get $10 admission for being a minor");
    }
    else {
        if (age >= 65) {
        System.out.println("Senior discount: Tickets are $10");
        }
        else {
            System.out.println("Sorry, no discount found; Tickets are $14");
        }
    }

    /**         
     * Did I Fail? prompts the user to enter their score from 1-100
     * (although 0 is also accepted) and tells the user their grade 
     * based on the score they entered.
     */
    System.out.println("\nDid I Fail?:");
    //prompts the user to enter a score 1-100 (0 is also accepted)
    System.out.println("Please input your score (1 - 100):");
    double score = scan.nextDouble();
    //fail-safe if out of range is entered 
    while (score > 100 || score < 0) {
        System.out.println("Score was out of range, Please input your score (1 - 100):");
        score = scan.nextDouble();
    }
    //assigns a variable to each score range so that a switch statement can be used
    int range = 0;
        if (score > 0 && score < 60 )
        {
            range = 1;
        }
        else {
            if (score >= 60 && score < 70) {
                range = 2;
            }
            else {
                if (score >= 70 && score < 80) {
                range = 3;
                }
                else {
                    if (score >= 80 && score < 90) {
                        range = 4;
                        }
                        else {
                            if (score >= 90) {
                        range = 5;
                         }
                    }
                }
            }
         }
    //switch statement outputs grade base on preassigned variable for score range
    switch (range) {
        case 0:
        System.out.println("You did not turn in your assignment, you failed.");
        break;
        case 1:
        System.out.println("Yeah you did fail, I’m sorry.");
        break;
        case 2:
        System.out.println("You got a D");
        break;
        case 3:
        System.out.println("You got a C");
        break;
        case 4:
        System.out.println("No, you got a B");
        break;
        case 5:
        System.out.println("No, you got an A!");
        break;
    }
    
    
    
    /**         
     * How Low? prints "how" once, "low" 5 times using a for loop,
     * "can you" once, and "go" 5 times using a while loop.
     */
    System.out.println("\nHow Low?:");
    System.out.print("how ");
    //uses a for loop to print "low" 5 times
    for (int i = 0; i < 5; i++) {
    System.out.print("low ");
    }
    System.out.print("\ncan you ");
    int j = 0;
    //uses a while loop to print "go" 5 times
    while (j < 5) {
    System.out.print("go ");
    j++;
    }

     /**         
     * Guessing game prompts the user to enter a number between 0 and 100 and
     * generates a dealer number in that same range, whichever number is closest
     * to 21 is declared the winner.
     */
    System.out.println("\n\nGuessing game:");
    //generates a random integer between 0 and 100
    double dnum = (Math.random()) * (100);
    dnum = Math.round(dnum);
    //prompts the user to enter a number between 0 and 100
    System.out.println("Please input a number between 0 and 100, (decimals will be rounded to nearest whole number):");
    double unum = scan.nextDouble();
    //fail-safe if decimal or out of range is entered 
    unum = Math.round(unum);
    while (unum < 0 || unum > 100){
    System.out.println("Input was out of range, please input a number between 0 and 100:");
    unum = scan.nextDouble();
    unum = Math.round(unum);
    }
    //checks which number is closest to 21 and declares winner
    double closest = Math.abs(21 - unum) < Math.abs(21 - dnum) ? unum : dnum;
    int winner = (int) closest;
    int dint = (int) dnum;
    if (winner == dnum) {
        System.out.println("Dealer has " + dint +", dealer Wins");
    }
    else {
        System.out.println("Player Wins, dealer had " + dint);
    }

    /**         
     * Guessing game loop prompts the user to enter a number between 0 and 100 and
     * generates a dealer number in that same range, whichever number is closest
     * to 21 is declared the winner. The game keeps playing until the user enters 21
     * upon which total scores and hands played are outputted.
     */
    System.out.println("\nGuessing game loop:");
    double dnum2 = 0;
    double unum2 = 0;
    int dwon = 0;
    int pwon = 0;
    int hands = 0;
    //while loop keeps game playing until user enters 21
    while (unum2 != 21) {
    System.out.println("Please input a number between 0 and 100, enter 21 to exit, (decimals will be rounded to nearest whole number):");
    unum2 = scan.nextDouble();
    dnum2 = (Math.random()) * (100);
    dnum2 = Math.round(dnum2);
    //fail-safe if decimal or out of range is entered  
    unum2 = Math.round(unum2);
    while (unum2 < 0 || unum2 > 100){
    System.out.println("Input was out of range, please input a number between 0 and 100:");
    unum2 = scan.nextDouble();
    unum2 = Math.round(unum2);
    }
    //checks which number is closest to 21 and declares winner, adds to win count and hand count
    double closest2 = Math.abs(21 - unum2) < Math.abs(21 - dnum2) ? unum2 : dnum2;
    int winner2 = (int) closest2;
    int dint2 = (int) dnum2;
    if (winner2 == dnum2) {
        System.out.println("Dealer has " + dint2 +", dealer Wins\n");
        dwon++;
    }
    else {
        System.out.println("Player Wins, dealer had " + dint2 + "\n");
        pwon++;
    }
    hands++;
    }
    //outputs stats for games played
    System.out.println("Number of hands played: " + hands);
    System.out.println("Dealer won: " + dwon +" Player won: " + pwon);
    System.out.println("You’re " + pwon + " for " + hands + " Come back to the CS House of Games soon.");
}
}


        

