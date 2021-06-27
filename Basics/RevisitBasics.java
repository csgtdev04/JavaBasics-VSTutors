package Basics;

public class RevisitBasics {
    public static void main(String[] args) {
        // doSomething();

        //Arrays
        int[] number_list = new int[5];
        number_list[0] = 2;
        number_list[1] = -2;
        number_list[2] = 4;
        number_list[3] = 6;
        number_list[4] = 43;

        // System.out.println(number_list);
        // WE CANNOT DIRECTLY PRINT OUT AN ARRAY!!!!!!

        for(int index = 0; index <= 4; index++) {
            System.out.println(number_list[index]);
        }



        //1. Arrays are Static, arraylists are dynamic
        //2. Arrays contain primitive types, arraylists contain referance types (objects)
        //3. Common: in both arrays and arraylists, you can only have one type

        String[] friends_names = new String[2];
        friends_names[0] = "Lattika";
        friends_names[1] = "Dhakshesh";
        // friends_names[2] = "Vedant";
        

        for(int index = 0; index < 2; index++) {
            System.out.println(friends_names[index]);
        }


    }
    
    public static void doSomething() {        
        String[] args = new String[2];
        args[0] = "hi";
        args[1] = "bye";   
    }

}