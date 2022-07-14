package practice;

import java.util.ArrayList;
import java.util.List;

public class Frebanoci {
    static int last_before = 0, last = 1, next;
    public static void main(String[] args) {
//        System.out.println(fSeries(10).toString());
        for (int i = 0; i < 10; i++) {
            System.out.print(rFSeries(i)+" ");
        }
    }

    private static List<Integer> fSeries(int a) {
        List<Integer> fNumbers = new ArrayList<>();
        fNumbers.add(0);
        fNumbers.add(1);
        while (fNumbers.size() <= a) {
            fNumbers.add(fNumbers.get(fNumbers.size()-1) + fNumbers.get(fNumbers.size() - 2));
        }
        return fNumbers;
    }

    private static int rFSeries(int a) {
        return a <= 1 ? a : rFSeries(a - 2) + rFSeries(a - 1);
    }
}
