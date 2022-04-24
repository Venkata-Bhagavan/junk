package secondmid;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int found = 0, key, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements : ");
        for (i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter which element you want to search : ");
        key = sc.nextInt();
        for (i = 0; i <= n - 1; i++) {
            if (arr[i] == key) {
                found = 1;
                System.out.println("The element you searched is at " + i);
            }
        }
    }
}


