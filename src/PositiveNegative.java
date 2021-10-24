import java.util.Scanner;

public class PositiveNegative
{

    public static void main(String[] args)
    {
        int number;

        Scanner scanner = new Scanner(System.in);//allows user to input
        System.out.println("Enter a Number: ");//takes input from user
        number = scanner.nextInt();
        scanner.close();

        findPositiveNegative(number);

    }

    public static void findPositiveNegative(int number){
        if (number > 0) {
            System.out.println("The Number is positive Number");// output
        }
        else if (number < 0)
            System.out.println("The Number is Negative Number"); // output
         else
            System.out.println("The Number = 0"); // output
    }



    }

