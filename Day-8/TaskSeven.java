
import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int result = 0;

        int temp = n;
        while (temp != 0) {
            int remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp /= 10;
        }

        if (n == result) {
            System.out.println("Entered number is an ArmStrong number.");
        } else {
            System.out.println("Given number is not an ArmStrong number.");
        }

        sc.close();
    }
}
