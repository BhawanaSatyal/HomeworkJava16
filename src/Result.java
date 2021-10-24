import java.util.Scanner;

public class Result
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// allows user to input
        System.out.println("Enter Student Name: ");// takes input from user
        String name = scanner.next();
        System.out.println("Enter Roll Number");// takes input from user
        int RollNumber = scanner.nextInt();
        System.out.println("Enter Marks for English");// takes input from user
        double marks = scanner.nextDouble();
        System.out.println("Enter Marks for Science");// takes input from user
        double marks1 = scanner.nextDouble();
        System.out.println("Enter Marks for Maths");// takes input from user
        double marks2 = scanner.nextDouble();
        double total = marks+marks1+marks2;
        double avg = total/3;// calculate average
        double percentage = (total/300)*100;// calculates percentage



        if (percentage >= 80) {
            System.out.println("Your Grade is A +"); //output
        } else if (percentage >= 60) {
            System.out.println(" Your Grade is A");//output
        } else if (percentage >= 50) {
            System.out.println(" Your Grade is B");//output
        } else if (percentage >= 35) {
            System.out.println(" Your Grade is C");//output
        }
        else
            System.out.println("Fail");//output
    }
}
