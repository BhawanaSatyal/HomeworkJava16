import java.util.Scanner;

public class WeekDisplay{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int day = scanner.nextInt();


        if (day ==1 )
        {
            System.out.println(" It is Sunday");
        }
    else if (day == 2 )
        {
            System.out.println(" It is Monday");
        }
        else if (day == 3 )
        {
            System.out.println(" It is Tuesday");
        } else if (day == 4 )
        {
            System.out.println(" It is Wednesday");
        } else if (day == 5 )
        {
            System.out.println(" It is Thursday");
        } else if (day == 6 )
        {
            System.out.println(" It is Friday");
        }
        else if (day == 7 )
        {
            System.out.println(" It is Saturday");
        }

        else
            System.out.println("Invalid Number");
    }
}
