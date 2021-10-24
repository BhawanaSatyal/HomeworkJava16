import java.util.Scanner;

public class MathsAddSub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int x = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int y = sc.nextInt();

        System.out.println("Enter Symbol from +,-, /,*");
       char z = sc.next().charAt(0);

        calculate(x,y,z);

    }

    public static void calculate(int num1, int num2, char symbol){
        if(symbol == '+'){
            System.out.println(num1 + num2);
        }
    }

}
