package OOPs;

public class Static {

    public void getStatic() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        Static s = new Static(); //instantiating an object
        s.getStatic();
    }

}