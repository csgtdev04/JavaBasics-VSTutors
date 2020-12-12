package Test1;

/*
Problem (Difficulty Level: Medium): 15 POINTS
You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
Sample Input:
blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
*/

public class Question3 {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        int c = 0;
        //    T      OR      F    OR     F ========= T
        if((a+b==10) || (b+c==10) || (a+c==10)) {
            System.out.println("10");
        } else if ((a+b+10==b+c) || (a+b+10==a+c)) {
            System.out.println("5");
        } else {
            System.out.println("0");
        }
        
    }
}