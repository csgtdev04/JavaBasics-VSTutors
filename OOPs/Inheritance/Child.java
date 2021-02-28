package OOPs.Inheritance;

public class Child extends Dad {
    //Attributes that only children have
    private boolean has_school;

    public Child(String eye_color, int height, boolean has_beard, boolean has_school) {
        super(eye_color, height, has_beard);
        this.has_school = has_school;
    }

    public boolean isHas_school() {
        return has_school;
    }

    public void setHas_school(boolean has_school) {
        this.has_school = has_school;
    }

    @Override
    public String toString() {
        return "Child [has_school=" + has_school + "]";
    }

    
}