import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Value :");
        char ch = scanner.next().charAt(0);

        recogniseCharacter(ch);
    }



    public static void recogniseCharacter(char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(" It is a Alphabet");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Number");

        }
        else
            System.out.println("It is a Symbol");
    }
 }




