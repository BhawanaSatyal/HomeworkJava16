// 7. WAP input any five number and then find average of five numbers

import java.util.Scanner;

public class Average {

    public static void main(String[] args)
    {
        double a,b,c,d,e; // declaring datatype

        Scanner scanner = new Scanner(System.in);// allows user to input
        System.out.println("Enter any 5 Numbers : ");// takes input from user
         a = scanner.nextDouble();
         b = scanner.nextDouble();
         c= scanner.nextDouble();
         d= scanner.nextDouble();
         e = scanner.nextDouble();

         double sum = a+b+c+d+e;

        System.out.println("The Average of " + a + " + "  +b+ " + "  +c+ " + "   +d+ " + " +e+ " = "  + sum/5.0  ) ;//calculates average of input numbers

    }

}
