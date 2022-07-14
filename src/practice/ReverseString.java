package practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original = new Scanner(System.in).nextLine();
        // TODO: 10-07-2022 validate input
        System.out.println("Original String is : "+ original );
        System.out.println("Reversed string is : "+reverseString(original));

    }

    /** This method will Reverse the string
     * @param s String that need to be reversed */
    public static String reverseString( String  s) {
        //return new StringBuilder().append(s).reverse().toString();

       /* String reverse = "";
        for (int i = s.length()-1; i >=0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;*/



        char[] charArray = s.toCharArray();
        String reverse = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverse = reverse + charArray[i];
        }
        return reverse;
    }

}
