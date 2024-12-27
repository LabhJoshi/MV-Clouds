
import java.util.Scanner;

public class PatternEight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1, p = 0; i <= n; i++, p++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
                if (k != i) {
                    System.out.print(p + " ");
                }
            }

            System.out.println();
        }

        for (int i = n - 1, p = n - 2; i > 0; i--, p--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
                if (k != i) {
                    System.out.print(p + " ");
                }
            }

            System.out.println();
        }
    }
}
