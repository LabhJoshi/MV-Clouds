
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TaskFour {

    public static void main(String[] args) {
        String s = "My name is Joshi";

        String[] arr_s = s.split("\\s");
        List<String> li = new ArrayList<>();

        for (int i = arr_s.length - 1; i >= 0; i--) {
            li.add(arr_s[i]);
        }
        String output = "";

        ListIterator<String> i = li.listIterator();
        while (i.hasNext()) {
            output += i.next() + " ";
        }

        System.out.println(output);
    }
}
