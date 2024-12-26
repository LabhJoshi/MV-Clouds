
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {

    static void methodOne() {
        List<Character> li = Arrays.asList('a', 'b', 'd', 'f', 'c', 'e');
        System.out.println("Unsorted list: " + li);
        Collections.sort(li);

        System.out.println("Sorted list: " + li);
    }

    static void methodTwo() {
        char[] c = {'a', 'b', 'd', 'f', 'c', 'e'};

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if ((int) c[j] > (int) c[j + 1]) {
                    char temp = c[j + 1];
                    c[j + 1] = c[j];
                    c[j] = temp;
                }
            }
        }

        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. With Inbuilt functions \n2. Without Inbuilt functions");
        System.out.println("Enter your choice:- ");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> {
                methodOne();
            }
            case 2 -> {
                methodTwo();
            }
            default -> {
                break;
            }
        }
        sc.close();
    }
}
