import java.util.*;
import java.io.*;
public class bitcoin {
    /**
     * 
     * @author Joshua Clarke
     * bitcoin allows the user to trade fake bitcoin, fake USD, and fake ethereum. The user starts with $75000,
     * and is able buy/sell bitcoin and ethereum, check their BTC/ETH/USD balances, check the BTC/ETH price, and check
     * the buy/sell history. Upon exit, trading history is written to a .txt file and printed as 
     * a string.
     * 
     */

    // wallet stores all of the bitcoin, ethereum, and usd
    public static class Wallet {
    String btcticker = " BTC";
    String ethticker = " ETH";
    double btcbalance = 0;
    double ethbalance = 0;
    double usdbalance;
    double current;

    //buyBCoin adds bitcoin while subtracting the coin's value (obtained externally) in usd
    void buyBCoin(double x){
    this.btcbalance = btcbalance + x;
    this.usdbalance -= Math.round((x * current) * 100.0) / 100.0;
    }

    //buyECoin adds ethereum while subtracting the coin's value (obtained externally) in usd
    void buyECoin(double x){
        this.ethbalance = ethbalance + x;
        this.usdbalance -= Math.round((x * current) * 100.0) / 100.0;
        }

    //sellBCoin subtracts bitcoin while adding the coin's value (obtained externally) in usd
    void sellBCoin(double x){
        this.btcbalance = btcbalance - x;
        this.usdbalance += Math.round((x * current) * 100.0) / 100.0;
        }

    //sellECoin subtracts ethereum while adding the coin's value (obtained externally) in usd
    void sellECoin(double x){
        this.ethbalance = ethbalance - x;
        this.usdbalance += Math.round((x * current) * 100.0) / 100.0;
        }

    //getWallet shows the user how much bitcoin, ethereum, and USD that they have 
    String getWallet(){
    double usd2 = Math.round((usdbalance) * 100.0) / 100.0;
    GetLive liv = new GetLive();
    return "\nYou have:\n" + btcbalance + btcticker +" = $"+ (btcbalance * liv.blive()) + "\n" + ethbalance + ethticker + " = $"+ (ethbalance * liv.elive()) + "\n$" + usd2 + "\nTotal: $" + Math.round(((btcbalance * liv.blive()) + (ethbalance * liv.elive()) + usd2) * 100.0) / 100.0 + "\n";
    }
    }

    //Ledger creates an array to store transaction history
    public static class Ledger {
    ArrayList<String> transactions = new ArrayList<String>();

    //getLedger returns a clean list of transactions 
    String getLedger(){
    return transactions.toString().replace(",", "").replace("[", "").replace("]", "");
    }
    }

    //MyDate allows for new date instances to be created whenever price is needed
    static class MyDate {
    Date date = new Date();

    //date method returns the date as a string 
     String date(){
    return date.toString();
    }
    }

    //GetLive makes a fake live price of bitcoin between $46000 and $65000 and ethereum between $3600 and $4800
    static class GetLive {
    public double BlivePrice = Math.round(((Math.random()) * (19000) + 46000) * 100.0) / 100.0; 
    public double ElivePrice = Math.round(((Math.random()) * (1200) + 3600) * 100.0) / 100.0;

    //blive returns the fake live BTC price as a double 
    double blive(){
    return this.BlivePrice;
    }

    //elive returns the fake live ETH price as a double 
    double elive(){
    return this.ElivePrice;
    }

    //returnBLive returns the BTC live price as a string in a user friendly form
    String returnBLive(){
        return "\n1 BTC = $" + BlivePrice + "";
        }

    //returnELive returns the ETH live price as a string in a user friendly form
    String returnELive(){
        return "1 ETH = $" + ElivePrice + "\n";
        }
    }

