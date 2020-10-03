import java.util.Scanner;

public class BankProject {
    public static void main(String[] args) {
        //Bank Account Problem

        /* Problem: You are the bank and there are two options: people can either give money or take money from their account
        If you are a new person, then you have to make an account (you need to ask the person)
        "DL Bank"
        What is your name
        You need to check if they are a new customer: if they are not, then you have to make them a new customer and then proceed.
        Show all the customers
        Ask them what you are at the bank for: withdrawing (taking money) if your account balance > 0 (if balance
        less than 0, say bye you can't get money), give money 
        Print out the money in their account
        Ask the customer if he needs help on anything else */
            //if yes, ask them what else
            //if no, bye!
        
        String name;
        String isNewCustomer;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to DL Bank");
        System.out.print("What is your name? ");
        name = myObj.nextLine();
        System.out.println();
        System.out.print("Are you a new customer? (Enter true or false) ");
        isNewCustomer = myObj.nextLine();
        System.out.println();
        if(isNewCustomer.equalsIgnoreCase("true")) {
            System.out.println("Thanks for joining DL Bank.");
        } else {
            System.out.println("Thanks you for returning valued customer!");
        }
        System.out.print("What can we help you with? (W for withdraw or D for deposit)");
        String help_on = myObj.nextLine();
        System.out.println();
        double balance = 10.00;
        if(help_on.equalsIgnoreCase("W")) {
            System.out.print("How muuch money do you want?");
            double amount_wanted = myObj.nextDouble();
            System.out.println();
            if(amount_wanted > balance) {
                System.out.println("Don't have enough money!");
                System.out.println("Bye!");
            } else {
                balance -= amount_wanted;
                System.out.println("Current Balance: " + balance);
                System.out.println("Bye!");
            }

        } else if (help_on.equalsIgnoreCase("D")) {
            System.out.println("How much do you want to add to your balance?");
            double want_to_add = myObj.nextDouble();
            balance += want_to_add;
            System.out.println("Current Balance: " + balance);
            System.out.println("Bye!");

        } else {
            System.out.println("You entered the wrong code.");
            System.out.println("Bye!");
        }    
    }
}