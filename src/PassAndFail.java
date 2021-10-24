// 4. same as above but pass or fails on the basis of..student needs to pass all the subjects

import java.util.Scanner;

public class PassAndFail
{

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);// allows user to input
            System.out.println("Enter Student Name: ");
            String name = scanner.next(); // Reads student name
            System.out.println("Enter Roll Number");// Reads Roll Number
            int RollNumber = scanner.nextInt();
            System.out.println("Enter Marks for English");// takes input from user
            double marks = scanner.nextDouble();
            System.out.println("Enter Marks for Science");// takes input from user
            double marks1 = scanner.nextDouble();
            System.out.println("Enter Marks for Maths");// takes input from user
            double marks2 = scanner.nextDouble();

            findPassOrFail(marks,marks1,marks2);// takes input from user

        }
        public static void findPassOrFail(double english, double science, double maths) //Checks if individual marks are above 35 if yes the student passed else failed
        {
            if(english >=35.0 && science >= 35.0 && maths >= 35.0){  //calculation
                System.out.println("You have Passed");// prints out pass if student score 35 and above
            }
            else
                System.out.println(" You have Failed");// prints out fails if student score below 35

        }

}
