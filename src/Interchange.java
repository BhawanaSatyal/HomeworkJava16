import java.util.Scanner;

public class Interchange {


    public static void main(String[] args)
    {
        int a, b, temp;
        Scanner scanner = new Scanner(System.in);// allows user to input data

        System.out.println(" Give value to A");// takes input from user
        a = scanner.nextInt();
        System.out.println("Give Value to B"); // takes input from user
        b = scanner.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nB = "+b);
        System.out.println("\nA = "+a);

        System.out.println("Numbers Interchanged Successfully");// output


    }

}
