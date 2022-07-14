package practice;

import java.util.List;
import java.util.Objects;

public class Palindrome extends ReverseNumber {
    public static void main(String[] args) {
        numPal();
        System.out.println(isPalindrome("abba"));
        reverseNum(45);
        
    }

    private static void numPal() {
        int n = 256, start = 31;

        for (int i = start; i < n; i++) {
            if (isPalindrome(i))
            System.out.println(i);
        }
    }

    private static <T> boolean isPalindrome(T a) {
        return Objects.equals(String.valueOf(a), new StringBuilder().append(a).reverse().toString());
    }


    protected int abc(int x) {
        return 0;
    }
    public void sleep(boolean b) {

    }

}
