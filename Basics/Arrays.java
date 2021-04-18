package Basics;

public class Arrays {
    public static void main(String args[]) {
        // DO NOT CHANGE ANY OF THE INDENTED CODE
        // Sets a radnom value for size;
        int size = (int) (Math.random() * 25) + 25;

        // Creates the array with the size.
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++)
            numbers[i] = (int) (Math.random() * 100);

        // Size is set to 0 so you will not be able to use this variable.
        size = 0;
        // DO NOT CHANGE ANYTHING ABOVE THIS LINE

        System.out.print("1. Total number of elements in the array: ");
        // 1. Output the length of the array.
        size = numbers.length;
        System.out.println(size);

        System.out.println();
        System.out.println("2. Original values in array");
        // 2. Output all the values in the array in a SINGLE LINE separated by a space
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("3. Reverse order of values in the array");
        // 3. Output all the values in the array in reverse order in a SINGLE LINE
        // separated by a space.
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("4. The total of all the values in the array are");
        // 4. Add up all the values in the array and output it.
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("5. The average of all the values in the array is");
        // 5. Calculate the average value and output it.
        int average = sum / size;
        System.out.println(average);

        System.out.println();
        System.out.println("6. The largest value in the array is");
        // 6. Identify the largest value in the array and output it

        System.out.println();
        System.out.println("7. The smallest value in the array is");
        // 7. Identify the smallest value in the array and output it

        System.out.println();
        System.out.println("8. The even numbers in the array are");
        // 8. Output all the even values in the array in a SINGLE LINE separated by a
        // space.

        System.out.println();
        System.out.println("9. The odd numbers in the array are");
        // 9. Output all the odd values in the array in a SINGLE LINE separated by a
        // space.

        System.out.println();
        System.out.println("10. The first and last values in the array swapped");
        // 10. You will output the array twice. First output the original
        // values in the array in a SINGLE LINE separated by a space. Next swop the
        // first and last values
        // in the array and output it again in a SINGLE LINE separated by a space below
        // the original
        // showing that the values have been swapped.

    }
}