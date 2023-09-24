/* 
      * Project #5 Menu
      * Source Code File: Menu.java 
      * Programmer: Joshua Clarke
      * Due: 6/2/22 
      * Description: menu provides a user interface for the class PhoneBook
      */ 
import java.util.*;
public class Menu {
    public static void main(String[] args) {
          PhoneBook pBook = new PhoneBook();
          int exit = 0; 
          String name, newNum;
          Scanner scan = new Scanner(System.in);

          // main menu
          while (exit == 0) {
          System.out.println("Hello welcome to Your Phone-Book\nYour command syntax is:");
          System.out.println("add");
          System.out.println("delete");
          System.out.println("find");
          System.out.println("change");
          System.out.println("quit");
          String str = scan.next();
      
          //switch-case to give function to menu
          switch (str) {
              case "add":
              System.out.println("Enter the name of the contact you would like to add:");
              scan.nextLine();
              name = scan.nextLine();
              System.out.println("Enter the phone number of the contact:");
              newNum = scan.nextLine();
              pBook.Add(name, newNum);
              break;
              case "delete":
              System.out.println("Enter the name of the contact you would like to delete:");
              scan.nextLine();
              name = scan.nextLine();
              pBook.Delete(name);
              break;
              case "find":
              System.out.println("Enter the name of the contact you would like to find:");
              scan.nextLine();
              name = scan.nextLine();
              System.out.println(pBook.Find(name));
              break;
              case "change":
              System.out.println("Enter the name of the contact you would like to change:");
              scan.nextLine();
              name = scan.nextLine();
              System.out.println("Enter the new phone number of the contact:");
              newNum = scan.nextLine();
              pBook.Change(name, newNum);
              break;
              case "quit":
              pBook.Quit();
              exit = 1;
              break;
            }
          }
    }
}
