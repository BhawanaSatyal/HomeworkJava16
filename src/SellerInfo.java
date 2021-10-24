import java.util.Scanner;

public class SellerInfo {
    public static void main(String[] args) {

        double comm;

        Scanner scanner = new Scanner(System.in);// allows user to input
        System.out.println("Enter Seller's ID: ");// takes input from user
        int id = scanner.nextInt();
        System.out.println("Enter Seller's Name: ");// takes input from user
        String name = scanner.next();
        System.out.println("Enter Sales Amount: ");// takes input from user
        double sales = scanner.nextDouble();
        System.out.println("Enter Salary"); // takes input from user
        double salary = scanner.nextDouble();

        if (sales >= 50000) {
            comm = (sales * 0.35);
            System.out.println(" The Commission is " + comm); //output value of commission after the calculation

        } else if (sales >= 30000) {
            comm = (sales * 0.20); // calculates 20% of the total sales
            System.out.println("The Commission is " + comm); //output value of commission after the calculation

        } else if (sales >= 20000) {
            comm = (sales * 0.10);
            System.out.println("The commission is " + comm); //output value of commission after the calculation
        } else if (sales >= 10000) {
            comm = (sales * 0.05);
            System.out.println("The commission is " + comm);//output value of commission after the calculation
        } else if (sales < 10000) {
            comm = (sales * 0.02);
            System.out.println(" The commission is " + comm);//output value of commission after the calculation

        }
    }
}
