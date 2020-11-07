package Advanced;

public class Nested {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 2; j++) {
                counter++;
            }
        }
        System.out.println("Counter: " + counter);
        //i = 0
        //j: 0,1,2 (3)
        //i = 1
        //j: 0,1,2 (3)
        //i = 2
        //j: 0,1,2 (3)
        //i = 3
        //j: 0,1,2 (3)

        //nested for loop when dealing with tables
        for(int i = 0; i <= 3; i++) {
            System.out.print(i + " ");
            for(int j = 0; j <= 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        //While loop vs. For loop
        for(int a = 0; a < 10; a++) {
            System.out.print(a);
        }

        System.out.println();

        int b = 0;
        while(b < 10) {
            System.out.print(b);
            b++;
        }
        System.out.println();
    }
}