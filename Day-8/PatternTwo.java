
import java.util.Scanner;

public class PatternTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter odd number to print proper Swastik: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please enter odd number...!!!");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (((j == 1 && i <= n - (n / 2)) || i == (n / 2) + 1 || (j == n && i > n - (n / 2))) || ((i == 1 && j >= n - (n / 2)) || j == (n / 2) + 1 || (i == n && j < n - (n / 2)))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

    }
}
