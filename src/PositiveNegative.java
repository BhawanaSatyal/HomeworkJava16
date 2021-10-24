import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();
        scanner.close();

        findPositiveNegative(number);


    }

    public static void findPositiveNegative(int number){
        if (number > 0) {
            System.out.println("The Number is positive Number");
        }
        else if (number < 0) {
            System.out.println("The Number is Negative Number");
        } else
            System.out.println("The Number = 0");
    }



    }

