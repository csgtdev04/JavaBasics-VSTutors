package OOPs;

public class Headphones {
    //Attributes
    String color;
    String brand;

    //Constructor
    public Headphones() {
        color = "white";
        brand = "Sony";
    }

    //1. public/private/protected
    //2. static or no need of it
    //3. void method or return type method
    //4. name of the method
    //5. ()
    //6. { }

    private String listen() {
        return "I am listening to music";
    }

    public static void main(String[] args) {
        Headphones sony_earbuds = new Headphones();
        String listen = sony_earbuds.listen();
        System.out.println(listen);
    }
    
}