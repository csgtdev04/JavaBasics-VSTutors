package OOPs.Inheritance;

public class Dad {
    //Child inherits these qualities from the Dad
    private String eye_color;
    private int height;

    //Dad has his own qualities
    private boolean has_beard;

    public Dad(String eye_color, int height, boolean has_beard) {
        this.eye_color = eye_color;
        this.height = height;
        this.has_beard = has_beard;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isHas_beard() {
        return has_beard;
    }

    public void setHas_beard(boolean has_beard) {
        this.has_beard = has_beard;
    }

    @Override
    public String toString() {
        return "Dad [eye_color=" + eye_color + ", has_beard=" + has_beard + ", height=" + height + "]";
    }

    

}