
import java.util.Scanner;

// Write a program to create a StringBuffer and Clear the StringBuffer using different methods of that.

public class TaskSeven {
    public static void main(String[] args) {
        // String s="This is some string";

        Scanner sc=new Scanner(System.in);

        StringBuffer sb=new StringBuffer();
        sb.append("This");
        sb.append(" is");
        sb.append(" some");
        sb.append(" string");

        System.out.println("Original String Buffer: "+sb.toString());

        System.out.println("1. Using delete() function \n2. Using setLength() function \n3. By creating new String Buffer for same object");
        int ch=sc.nextInt();

        switch (ch) {
            case 1 -> {
                sb.delete(0, sb.length());
                System.out.println("StringBuffer has been cleared using delete() function");
                System.out.println("String Buffer: "+sb.toString());
            }
            
            case 2 -> {
                sb.setLength(0);
                System.out.println("StringBuffer has been cleared using setLength() function");
                System.out.println("String Buffer: "+sb.toString());
            }

            case 3 -> {
                sb=new StringBuffer();
                System.out.println("StringBuffer has been cleared by creating new String Buffer");
                System.out.println("String Buffer: "+sb.toString());
            }

            default -> {
            }
        }
        sc.close();
    }
}
