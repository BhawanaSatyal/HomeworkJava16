import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first character of City Name");

        char city = scanner.next().charAt(0);


        if (city == 'a')
        {
            System.out.println(" Amsterdam");
        }else if(city == 'b') {
            System.out.println("Baroda");
        }
        else
        System.out.println(" Invalid Entry !!");


    }
}