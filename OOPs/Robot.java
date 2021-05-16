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
        //Instantiate a robot obj
        Robot sai = new Robot();        
        
        boolean someone_has_a_birthday = false;    
        boolean holiday = true;
        
        if(someone_has_a_birthday) {
            sai.pingEveryone();              
        }

        if(holiday) {
            sai.pingEveryone();
        }

        String returnAns = sai.returnMethodExample();        
        System.out.println(returnAns);
    }

    //Helper Friends (METHODS)
    //pingEveryone
    private void pingEveryone() {
        System.out.println("@everyone in the server");        
    }

    private String returnMethodExample() {
        System.out.println("Sai");        
        return "Sai";
    }
    //String, int, boolean, int[], ArrayList<>
}