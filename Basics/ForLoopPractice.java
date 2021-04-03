package Basics;

public class ForLoopPractice {
    public static void main(String[] args) {
        //Problem 1: Go through a for loop from 1 - 1000 (Difficulty: Easy)
        for(int i = 1; i < 1001; i++) {
            System.out.print(i + " ");
        }
        // Problem 2: Go through a for loop and print out even numbers (Difficulty: Easy)
        for(int i = 10; i < 30; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        //Problem 3: Go through a for loop and print out odd numbers (Difficulty: Easy)
        for(int i = 10; i < 30; i++) {
            if(i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
        // Problem 4: Go through a for loop and skip count every five and print out only even numbers (Difficulty: Medium)
        for(int i = 0; i < 50; i+=5) {
            if(i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        // Problem 5: Find the product of the digits of a number (Difficulty: Hard). For example: Input: 56 -> Answer: 30; (Explanation: 5 x 6 = 30)
        // 123  = digit 1  * digit 2 * digit 3
        int num = 123;
        int product = 0;
        for(int i = num; i > 0; i /= 10) {
            int last_digit = i % 10;
            product *= last_digit; //product = product * last_digit
        }
        System.out.println(product);
        // 123
        // Loop 1; 3
        // 12
        // Loop 2; 2
        // 1
        // Loop 3; 1


        // 1 * 3 = 3 * 2 = 6 * 1 = 6


        //123 Pro-sum diff (6 - 6)
        //56 (30 - 11 = 19)
        //14972469922126489
        
        //1. find product
        //2. find sum
        //3. product - sum

        // int a = 56;
        // int x = 56 / 10 = 5
        // int y = 56 % 10 = 6
        // int prod = x*y

        // int sum = x+y

        // prod - sum

        int num1 = 123;
        int product1 = 1;
        int sum = 0;
        for(int i = num1; i > 0; i/=10) {
            int last_digit = i % 10;
            product1 *= last_digit;
            sum += last_digit;
        }
        int product_sum_dif = product1-sum;
        System.out.println(product_sum_dif);

        if(product_sum_dif > 10) {
            System.out.println("The product must have been very large.");
        } else {
            System.out.println("The product must NOT have been very large.");
        }

        //comes into for loop 1st time
        // i = 56
        // 56 > 0 yes
        // product = 6

        // //2nd time
        // i = 5
        // 5 > 0 yes
        // product = 30

        // //3rd time
        // i = 0
        // 0 > 0 no

    }
}