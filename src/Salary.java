//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//        HRA = basic salary 10%
//        DA = Basic salary 8%
//        TA = Basic salary 9%
//        PF= Basic salary 20%
//        Gross salary = basic salary + HRA + TA + DA -PF
// 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF

import java.util.Scanner;
public class Salary {


       static double HRA, DA, TA, PF, grossSalary;// datatype

        public static void main(String[] args) { // main method

                Scanner scanner = new Scanner(System.in);// allows user to input
                System.out.println("Enter Employee ID: "); // takes input from user
                int id = scanner.nextInt();
                System.out.println("Enter Employee Name: ");// takes input from user
                String name = scanner.next();
                System.out.println("Enter Basic Salary: ");// takes input from user
                double basicSalary = scanner.nextDouble();
                calculate(basicSalary);
        }
        
       
        public static void calculate(double basicSalary) {

                HRA = basicSalary * 0.10;
                DA = basicSalary * 0.08;
                TA = basicSalary * 0.09;
                PF = basicSalary * 0.20;
                grossSalary = basicSalary + HRA + TA + DA - PF;// calculation

                System.out.println("The Gross Salary = " + grossSalary);// output


        }
}

