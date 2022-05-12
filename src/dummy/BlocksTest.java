package dummy;

public class BlocksTest {
    public static void main(String[] args) {
        System.out.println("From main method");
        BlocksTest b = new BlocksTest();
    }

    {
        System.out.println("From empty block");

    }

    static {
        System.out.println("From Static block");

    }

    public BlocksTest() {
        System.out.println("From constructor");
    }


}
