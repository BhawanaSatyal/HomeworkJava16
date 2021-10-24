import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = scanner.next();
        System.out.println("Enter Roll Number");
        int RollNumber = scanner.nextInt();
        System.out.println("Enter Marks for English");
        System.out.println("Enter Marks for Science");
        System.out.println("Enter Marks for Maths");
        double marks = scanner.nextDouble();


        if (marks >= 80) {
            System.out.println("Your Grade is A +");
        } else if (marks >= 60) {
            System.out.println(" Your Grade is A");
        } else if (marks >= 50) {
            System.out.println(" Your Grade is B");
        } else if (marks >= 35) {
            System.out.println(" Your Grade is C");
        }
        else
            System.out.println("Fail");
    }
}
