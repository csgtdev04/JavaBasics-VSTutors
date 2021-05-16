package OOPs;

public class Phone {
    //Att
    private String shape;
    private String color;
    private int memory;

    //Constr
    public Phone() {
        this.shape = "square";
        this.color = "grey";
        this.memory = 16;
    }

    //Getter
    public String getShape() {
        return this.shape;
    }

    public String getColor() {
        return this.color;
    }

    public int getMemory() {
        return this.memory;
    }

    //Setter
    public void setShape(String new_shape) {
        this.shape = new_shape;
    }

    public void setColor(String new_color) {
        this.color = new_color;
    }

    public void setMemory(int new_memory) {
        this.memory = new_memory;
    }

    //Add'l methods (functions)
    public void openApp(String name_of_app) {
        System.out.println("Opened the " + name_of_app);
    }
    
    public void takePicture(String mode) {
        openApp("Camera App");
        System.out.println("Took a picture in the " + mode + " mode.");
    }

    //toString method



    //Main method
    public static void main(String[] args) {
        Phone sai_phone = new Phone();

        String shape = sai_phone.getShape();
        System.out.println("Shape: " + shape);

        String color = sai_phone.getColor();
        System.out.println("Color: " + color);
        
        int memory = sai_phone.getMemory();
        System.out.println("Memory: " + memory);


        sai_phone.setColor("white");

        String color_2 = sai_phone.getColor();
        System.out.println("New Color: " + color_2);

        sai_phone.openApp("Insta");
        System.out.println("Closed Insta...");
        sai_phone.openApp("Snap");

        sai_phone.takePicture("Portrait");
    }

}