package Projects;

import java.util.ArrayList;
import java.util.Scanner;


public class PersonExecuter {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Person> people = new ArrayList<Person>(); 
        //Person 0: name: sai, age: 17
        //Person 1: name: x, age: y
        //Person 2: name: x, age: y
        //until the last person in line
        int userCount = 3;
        do {
            //Code which asks for name and details - call withdrawl()
            System.out.print("What's your Account Number? ");
            int accountNo = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            System.out.println("Thanks for that. Let me get your details.");
            Thread.sleep(3*1000);

            System.out.print("What would you like to get help with? W | D | L - ");
            String help = scanner.nextLine();
            System.out.println();
            System.out.println("Thanks for that.");
            Thread.sleep(3*1000);

            //Creating a person
            Person person = new Person(accountNo, help);
            people.add(person);

            //Call the appropriate method
            if(help.equals("W"))
                person.withdraw();
            else if(help.equals("D"))
                person.addDeposit();
            else if(help.equals("L"))
                person.takeLoan();
            else 
                System.out.println("Wrong input!");

            userCount--;
        } while(userCount != 0);
        
        System.out.println();

        for(Person p : people) {
            System.out.println("This person's account number is: " + p.getAccountNumber());
            System.out.println("This person got help with: " + p.getService());
            System.out.println();
        }
        
    }
}