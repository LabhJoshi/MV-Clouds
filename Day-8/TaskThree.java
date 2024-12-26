
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Write a program to find the Second biggest integer value in the given list of values.[98,32,72,94,75,73,92,36,28,34]
public class TaskThree {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(98, 32, 72, 94, 75, 73, 92, 36, 28, 34);
        Collections.sort(li);
        System.out.println("Second largest element in the given list: " + li.get((li.size() - 2)));
    }
}
