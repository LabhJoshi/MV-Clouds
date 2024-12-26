// Write a program to remove whitespaces from a given String. (Without using any inbuilt functions)  String - "WELCOME TO MV CLOUDS"

import java.util.Scanner;

class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = sc.nextLine();
        String outpuString = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            outpuString += s.charAt(i);
        }

        System.out.println(outpuString);
        sc.close();
    }
}
