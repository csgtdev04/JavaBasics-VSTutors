package Test1;

/*
Problem (Easy): 20 POINTS
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
Sample Input:
make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
*/

public class Question2 {
    public static void main(String[] args) {
        int[] new_array = new int[2];
        int[] a = {4, 5};
        int[] b = {1, 2, 3};
    
        if (a.length >= 2) {
            new_array[0] = a[0];
            new_array[1] = a[1];
        } else if (a.length == 1) {
            new_array[0] = a[0];
            new_array[1] = b[0];
        } else {
            new_array[0] = b[0];
            new_array[1] = b[1];
        }

        System.out.print("[");
        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + ",");
        }
        System.out.print("]");
        System.out.println();
        //Note: you can also joing array a and b and fill up new array until slots are filled.
    }

}