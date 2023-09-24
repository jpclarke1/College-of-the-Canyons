/* 
      * Project #1 Exercise 3
      * Source Code File: Project1Card.java 
      * Programmer: Joshua Clarke 
      * Due: 3/8/22 
      * Description: This is a Java implementation of an ADT  
      * which defines a CreditCard object.  
      */ 
      import java.util.Scanner;
      public class Project1Card {
      public static void main(String[] args) {
        int exit = 0;
        String name;
        long accountNum;
        String dueDate;

        //prompts user to enter name, account number, and payment due date 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Name");
        name = scan.nextLine();
        System.out.println("Please enter your 16 digit Account Number");
        accountNum = scan.nextLong();
        System.out.println("Please enter the due date on your account");
        dueDate = scan.next();
        CreditCard CC = new CreditCard (name, accountNum, dueDate);

        //menu for user to create and operate their credit card account
        while (exit == 0) {
            System.out.println("\nWelcome to your Credit Card Account:");
            System.out.println("Enter the number of the menu item you would like to execute");
            System.out.println("Charge [1]");
            System.out.println("Cash Advance [2]");
            System.out.println("Make a Payment [3]");
            System.out.println("Add Interest [4]");
            System.out.println("Check Stats [5]");
            System.out.println("exit [0]");
            int menu = scan.nextInt();

        //switch-case for menu options  
        switch (menu) {
            case 0: 
            CC.stats();
            System.out.println("Thank You for banking with us!");
            exit = 1;
            break;
            case 1: 
            System.out.println("How much would you like to charge?:");
            double charge = scan.nextDouble();
            CC.charge(charge);
            break;
            case 2: 
            System.out.println("How much of a cash advance would you like?:");
            double advance = scan.nextDouble();
            CC.cashAdv(advance);
            break;
            case 3: 
            System.out.println("How much would you like to pay?:");
            double pay = scan.nextDouble();
            CC.payment(pay);
            break;
            case 4: 
            System.out.println("How much interest would you like to add?:");
            double interest = scan.nextDouble();
            CC.interest(interest);
            break;
            case 5: 
            CC.stats();
            break;
        }
        }
      }
    }