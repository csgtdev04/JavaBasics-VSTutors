package OOPs.Inheritance;

public class Cheetha extends Cat {
    private double speed;
    private int claw_size;
    private int spots;

    public Cheetha(double u_speed, int u_claw_size, int u_age, String u_height, String u_color, int spots) {
        super(u_age, u_height, u_color);
        this.speed = u_speed;
        this.claw_size = u_claw_size;
        this.spots = spots;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getClaw_size() {
        return claw_size;
    }

    public void setClaw_size(int claw_size) {
        this.claw_size = claw_size;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }

    @Override
    public String toString() {
        return "Cheetha [claw_size=" + claw_size + ", speed=" + speed + ", spots=" + spots + "]";
    }

    
}