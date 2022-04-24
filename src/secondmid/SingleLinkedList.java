package secondmid;


import java.util.Scanner;

class SingleLinkedList {
    public static Node head = null, tail = null, t, tra, ptr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your Choice: \n 1. append \t 2. insert \t 3. delete \t 4. display");

            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> append();
                case 2 -> insert();
                case 3 -> delete();
                case 4 -> display();
                default -> System.exit(0);
            }
        }
    }


    public static void append() {
        Scanner sc = new Scanner(System.in);
        if (tail != null) {
            t = new Node();
            int n;
            System.out.println("Enter any value: ");
            n = sc.nextInt();
            t.data = n;
            tail.lnk = t;
            tail = t;
            t.lnk = null;
            tra = head;
        } else {
            t = new Node();

            System.out.println("Enter any value: ");

            t.data = sc.nextInt();
            t.lnk = null;

            head = t;
            tail = t;
            tra = head;
        }
    }

    public static void insert() {
        Scanner sc = new Scanner(System.in);
        int target, count = 0;
        if (head == null)

            System.out.println("Insertion can not be done ");

        else {
            System.out.println("Enter target value: ");
            target = sc.nextInt();
            if (target == head.data) {
                t = new Node();
                int n;
                System.out.println("Enter any value: ");
                n = sc.nextInt();
                t.data = n;
                t.lnk = head;
                head = t;
            } else {
                ptr = head.lnk;
                while (ptr != null) {
                    if (ptr.data == target) {
                        count = 1;
                        if (ptr.lnk != null) {
                            t = new Node();
                            int n;
                            System.out.println("Enter any value: ");
                            n = sc.nextInt();
                            t.data = n;
                            t.lnk = ptr.lnk;
                            ptr.lnk = t;
                        } else {
                            t = new Node();
                            System.out.println("Enter any value: ");
                            t.data = sc.nextInt();
                            //t.lnk = ptr.lnk;
                            ptr.lnk = t;
                            t.lnk = null;
                            tail = t;
                        }
                    }
                    ptr = ptr.lnk;
                }
                if (count == 0)
                    System.out.println("Element Not Found ");
            }
        }
    }

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        int target, count = 0;
        if (head == null) {
            System.out.println("Deletion can not be done ");
        } else {
            System.out.println("Enter target value: ");
            target = sc.nextInt();
            if (target == head.data) {
                ptr = head;
                head = ptr.lnk;
            } else {
                ptr = head.lnk;
                while (ptr != null) {
                    if (ptr.data == target) {
                        count = 1;
                        if (ptr.lnk != null) {
                            ptr.lnk = ptr.lnk.lnk;
                        } else {
                            tail = t;
                        }
                    }
                    t = ptr;
                    ptr = ptr.lnk;
                }
                if (count == 0)
                    System.out.println("Element Not Found ");
            }
        }
    }


    public static void display() {
        //Scanner sc = new Scanner(System.in);
        if (tra == null) {
            System.out.println("No Elements");
        } else {
            tra = head;
            while (tra != null) {
                System.out.println(tra.data);
                tra = tra.lnk;
// System.out.println(tra);
            }
            tra = head;
        }
    }
}


//import java.util.*;
class Node {
    int data;
    Node lnk;
}


