
// Input any two number and find out its odd or even use turnery operator (? :)

import java.util.Scanner;

public class TurneryOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //allows user to input
        System.out.println("Enter the First Number : "); //takes input from user
        int x = sc.nextInt();

        System.out.println("Enter the Second Number : "); // takes input from user
        int y = sc.nextInt();

        String result = (x %2 ==0) ? "Even Number" : "Odd Number"; // works out if number is even or odd
        String result1 = (y %2 ==0) ? "Even Number" : "Odd Number"; // works out if number is even or odd
        System.out.println( "The Number " + x + " = " +result); // output
        System.out.println( "The Number " + y + " = " +result1); // output



    }

}
