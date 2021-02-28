package OOPs.Inheritance;

public class Runner {
    public static void main(String[] args) {
        Child sai = new Child("black", 5,false,true);
        sai.getHeight();
        Dad dad = new Dad("black", 5, true);
        dad.getEye_color();
    }
}