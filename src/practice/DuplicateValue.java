package practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValue {
    public static void main(String[] args) {
        Integer[] a = {1, 3, 4, 5, 4, 8, 8, 6, 7, 2};
        String[] s = {"Venkat", "ram", "java", "java", "c++"};
        findDuplicate(s);

    }

    private static <T>void findDuplicate(T[] data) {
        Map<T, Integer> container = new HashMap<>();
        for (T d : data) {
            container.merge(d, 1, Integer::sum);
        }
        for (Map.Entry<T, Integer> entry : container.entrySet()) {
            if (entry.getValue()>1)
                System.out.println(entry.getKey());

        }
    }
}
