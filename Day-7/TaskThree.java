// Write a program to check if a List of integers contains only odd numbers.

import java.util.Arrays;
import java.util.List;

public class TaskThree {

    static boolean conntainsOnlyOdd(List<Integer> li) {
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 3, 5);

        if (conntainsOnlyOdd(li)) {
            System.out.println("List contains only odd elements.");
        } else {
            System.out.println("List does not contains only odd elements");
        }
    }
}
