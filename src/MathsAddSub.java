// 13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;

public class MathsAddSub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// allows user to input
        System.out.println("Enter the First Number : ");//takes input from user
        int x = sc.nextInt();

        System.out.println("Enter the Second Number : ");//takes input from user
        int y = sc.nextInt();

        System.out.println("Enter Symbol from +,-, /,*");//takes input from user
        char z = sc.next().charAt(0);

        calculate(x, y, z);

    }

    public static void calculate(int num1, int num2, char symbol) {
        if (symbol == '+') {
            System.out.println(num1 + num2); // outputs addition
        } else if (symbol == '-') {
            System.out.println(num1 - num2);// outputs subtraction
        } else if (symbol == '*') {
            System.out.println(num1 * num2);// outputs multiplication
        } else if (symbol == '/') {
            System.out.println(num1 / num2);// outputs division
        }
    }
}

