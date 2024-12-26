// Write a code to show NullPointerException.

// NullPointerException in java arises when you try to use an object reference that has the null value
public class TaskSix {

    public static void main(String[] args) {
        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught...!!!");
            System.out.println(e);
        }
    }
}
