
import java.util.Scanner;

public class PatternSix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        // // First half
        // for (int i = 1; i <= n-1; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (!(i == j || j == 1)) {
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     for (int k = 1; k <= 2 * (n - i); k++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         if (!(i == j || j == 1)) {
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }
        // // Second half
        // for (int i = n-1; i > 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (!(i == j || j == 1 )) {
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     for (int k = 1; k <= 2 * (n - i); k++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         if (!(i == j || j == 1 )) {
        //             System.out.print("  ");
        //         } else {
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        
        for (int i = 1; i <= (n * 2) - 1; i++) {
            for (int j = 1; j <= (n * 2) - 1; j++) {
                if (j == 1 || j == (2 * n - 1) || i == j || i == ((2 * n - 1) + 1) - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
