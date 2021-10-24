// 12. Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class UpercaseLowercase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in); //allows user to input
        System.out.println(" Enter your name in Capitals"); // takes input from user
        String input = scanner.next();

        System.out.println(input.toLowerCase()); // changes input date to lowercase
        System.out.println("Upper Case changed to lower case successfully");// output


    }
}
