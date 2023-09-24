import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Midterm {

    public static class Bank {
        int bank = 200;
    }
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

public static class MenuGui implements ActionListener {
//Creating the Frame
JFrame frame = new JFrame("Welcome to Horse Betting!");
JButton Exacta = new JButton("Place an Exacta bet");  
JButton ExactaBox = new JButton("Place an Exactabox bet");    
JButton Trifecta = new JButton("Place a Trifecta bet");    
JButton TrifectaBox = new JButton("Please a Trifectabox bet");    
JButton Balance = new JButton("Check Balance");    
JButton Exit = new JButton("Exit");

MenuGui() {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(900, 500);

//buttons  
Exacta.addActionListener(this);
ExactaBox.addActionListener(this);
Trifecta.addActionListener(this);
TrifectaBox.addActionListener(this);
Balance.addActionListener(this);
Exit.addActionListener(this);

frame.add(Exacta);
frame.add(ExactaBox);
frame.add(Trifecta);  
frame.add(TrifectaBox);
frame.add(Balance);
frame.add(Exit);     

//frame
frame.setVisible(true); 
frame.setLayout(new GridLayout(2,3,50,50)); 

}

public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();
    if (src == Exacta) {
            String[] horseString = { "Seabiscuit", "Secretariat", "Kelso", "Citation", "Red Rum" };
            JFrame btn1frame = new JFrame("Exacta Bet");
            JLabel firstplace = new JLabel("Horse to come in first place:");
            JLabel secondplace = new JLabel("Horse to come in second place:");
            JComboBox horseList1 = new JComboBox(horseString);
            JComboBox horseList2 = new JComboBox(horseString);
        
            btn1frame.add(firstplace);
            btn1frame.add(horseList1);
            btn1frame.add(secondplace);
            btn1frame.add(horseList2);
            btn1frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            btn1frame.setSize(900, 500);
            btn1frame.setVisible(true);
            btn1frame.setLayout(new GridLayout(3,2));
            }

    if (src == ExactaBox) {}
    
    if (src == Trifecta) {}
   
    if (src == TrifectaBox) {}
    
    if (src == Balance) {}
    
    if (src == Exit) {}
    
  }
}




    public static void main(String args[]) {
        MenuGui n = new MenuGui();
        Race r = new Race();
        r.readysetgo();

        System.out.println("\nFirst place is " + r.first());
        System.out.println("Second place is " + r.second());
        System.out.println("Third place is " + r.third());
        System.out.println("Fourth place is " + r.fourth());



    }
}


