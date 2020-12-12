package OOPs;

public class PersonRunner {
    public static void main(String[] args) {
        //We are going to instantiate our Person
        //Scanner key = new Scanner(System.in);
        Person person1 = new Person("Sai", 17);
        Person person2 = new Person("Lattika", 12);
        Person person3 = new Person("Dhakshesh", 15);

        int age1 = person1.getAge();
        String name1 = person1.getName();
        
        int age2 = person2.getAge();
        String name2 = person2.getName();

        int age3 = person3.getAge();
        String name3 = person3.getName();
        
        System.out.println("Age1: " + age1);
        System.out.println("Name1: " + name1);
        person1.eat();

        System.out.println("Age2: " + age2);
        System.out.println("Name2: " + name2);
        person2.eat();

        System.out.println("Age3: " + age3);
        System.out.println("Name3: " + name3);
        person3.eat();
    }
}