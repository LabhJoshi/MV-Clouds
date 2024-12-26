// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int n2 = sc.nextInt();

        System.out.println("Before swapping: \nn1: " + n1 + " n2: " + n2);

        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;

        System.out.println("After swapping:- \nn1: " + n1 + " n2: " + n2);

        /* It is bitwise xor method where xor of two number returns 1 where bit of this two numbers are different and 0 where bit of this two numbers
         * are same.
         */
    }
}
