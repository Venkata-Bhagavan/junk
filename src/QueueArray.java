import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueueArray {
    static  int i, front = -1, rear =-1,item, max =5, ch;
  //  static  int  front , rear ;
    static int[] a = new int[5];



    public static void main(String[] args) {
        while (true) {
            try {
                print("Select Options \n" +
                        "1.Insert \t 2. Delete \t 3.Display \t 4. Exit");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ch = Integer.parseInt(br.readLine());
            } catch (IOException ignored) {

            }
            if (ch ==4) break;
            else switch (ch) {
                case 1 -> insert();
                case 2 -> delete();
                case 3 -> display();
            }
        }
    }
    private static void insert() {
        if (rear >= max) {
            print("Queue is full");
        } else {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                print("Enter the Element: ");
                item = Integer.parseInt(br.readLine());
            } catch (IOException ignored) {
            }
            rear = rear + 1;
            a[rear] = item;
        }
    }
    private static void delete() {
        if (front == -1) {
            print("Queue is empty");
        } else {
            front = front + 1;
            item = a[front];
            print("Deleted item :" + item);
        }
    }
    private static void display() {
        print("Elements in Queue are : ");
        for (int i = front + 1; i <= rear; i++) print(a[i]);
    }


    private static  <T> void print(T s) {
        System.out.println(s);
    }
}
