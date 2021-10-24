// 14. Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class Alphabet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Value :");// taking input from user
        char ch = scanner.next().charAt(0); // datatype

        recogniseCharacter(ch);
    }

    public static void recogniseCharacter(char ch)
    {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {// checks if input from user is alphabet
            System.out.println(" It is an Alphabet");// output

        }
        else if (ch >= '0' && ch <= '9') // checks if input from user is number
            System.out.println("It is a Number");// output


        else
            System.out.println("It is a Symbol");// output
    }
 }