    public static void main(String args[])
    { 
    //creating new wallet with $75000 balance, setting up new empty ledger, and variables
    Wallet user = new Wallet();
    user.usdbalance = 75000;
    Ledger history = new Ledger();
    int exit = 0;
    double num;
    Scanner scan = new Scanner(System.in);

    // main menu
    while (exit == 0) {
    System.out.println("Hello welcome to Bitcoin\nYour command syntax is:");
    System.out.println("buy");
    System.out.println("sell");
    System.out.println("price");
    System.out.println("balances");
    System.out.println("history");
    System.out.println("exit");
    String str = scan.next();

    //switch-case to give function to menu
    switch (str) {
        //submenu asks the user what coin they would like to buy
        case "buy":
        GetLive liv = new GetLive();
        System.out.println("\nWhat Coin would you like to buy?");
        System.out.println("BTC");
        System.out.println("ETH");
        String type = scan.next();
        switch (type) {
        //prompts the user to enter how much btc they would like to buy, checks if that buy is possible 
        //based on balance, price is generated locally so it can be checked and printed, transaction is added
        //to the ledger
        case "BTC":
        user.current = liv.blive();
        System.out.println("\nEnter how much Bitcoin you would like to buy:");
        num = scan.nextDouble();
        if (user.usdbalance >= (num * user.current)) {
        user.buyBCoin(num);
        double amt = Math.round((num * user.current) * 100.0) / 100.0; 
        System.out.println("\nYou bought " + num + " BTC\nFor: $" + amt + "\n");
        MyDate time = new MyDate();
        history.transactions.add("\n" + time.date() + "\nBought: " + num + " BTC\nFor: $" + amt + "\n");
    } 
        else {
            System.out.println("\nYou don't have enough money!\n");
        }
        break;
        //prompts the user to enter how much eth they would like to buy, checks if that buy is possible 
        //based on balance, price is generated locally so it can be checked and printed, transaction is added
        //to the ledger
        case "ETH":
        user.current = liv.elive();
        System.out.println("\nEnter how much Ethereum you would like to buy:");
        num = scan.nextDouble();
        if (user.usdbalance >= (num * user.current)) {
        user.buyECoin(num);
        double amt = Math.round((num * user.current) * 100.0) / 100.0; 
        System.out.println("\nYou bought " + num + " ETH\nFor: $" + amt + "\n");
        MyDate time = new MyDate();
        history.transactions.add("\n" + time.date() + "\nBought: " + num + " ETH\nFor: $" + amt + "\n");
    } 
        else {
            System.out.println("\nYou don't have enough money!\n");
        }
        break;
    }
        break;
        //submenu asks the user what coin they would like to sell
        case "sell":
        GetLive vil = new GetLive();
        System.out.println("\nWhat Coin would you like to sell?");
        System.out.println("BTC");
        System.out.println("ETH");
        type = scan.next();
        switch (type) {
        //prompts the user to enter how much btc they would like to sell, checks if that sell is possible 
        //based on balance, price is generated locally so it can be checked and printed, transaction is added
        //to the ledger
        case "BTC":
        user.current = vil.blive();
        System.out.println("\nEnter how much Bitcoin you would like to sell:");
        num = scan.nextDouble();
        if (user.btcbalance >= num) {
            user.sellBCoin(num);
            double amt = Math.round((num * user.current) * 100.0) / 100.0; 
            System.out.println("\nYou sold: " + num + " BTC\nFor: $" + amt + "\n");
            MyDate time = new MyDate();
            history.transactions.add("\n" + time.date() + "\nSold: " + num + " BTC\nFor: $" + amt + "\n");
        } 
            else {
                System.out.println("\nYou don't have enough money!\n");
            }
        break;
        //prompts the user to enter how much eth they would like to sell, checks if that sell is possible 
        //based on balance, price is generated locally so it can be checked and printed, transaction is added
        //to the ledger
        case "ETH":
        user.current = vil.elive();
        System.out.println("\nEnter how much Ethereum you would like to sell:");
        num = scan.nextDouble();
        if (user.ethbalance >= num) {
            user.sellECoin(num);
            double amt = Math.round((num * user.current) * 100.0) / 100.0; 
            System.out.println("\nYou sold: " + num + " ETH\nFor: $" + amt + "\n");
            MyDate time = new MyDate();
            history.transactions.add("\n" + time.date() + "\nSold: " + num + " ETH\nFor: $" + amt + "\n");
        } 
            else {
                System.out.println("\nYou don't have enough money!\n");
            }
        break;
        }
        break;
        case "price":
        GetLive ilv = new GetLive();
        System.out.println(ilv.returnBLive());
        System.out.println(ilv.returnELive());
        break;
        case "balances":
        System.out.println(user.getWallet());
        break;
        case "history":
        System.out.println(history.getLedger());
        break;
        //upon exit ledger is saved to a .txt file and printed as a string
        case "exit":
        String fileString = "";
        //here is my write (this creates\writes over new\existing ledgerFile)
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\schwa\\Desktop\\Project #0\\ledgerFile.txt");
            myWriter.write("Java COIN Ledger\n" + history.getLedger());
            myWriter.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        //here is my read (it reads what is on the ledger and outputs it as a string before program ends)
        try
        {
            scan = new Scanner(new File("C:\\Users\\schwa\\Desktop\\Project #0\\ledgerFile.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File doesn't exist");
            return;
        }

        while(scan.hasNextLine()) {
        fileString = fileString + scan.nextLine() + "\n";     
        }

        System.out.println(fileString);
        exit = 1;
        break;
    }
    }
    }
}