package secondmid;

public class BubbleSortDemo {

    public void Sort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
//swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

class BubbleSortTest {
    public static void main(String[] args) {
        BubbleSortDemo bd = new BubbleSortDemo();
        int[] arr = {5, 2, 1, 7, 3};
        System.out.println("Array Before Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        bd.Sort(arr);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

