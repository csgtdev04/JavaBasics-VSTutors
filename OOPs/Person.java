package OOPs;


public class Person {
    // Attributes
    String name;
    int age;    
    // String[] candy_list;

    // Constructor
    public Person(String user_name, int user_age) {
        this.name = user_name;
        this.age = user_age;
        // this.candy_list = new String[2];
    }

    // Methods/Functions
    public void eat() { 
        System.out.println(this.name + " is eating!");
        //Random stuff
    }

    // public void createCandyList() {
    //     this.candy_list[0] = "Snickers";
    //     this.candy_list[1] = "M&Ms";
    // }

    //Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //Setters (void)
    public void setName(String updated_name) {
        this.name = updated_name;
    }
    public void setAge(int updated_age) {
        this.age = updated_age;
    }
}