package stack;


import java.util.Scanner;

public class StackOperations {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        while (choice <= 4) {
            stack.print(" choose one from below options...");
            stack.print(" 1.push" +
                    "\t 2.pop" +
                    "\t 3.show" +
                    "\t 4.exit");
            stack.print("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> stack.push(scanner);
                case 2 -> stack.pop();
                case 3 -> stack.display();
                case 4 -> {
                    stack.print("Exiting..");
                    System.exit(0);
                }
                default -> stack.print("please Enter a valid choice");
            }
        }
    }
}
