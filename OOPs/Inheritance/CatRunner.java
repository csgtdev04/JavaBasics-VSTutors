package OOPs.Inheritance;

import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        Cat myCat = new Cat(4, "2'1", "White");
        System.out.println(myCat);

        Tiger myTiger= new Tiger(70.5, 4, 12, "5'2", "Orange Stripes & Black");
        System.out.println(myTiger);
        System.out.println(myTiger.getAge());
        System.out.println(myTiger.getHeight());
        System.out.println(myTiger.getColor());

        //Polymorphism
        ArrayList<Cat> catList = new ArrayList<Cat>();

        Cat myTiger1 = new Tiger(56, 12, 12, "45", "Black");
        catList.add(myTiger1);
        
        Cat myCheetha1 = new Cheetha(56, 12, 12, "45", "Orange", 30);
        catList.add(myCheetha1);
        
        Cat myTiger2 = new Tiger(46, 12, 12, "45", "Black");
        catList.add(myTiger2);        

        Cat myCheetha2 = new Cheetha(56, 13, 12, "45", "Black", 29);
        catList.add(myCheetha2);
        
        Cat myTiger3 = new Tiger(26, 15, 16, "45", "Yellow");
        catList.add(myTiger3);

        Cat myCheetha3 = new Cheetha(56, 16, 19, "42", "Black", 25);
        catList.add(myCheetha3);

        System.out.println("Cat List: " + catList);

        
        //Overview of For loop and go over iterating thru the catList
        

    }

}