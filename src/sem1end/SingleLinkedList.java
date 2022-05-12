package sem1end;


import java.util.Scanner;

class SingleLinkedList {
    public static Node head = null, tail = null, t, tra, ptr;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter your Choice: \n 1. append \t 2. insert \t 3. delete \t 4. display \t 5.Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> append();
                case 2 -> insert();
                case 3 -> delete();
                case 4 -> display();
                case 5 -> System.exit(0);
                default -> print("Enter a valid choice");
            }
        }
    }

    private static void append() {
        print("Enter the value : ");
        t = new Node();
        t.data = sc.nextInt();
        if (head == null) {
            head = t;
        } else {
            tail.lnk = t;
        }
        tail = t;

    }

    protected static void insert() {
        println("Enter the target value..");
        int target = sc.nextInt();
        if (target == head.data) {
            t = new Node();
            println("Enter the value");
            t.data = sc.nextInt();
            t.lnk = head;
            head = t;
        } else {
            t = head;
            int count = 0;
            while (t != null && t.lnk != null) {
                if (t.lnk.data == target) {
                    count = 1;
                    ptr = new Node();
                    print("Enter the value : ");
                    ptr.data = sc.nextInt();
                    ptr.lnk = t.lnk;
                    t.lnk = ptr;
                    t = ptr.lnk;
                }

                t = t.lnk;
            }
            if (count == 0) println("Target value " + target + " not found");
        }
    }

    protected static void delete() {
        print("Enter the value to be deleted : ");
        int target = sc.nextInt();
        if (target == head.data) {
            t = head.lnk;
            head = t;
        } else {
            int count = 0;
            t = head;
            while (t != null && t.lnk != null) {
                if (t.lnk.data == target) {
                    count += 1;
                    if (t.lnk == tail) tail = t;
                    t.lnk = t.lnk.lnk;
                }
                t = t.lnk;
            }
            if (count == 0) println("Target value " + target + " not found..");
        }

    }

    protected static void display() {
        if (head == null) {
            println("There are no elements in list..");
        } else {
            t = head;
            println("The elements are...");
            while (t != null) {
                print(t.data + " ");
                t = t.lnk;
            }
            println(" ");
        }
    }


    private static <T> void print(T s) {
        System.out.print(s);
    }

    private static <T> void println(T s) {
        System.out.println(s);
    }


}


class Node {
    int data;
    Node lnk;
}


