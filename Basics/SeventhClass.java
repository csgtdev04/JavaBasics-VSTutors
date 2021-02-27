package Basics;

public class SeventhClass {    
    public static void main(String[] args) {
        //Review of last week:

        //If statement
        boolean is_old_enough_to_drive = false;
        String name = "jioshiuhihqehoqeae";

        if(name.endsWith("e")) {
            System.out.println("You can drive");
        }
        else {
            System.out.println("You can't drive");
        }
       
        int num = 109;
        if(num % 2 == 0) {
            System.out.println("this is an even");
        }         
        else {
            System.out.println("its an odd");
        }

        //if the number / 2 doesn't have a remainder, then its even
        //otherwise, then its odd
        //psuedo-code

        //Finding even/odd numbers in java
        int number_1 = 21;
        //Ask computer is it even or odd
        if(number_1 % 2 != 0) {
            System.out.println("Odd!");
        } else {
            System.out.println("Even!");
        }
        //Integrate with For Loop
        //1,2,3,4,5
        //Odd: 3
        //Even: 2

        int even_number_count = 0;
        int odd_number_count = 0;

        for(int i = 1; i <= 1043; i++) {
            if(i % 2 == 0) {
                //We know that is even number
                even_number_count++;
            } else {
                //We know that is odd number
                odd_number_count++;
            }
        }
        System.out.println("Even number count " + even_number_count);
        System.out.println("Odd number count " + odd_number_count);
    }
}