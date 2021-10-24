import java.util.Scanner;

public class LeapYear
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);// allows user to input

        System.out.println("Enter a Year");// takes input from user
        int year = scanner.nextInt();

        declareLeapYear(year);
    }

    public static void declareLeapYear(int year)
    {


        if (year % 4 == 0) {
            System.out.println( "It is a Leap Year");// output
        }
        else
            System.out.println(" Not a Leap Year");// output

    }
}