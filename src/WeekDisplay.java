// 15. WAP input any number, the print Day name of the week accordingly by using if else

import java.util.Scanner;

public class WeekDisplay
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//allows user to input

        System.out.print("Enter The Number: ");// takes input from user

        int day = scanner.nextInt();

        RecogniseWeek(day);

    }

    public static void RecogniseWeek(int day) {


        if (day ==1 ) // condition
        {
            System.out.println(" It is Sunday");// displays it is Sunday when 1 is entered
        }

    else if (day == 2 )

            System.out.println(" It is Monday"); // displays it is Monday when 2 is entered

        else if (day == 3 )

            System.out.println(" It is Tuesday"); // displays it is Tuesday when 3 is entered
        else if (day == 4 )

            System.out.println(" It is Wednesday"); // displays it is Wednesday  when 4 is entered
         else if (day == 5 )

            System.out.println(" It is Thursday"); // displays it is Thursday  when 5 is entered
         else if (day == 6 )

            System.out.println(" It is Friday"); // displays it is Friday when 6 is entered

        else if (day == 7 )

            System.out.println(" It is Saturday"); // displays it is Saturday when 7 is entered

        else
            System.out.println("Invalid Number"); // default message if anything outside 1-7
    }
    }

