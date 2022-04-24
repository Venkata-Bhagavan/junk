package secondmid;

import java.util.Scanner;

public class QuickSortExample {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
        while (i <= j) {
            while (arr[i] < pivot) i++;

            while (arr[j] > pivot) j--;

            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(arr, low, j);

        if (i < high) quickSort(arr, i, high);

    }
}


class QuickSortDemo {
    public static void main(String[] args) {
        //QuickSortExample qs=new QuickSortExample();
        Scanner scan = new Scanner(System.in);
        int n, i;
        print("Enter number of integer elements");
        n = scan.nextInt();
        int[] arr = new int[n];
        print("\nEnter " + n + " integer elements");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        QuickSortExample.sort(arr);
        print("\nElements after sorting ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        print("");
    }

    private static void print(String s) {
        System.out.println(s);
    }

}


