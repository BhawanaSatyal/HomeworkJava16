import java.util.Scanner;

public class TurneryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int x = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int y = sc.nextInt();

        String result = (x %2 ==0) ? "Even Number" : "Odd Number";
        String result1 = (y %2 ==0) ? "Even Number" : "Odd Number";
        System.out.println( "The Number " + x + " = " +result);
        System.out.println( "The Number " + y + " = " +result1);



    }

}
