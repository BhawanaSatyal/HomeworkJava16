import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
            System.out.println("Input Character is Vowel");
        }
        else
            System.out.println("Input Character is a Consonant");
    }
}
