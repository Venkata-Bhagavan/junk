package dummy;

public class LoopsTest {
    public static void main(String[] args) {
        // here both for loops are same as they are incremented after the code in for block executed.
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i <=5; ++i) {
            System.out.print(i + "\t");
        }

        int a = 3;
        int b = a++;
        int c = ++a;
        System.out.println(c);

    }
}
