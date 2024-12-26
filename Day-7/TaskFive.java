

/* "Reverse Decimal Number.

Ex. Input : 123.45

Ouput : 543.21" */

public class TaskFive {
    public static void main(String[] args) {
        double value=123.45;
        String temp=""+value;

        int index=temp.indexOf(".");

        String result=new StringBuilder(temp).reverse().toString();
        result=result.replace(".", "");
        String part1=result.substring(0,index);
        String part2=result.substring(index);
        result=part1+"."+part2;

        System.out.println("Original number: "+value);
        System.out.println("Reversed Number: "+result);
    }
}
