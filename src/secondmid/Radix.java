package secondmid;


import java.util.Arrays;

class Radix {

    static int getMax(int[] arr) {

        int mx = arr[0];
        for (int i : arr) if (i > mx) mx = i;
        return mx;
    }


    static void countSort(int[] a, int n, int exp) {
        int[] output = new int[n];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++)
            count[(a[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            a[i] = output[i];
    }



    static void radixSort(int[] arr) {
//        int m = getMax(arr, n);
        int m = getMax(arr);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, arr.length, exp);
    }




    /*Driver function to check for above function*/
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        radixSort(arr);
        //radixSort(arr, n);
        //print(arr, n);
        print(arr);
    }

    static void print(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
    }
}


