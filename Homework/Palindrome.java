package Homework;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int pointer_1 = 0;
        int pointer_2 = word.length() - 1;

        while(pointer_1 < pointer_2) {
            if(word.charAt(pointer_1) != word.charAt(pointer_2)) {
                return false;
            }

            pointer_1++;
            pointer_2--;
        }

        return true;
    }

    public static void main(String[] args) {            
        String word = "racecar";        
        System.out.println(isPalindrome(word));
    }
}