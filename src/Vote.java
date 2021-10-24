import java.util.Scanner;

public class Vote
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);//allows user to input
        System.out.println("Enter the Age"); // takes input from user
        int age = scanner.nextInt();

        legalAge(age);
    }

    public static void legalAge(int age) {

        if (age >= 18) {
            System.out.println("Eligible to Vote");// this message is displayed if age is 18 and over

        } else
            System.out.println("Not Eligible to Vote"); // this message is displayed if age is less than 18
        }
    }

