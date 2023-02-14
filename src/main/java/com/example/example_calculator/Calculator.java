package com.example.example_calculator;
import java.util.Scanner;

import static java.lang.Boolean.FALSE;
import static java.lang.Math.log;

public class Calculator {
    static double firstOperand;
    static double secondOperand;
    static boolean validInput = FALSE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!validInput) {
            try{
                System.out.println("Insert Number 1:");
                firstOperand = scanner.nextDouble();}
            catch(Exception ex){validInput=FALSE;
                scanner.nextLine();
                continue;}
            System.out.println("Select Operation:\n1)+\n2)-\n3)*\n4)/\n5)ln");
            int num = scanner.nextInt();
            switch (num) {
                case 1:// +
                    try{
                        System.out.println("Insert Number 2:");
                        secondOperand = scanner.nextDouble();
                        System.out.println(firstOperand + secondOperand);
                        break;}
                    catch(Exception ex){validInput=FALSE;
                        System.out.println("Input Error");
                        scanner.nextLine();
                        break;}
                case 2:// -
                    try{
                        System.out.println("Insert Number 2");
                        secondOperand = scanner.nextDouble();
                        System.out.println(firstOperand - secondOperand);
                        break;}
                    catch(Exception ex){validInput=FALSE;
                        System.out.println("Input Error");
                        scanner.nextLine();
                        break;}
                case 3:// *
                    try{
                        System.out.println("Insert Number 2:");
                        secondOperand = scanner.nextDouble();
                        System.out.println(firstOperand * secondOperand);
                        break;}
                    catch(Exception ex){validInput=FALSE;
                        System.out.println("Input Error");
                        scanner.nextLine();
                        break;}
                case 4:// /
                    try {
                        System.out.println("Insert Number 2:");
                        secondOperand = scanner.nextDouble();
                        System.out.println(firstOperand / secondOperand);
                        break;
                    }
                    catch(Exception ex){validInput=FALSE;
                        System.out.println("Input Error:");
                        scanner.nextLine();
                    }
                case 5:// /
                    try{
                        System.out.println(log(firstOperand));
                        break;}
                    catch(Exception ex){validInput=FALSE;
                        System.out.println("Input Error");

                        scanner.nextLine();
                        break;}
                default:
                    System.out.println("Invalid number.Retry");
                    scanner.nextLine();
            }
        }
    }
}