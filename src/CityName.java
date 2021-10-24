import java.util.Scanner;

public class CityName
    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// allows user to input

        System.out.println("Enter a first character of City Name");// taking input from user

        char city = scanner.next().charAt(0);

        recogniseCity(city);
    }

    public static void recogniseCity(char city) {


        if ((city == 'a') || (city =='A'))
        {
            System.out.println(" Amsterdam");// prints Amsterdam if input from user is a
        }

        else if((city == 'b') || (city =='B'))
            System.out.println("Baroda");// prints Baroda if input from user is b


        else if((city == 'c') || (city =='C'))
            System.out.println("Cambridge");// prints Cambridge if input from user if c

                else if((city == 'd') || (city =='D'))

                    System.out.println("Dorchester");


            else if((city == 'e') || (city =='E'))
                    System.out.println("Edmonton");


            else if((city == 'f') || (city =='F'))
                        System.out.println("Baroda");

            else
        System.out.println(" Invalid Entry !!");// default for anything outside a-f


    }
}