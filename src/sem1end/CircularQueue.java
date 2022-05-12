package sem1end;

import java.util.Scanner;

public class CircularQueue {

    static int size, front, rear;
    static int[] a;

    public static void init(int s) {
        size = s;
        a = new int[size];
        front = -1;
        rear = -1;
    }

    public static void enqueue(int n) {
        if ((rear == size - 1 && front == 0) || (rear + 1 == front)) {
            System.out.println("Queue Overflow..!");
            return;
        }
        if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        a[rear] = n;
        if (front == -1) {
            front = 0;
        }
    }

    public static void dequeue() {
        int n;
        if (front == -1) {
            System.out.println("Queue Underflow..!");
            return;
        } else {
            n = a[front];
            if (front == rear) {
                front = rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        System.out.println("Deleted Element " + n);
    }

    public static void peek() {
        int n;
        if (front == -1 && rear == -1) {
            System.out.println("Queue Empty..!");
            return;
        } else {
            n = a[rear];
        }
        System.out.println("Peek Element " + n);
    }

    public static void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty..!");
        } else {
            int i;
            for (i = front; i <= rear; i++) {
                System.out.println("value is " + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size: ");
        n = sc.nextInt();
        init(n);
        while (true) {
            System.out.println("Enter your Choice: ");
            System.out.println("\n 1. Enqueue \t 2. Dequeue \t 3. Peek \t 4. Display \t 5. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter value: ");
                    x = sc.nextInt();
                    enqueue(x);
                }
                case 2 -> dequeue();
                case 3 -> peek();
                case 4 -> display();
                case 5 -> System.exit(0);
                default -> System.out.println("Enter a valid choice...");
            }
        }

    }
}