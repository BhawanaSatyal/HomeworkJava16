import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println( "It is a Leap Year");
        }
        else {
            System.out.println(" Not a Leap Year");
        }
    }
}