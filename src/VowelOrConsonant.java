// 16. Write a Java program that takes the user to provide a single character from the
// alphabet. Print Vowel or Consonant, depending on the user input.
//For eg:
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant

import java.util.Scanner;

public class VowelOrConsonant
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //allows user to input
        System.out.println("Enter a Character"); //takes input from user
        char ch = scanner.next().charAt(0);

        vowelConsonant(ch);
    }

    public static void vowelConsonant(char ch) {


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') // works out if character is Vowel
        {
            System.out.println("Input Character is Vowel"); // this message is displayed if character is Vowel
        }
        else
            System.out.println("Input Character is a Consonant");// this message is displayed if character is Consonant
    }
}
