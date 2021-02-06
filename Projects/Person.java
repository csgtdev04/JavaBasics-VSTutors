package Projects;

import java.util.Scanner;

public class Person {
    private int accountNumber;
    private String service;
    public static Scanner myObj = new Scanner(System.in);

    // Constructor
    public Person(int accountNo, String ser) {
        this.accountNumber = accountNo;
        this.service = ser;
    }

    // Getter
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getService() {
        return this.service;
    }

    // Basic service methods
    public void addDeposit() {
        System.out.println("How much do you have in balance?");
        double balance = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("How much do you want to add to your balance?");
        double want_to_add = myObj.nextDouble();
        myObj.nextLine();
        balance += want_to_add;
        System.out.println("Current Balance: " + balance);
        System.out.println("Bye!");
    }

    public void withdraw() {
        System.out.println("How much do you have in balance?");
        double balance = myObj.nextDouble();
        myObj.nextLine();
        System.out.print("How much money do you want?");
        double amount_wanted = myObj.nextDouble();
        myObj.nextLine();
        System.out.println();
        if (amount_wanted > balance) {
            System.out.println("Sorry, you don't have enough money.");
            System.out.println("Bye, have a nice day!");

        } else {
            balance -= amount_wanted;
            System.out.println("Current Balance: " + balance);
            System.out.println("Bye, have a nice day!");
        }
    }

    public void takeLoan() {
        System.out.print("How much loan do you want?");
        double amount_wanted = myObj.nextDouble();
        myObj.nextLine();
        System.out.println();
        System.out.print("After how many years will you return your loan (we use compound interest)?");
        double time_in_loan = myObj.nextDouble();
        myObj.nextLine();
        System.out.println();
        double final_rate = 1.05;

        // Compound Interest
        // 1) Formula : P(1 + r)^t
        // 2) Variables: P, r, t (P is the loan, bank gives r, 5 yrs base)
        double cmpd_interest = Math.round(amount_wanted * Math.pow(final_rate, time_in_loan));

        System.out.println("You owe the bank " + cmpd_interest + " in 5 years.");
        System.out.println("Make sure to pay the bank by " + time_in_loan + " or the money you owe the bank will increase!");
        System.out.println("Bye, have a nice day!");

        // //toString
        // String toString() {
        //     return "This account number: " + this.accountNumber + " got help with this service: " + this.service;
        // }
    }
    
}