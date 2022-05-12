package sem1end;


class SelectionSortDemo {
    public void Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;//searching for lowest index
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}


class SelectionSortExample {
    public static void main(String[] a) {
        SelectionSortDemo sd = new SelectionSortDemo();
        int[] arr1 = {6, 2, 1, 3, 5};
        System.out.println("Before Selection Sort");
        for (int i : arr1) System.out.print(i + " ");
        System.out.println();
        sd.Sort(arr1);//sorting array using selection sort
        System.out.println("After Selection Sort");
        for (int i : arr1) System.out.print(i + " ");

    }
}

