import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double a,b,c,d,e;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 5 Numbers : ");
         a = scanner.nextDouble();
         b = scanner.nextDouble();
         c= scanner.nextDouble();
         d= scanner.nextDouble();
         e = scanner.nextDouble();

         double sum = a+b+c+d+e;

        System.out.println("The Average of " + a + " + "  +b+ " + "  +c+ " + "   +d+ " + " +e+ " = "  + sum/5.0  ) ;

    }

}