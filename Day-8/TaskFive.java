// Write a java program to calculate the permutation and combination of a 2 numbers.

import java.util.Scanner;

public class TaskFive {

    static int factorail(int n) {
        int fact = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Enter r: ");
        int r = sc.nextInt();

        double permutation = factorail(n) / factorail(n - r);
        double combination = factorail(n) / (factorail(r) * factorail(n - r));

        System.out.println("Permutation: " + permutation);
        System.out.println("Combination: " + combination);

        sc.close();
    }
}
