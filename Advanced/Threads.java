package Advanced;

public class Threads {
    public static void main(String[] args) {
        // int min = 1;
        // int sec = 10;
        // int totalTime = (1*60000) + (10*1000);
        // for (int i = totalTime; i > 0; i--) {
        //     System.out.println(i);
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }
        // System.out.println("Time's Up");
    
        int min = 1;
        int sec = 10;
        int totalTime = (1*60000) + (10*1000);
        for (int i = totalTime; i > 0; i--) {
            System.out.println(min + " " + sec);
            if(sec == 0) {
                min--;
                sec+=59;
            }
            if(min == 0) {
                break;
            }
            sec--;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Time's Up");

    }
}