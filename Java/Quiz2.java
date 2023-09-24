import java.util.*;
public class Quiz2 {
/**
     * 
     * @author Joshua Clarke
     * Quiz2 is a pizza ordering program. It allows the user to create different orders of pizza by
     * first asking for their name, then what toppings they would like. All orders are then printed so
     * that someone can make the pizzas!
     */

//Pizza class allows for new pizza orders to be created 
public static class Pizza {
String name;
boolean pepperoni;  
boolean bacon;
boolean olives; 
boolean peppers;
boolean onions; 
boolean pineapple;
boolean evr = false;

//constructors
Pizza (boolean pi, boolean ba, boolean ov, boolean pep, boolean on, boolean pin){
pepperoni = pi;
bacon = ba;
olives = ov;
peppers = pep;
onions = on;
pineapple = pin;
}

Pizza (String na) {
name = na;
pepperoni = false;
bacon = false;
olives = false;
peppers = false;
onions = false;
pineapple = false;
}

//EverythingOnIt allows the user to quickly add every topping (except pineapple) to a pizza
public void EverythingOnIt() {
if (evr = true) {
    pepperoni = true;
    bacon = true;
    olives = true;
    peppers = true;
    onions = true;
    pineapple = false;
}
}

//getToppings gets all of the user selected toppings and puts them in an array to be printed
String getToppings() {
String topping = "no toppings";
ArrayList<String> toppingsList = new ArrayList<String>();
if (pepperoni == true) {
topping = "pepperoni";
toppingsList.add(topping);
}
if (bacon == true) {
    topping = "bacon";
    toppingsList.add(topping);
    }
    if (olives == true) {
        topping = "olives";
        toppingsList.add(topping);
        }
        if (peppers == true) {
            topping = "peppers";
            toppingsList.add(topping);
            }
            if (onions == true) {
                topping = "onions";
                toppingsList.add(topping);
                }
                if (pineapple == true) {
                    topping = "pineapple";
                    toppingsList.add(topping);
                    }
//just in case toppings are left blank, user has option to have no toppings
                    if (topping == "no toppings") {
                    toppingsList.add(topping);   
                    }
    //makes everything look pretty 
    return "Order Name: " + name + "\nToppings:\n" + toppingsList.toString().replace(",", "\n").replace("[", "").replace("]", "") + "\n" ;
}

//crashes the program when user attempts to commit crimes against humanity
public void CrimesAgainstHumanity() {
    if (pineapple == true) {
        Object[] o = null;
        while (true) {
        o = new Object[] {o};
        }
}
}

public static void main(String args[]) { 
    ArrayList<String> orders = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    int exit = 1;
    int topping = 10;
//ordering menu prompts user to enter a name for the order
while (exit != 0) {
    String str;
    topping = 9;
    System.out.println("\nWelcome to Papa Josh's!");
    System.out.println("Please Enter a name for your order:");
    Pizza one = new Pizza("name");
    one.name = scan.next();
// internal ordering menu asks the user what toppings they would like, if they would like to make a new order, or exit
    while (topping != 8) {
        Boolean broken = true;
                System.out.println("Type the number of what topping you would like?");
                System.out.println("Pepperoni   1");
                System.out.println("Bacon       2");
                System.out.println("Olives      3");
                System.out.println("Peppers     4");
                System.out.println("Onions      5");
                System.out.println("Pineapple   6");
                System.out.println("Everything  7");
                System.out.println("New Order   8");
                System.out.println("Exit        0");
                //makes sure code doesn't break when there is an error
                while (broken == true) {
                    try {
                        str = scan.next();
                        topping = Integer.parseInt(str);
                        broken = false;
                        }
                        catch(Exception e) {
                          System.out.println("Please enter a number on the menu");
                          broken = true;
                        }
                    }
//if statements for menu because I forgot that switch-case existed
                if (topping == 1) {
                    one.pepperoni = true;
                }
                if (topping == 2) {
                    one.bacon = true;
                }
                if (topping == 3) {
                    one.olives = true;
                }
                if (topping == 4) {
                    one.peppers = true;
                }
                if (topping == 5) {
                    one.onions = true;
                }
                if (topping == 6) {
                    one.pineapple = true;
                    one.CrimesAgainstHumanity();
                }
                if (topping == 7) {
                    one.evr = true;
                    broken = true;
                    one.EverythingOnIt();
                System.out.println("New Order   8");
                System.out.println("Exit        0");
                //makes sure code doesn't break when there is an error
                while (broken == true) {
                try {
                    str = scan.next();
                    topping = Integer.parseInt(str);
                    broken = false;
                    }
                    catch(Exception e) {
                      System.out.println("Please enter a number on the menu");
                      broken = true;
                    }
                }
                }
                if (topping == 0) {
                    exit = 0;
                    topping = 8;
                }
            }
            orders.add(one.getToppings());
}

//prints all of the orders
for(int i = 0; i < orders.size(); i++) {   
    System.out.println(orders.get(i));
}
}
}
}
