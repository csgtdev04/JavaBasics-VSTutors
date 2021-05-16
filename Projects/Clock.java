package Projects;

public class Clock {
    public static void main(String[] args) throws InterruptedException {
        int hour = 0;
        int min = 0;
        int sec = 0;

        for(int i = 0; i <= 130; i++) {
            System.out.println("H: " + hour + " M: " + min + " S: "  + sec);
            Thread.sleep(1000);
            if(i == 59 || sec == 59) {
                min += 1;
                sec = 0; 
                continue;
            }
            if(min == 60) {
                hour+=1;
                min = 0;
            }
            sec++;
        }
    }
}