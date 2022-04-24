import java.util.Scanner;

public class Elevator {

    //static boolean isGoingUp, isMoving;

    static int eFlourNo, uFlourNo;

    public static void main(String[] args) {

        print("press -1 to exit...");
        print("Elevator is in Ground flour");
        Scanner scanner = new Scanner(System.in);

        do {
            print("Elevator is in " + (eFlourNo == 0 ? "Ground" : eFlourNo) + " flour");
            print("\t enter your flour no : ");
            uFlourNo = scanner.nextInt();
            if (uFlourNo <= -1) System.exit(0);
            moveElevator(uFlourNo);
            print("\n\t opening doors...");
            print("\n enter destination flour : ");
            goToDestination(scanner.nextInt());
        } while (true);

    }

    private static void goToDestination(int d) {
        if (d == eFlourNo) {
            print("you are on the same flour...");
        } else moveElevator(d);
        print("\n\topening doors..\n");

    }

    private static void moveElevator(int n) {

        if (n != eFlourNo) {
            if (n > eFlourNo)
                while (eFlourNo < n) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {

                    }
                    eFlourNo++;
                    print("Elevator is in " + eFlourNo + " flour");
                }

            else
                while (eFlourNo > n) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {

                    }
                    eFlourNo--;
                    print("Elevator is in " + eFlourNo + " flour");
                }
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
