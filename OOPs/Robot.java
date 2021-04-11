package OOPs;

public class Robot {
    
    //Attibutes
    String attitude;
    int age;


    //Constructor
    public Robot() {
        attitude = "kind";
        age = 3;
    }

    //Main method (where the code actually appears on the terminal screen - output)
    public static void main(String[] args) {
        boolean someone_has_a_birthday = false;
        
        if(someone_has_a_birthday) {
            pingEveryone();
        }
        
    }


    //Helper Friends (METHODS)
    //pingEveryone
    public static void pingEveryone() {
        System.out.println("@everyone in the server");
    }

}