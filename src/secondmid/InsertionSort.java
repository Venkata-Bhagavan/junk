package secondmid;


public class InsertionSort {
    public static void Sort(int[] a) {
        int n = a.length;
        for (int j = 1; j < n; j++) {
            int key = a[j];
            int i = j - 1;
            while ((i > -1) && (a[i] > key)) {
                a[i + 1] = a[i];
                i--;
            }
            a[i + 1] = key;
        }
    }
}

class InsertionSortExample {
    public static void main(String[] a) {
        //InsertionSort id = new InsertionSort();
        int[] arr1 = {4, 1, 2, 5, 3};
        System.out.println("Before Insertion Sort");
        for (int i : arr1) System.out.print(i + " ");
        System.out.println();
        InsertionSort.Sort(arr1);//sorting array using insertion sort
        System.out.println("After Insertion Sort");
        for (int i : arr1) System.out.print(i + " ");

    }
}
