package Homework;

public class Substring {
    public static void main(String[] args) {
        // Substring Homework
        String word = "Adventure";
        System.out.println(word);
        String letter = word.substring(5, 6);
        System.out.println(letter);
        String letters = word.substring(2, 5);
        System.out.println(letters);
        
        // Char Homework
        String regular = "Regular";
        char ch3 = regular.charAt(2);
        char ch5 = regular.charAt(4);
        System.out.println(ch3);
        System.out.println(ch5);
        String reverse = "";
        for (int i = regular.length() - 1; i >= 0; i--) {
            reverse = reverse + regular.charAt(i);
        }
        System.out.print("The reversed string of the" + regular + " is: ");
        System.out.println(reverse);
    }
}