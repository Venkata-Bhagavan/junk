package stack;

import java.util.Scanner;

public class Stack {
    int top =-1, maxsize = 10;
    int[] arr = new int[maxsize];

    boolean push(Scanner scanner) {
        if (top == maxsize - 1) {
            print("Overflow!");
            return false;
        } else {
            print("Enter value : ");
            int a = scanner.nextInt();
            top++;
            arr[top] = a;
            print("Item pushed");
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            print("Underflow!");
            return false;
        } else {
            top--;
            print("Item Popped");
            return true;
        }
    }

    void display() {
        print("Printing stack.Stack elements...");
        for (int i = top; i >= 0; i--) print(arr[i] +" ");

    }

     public  <T>void print(T s) {    // This method takes any type of input (because it is generic method)
        System.out.println(s);
    }
}



