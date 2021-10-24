import java.util.Scanner;

public class UpercaseLowercase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);
        System.out.println(" Enter your name in Capitals");
        String input = scanner.next();

        System.out.println(input.toLowerCase());
        System.out.println("Upper Case changed to lower case successfully");


    }
}
