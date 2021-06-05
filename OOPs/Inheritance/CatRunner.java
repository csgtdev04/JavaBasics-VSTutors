package OOPs.Inheritance;

public class CatRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat(4, "2'1", "White");
        System.out.println(myCat);

        Tiger myTiger= new Tiger(70.5, 4, 12, "5'2", "Orange Stripes & Black");
        System.out.println(myTiger);
        System.out.println(myTiger.getAge());
        System.out.println(myTiger.getHeight());
        System.out.println(myTiger.getColor());

    }

}