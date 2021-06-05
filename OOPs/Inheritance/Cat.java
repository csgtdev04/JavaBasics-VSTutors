package OOPs.Inheritance;

public class Cat {
    private int age;
    private String height;
    private String color;

    public Cat(int u_age, String u_height, String u_color) {
        this.age = u_age;
        this.height = u_height;
        this.color = u_color;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat [age=" + age + ", color=" + color + ", height=" + height + "]";
    }

    


}