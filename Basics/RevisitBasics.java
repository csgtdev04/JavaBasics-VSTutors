package Basics;
import java.util.ArrayList;


public class RevisitBasics {
    public static void main(String[] args) {
        
        
        
        
        
        
        //Arrays
        int[] number_list = new int[5];
        number_list[0] = 2;
        number_list[1] = -2;
        number_list[2] = 4;
        number_list[3] = 6;
        number_list[4] = 43;

        System.out.println(number_list);
        // WE CANNOT DIRECTLY PRINT OUT AN ARRAY!!!!!!

        for(int index = 0; index <= 4; index++) {
            System.out.println(number_list[index]);
        }        

        String[] friends_names = new String[3];
        friends_names[0] = "Lattika";
        friends_names[1] = "Dhakshesh";
        friends_names[2] = "Vedant";
        
        //hard-code

        for(int index = 0; index < friends_names.length; index++) {
            System.out.println(friends_names[index]);
        }

        //1. Arrays are Static, arraylists are dynamic
        //2. Arrays contain primitive types, arraylists contain referance types (objects)
        //3. When printing Arrays, you get memory address, when printing arraylists, you get the actual list
        //3. Common: in both arrays and arraylists, you can only have one type



        ArrayList<String> myFirstList = new ArrayList<String>();

        myFirstList.add("Java");
        myFirstList.add("Python");

        System.out.println(myFirstList);

    }
    
    public static void doSomething() {        
        String[] args = new String[2];
        args[0] = "hi";
        args[1] = "bye";   
    }

}