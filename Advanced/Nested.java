package Advanced;

import java.util.ArrayList;
import java.util.Scanner;

public class Nested {

    public static void createUser() {
        System.out.println("Creating a new user!");
    }
    public static void helpOn() {
        System.out.println("What do you need help on?");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Long> userAccounts = new ArrayList<Long>();
        userAccounts.add(235674797L); //l
        userAccounts.add(362985280L); //l
        userAccounts.add(637952063L); //l
        userAccounts.add(237593254L); //l


        System.out.println("May I know your account number?");
        long customer_account_number = input.nextLong();
        input.nextLine();

        boolean is_user = false;

        for(Long l : userAccounts) {
            if(l == customer_account_number) {
                // System.out.println("You are a customer");
                is_user = true;
                //Other code
            }
        }
        if(is_user == true) {
            System.out.println("You are a customer");
            helpOn();
        } else {
            System.out.println("You are not a customer");
            createUser();
        }
        input.close();
        
        int counter = 0;
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 2; j++) {
                counter++;
            }
        }
        System.out.println("Counter: " + counter);
        //i = 0
        //j: 0,1,2 (3)
        //i = 1
        //j: 0,1,2 (3)
        //i = 2
        //j: 0,1,2 (3)
        //i = 3
        //j: 0,1,2 (3)

        //nested for loop when dealing with tables
        for(int i = 0; i <= 3; i++) {
            System.out.print(i + " ");
            for(int j = 0; j <= 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        //While loop vs. For loop
        for(int a = 0; a < 10; a++) {
            System.out.print(a);
        }

        System.out.println();

        int b = 0;
        while(b < 10) {
            System.out.print(b);
            b++;
        }
        System.out.println();
    }
}