/* "Find the word according to input. 

Ex. String input: I love Java

number input : 3

Ouput : Java " */

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String s=sc.nextLine();
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        String[] new_string=s.split("\s");
        for(int i=0;i<new_string.length;i++){
            if((i+1)==n){
                System.out.println(new_string[i]);
            }
        }
        sc.close();
    }
}
