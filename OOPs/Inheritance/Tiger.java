package OOPs.Inheritance;

public class Tiger extends Cat {
    private double speed;
    private int claw_size;

    public Tiger(double u_speed, int u_claw_size, int u_age, String u_height, String u_color) {
        super(u_age, u_height, u_color);
        this.speed = u_speed;
        this.claw_size = u_claw_size;
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

    @Override
    public String toString() {
        return "Tiger [claw_size=" + claw_size + ", speed=" + speed + "]";
    }

    
}