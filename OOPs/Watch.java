package OOPs;

import java.util.Date;

public class Watch {
    private int size;
    private String color;
    private Date date;

    public Watch(int size, String color) {
        this.size = size;
        this.color = color;
        this.date = new Date();
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public Date getDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return "Watch [color=" + color + ", date=" + date + ", size=" + size + "]";
    }

    //Optional because we are not going to CHANGE the data. It's established.
    // public void setDate(Date date) {
    //     this.date = date;
    // }
    
}