/* 
      * Project #1 Exercise 3
      * Source Code File: CreditCard.java 
      * Programmer: Joshua Clarke 
      * Due: 3/8/22 
      * Description: This is the CreditCard class that goes with Project1Card.java
      */ 
      public class CreditCard {
        private double balance;
        private double points;
        private long accountNum;
        private String name;
        private String dueDate;
        
        public CreditCard(String name, long accountNum, String dueDate){
        this.name = name;
        this.accountNum = accountNum;
        this.dueDate = dueDate;
        this.balance = 0;
        this.points = 0;
        }
        
        //account stats method
        public void stats()
        {
        System.out.println("\nYour Credit Card Stats are: ");
        System.out.println("Name: "+ name );
        System.out.println("Account Number: "+ accountNum);
        System.out.println("Account Balance: $"+ balance);
        System.out.println("Reward Points Balance: "+ points + " pts");
        System.out.println("Due Date "+ dueDate);
        }

        //charge method
        public void charge(double charge)
        {
        System.out.println("Your card has been charged: $"+ charge);
        balance += charge;
        points += (charge*0.03);
        }
        
        //cash advance method
        public void cashAdv(double adv)
        {
        System.out.println("A Cash Advance has been issued to your card of $"+ adv);
        balance += adv;
        }
        
        //payment method
        public void payment(double pay)
        {
        System.out.println("A payment has been made to your card of $"+ pay);
        balance -= pay;
        }
        
        //interest method
        public void interest(double interest)
        {
        System.out.println("An interest amount of $"+ interest + " has been added to your credit card balance");
        balance += interest;
        }
    }