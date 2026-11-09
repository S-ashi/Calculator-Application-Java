package com.calculator;

import java.util.Scanner;

public class BasicCalculator {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int choice;
	        double num1;
	        double num2;

	        do {

	            System.out.println("\n----- Calculator Application -----");

	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            if (choice >= 1 && choice <= 4) {

	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();

	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();

	                switch (choice) {

	                    case 1:
	                        addition(num1, num2);
	                        break;

	                    case 2:
	                        subtraction(num1, num2);
	                        break;

	                    case 3:
	                        multiplication(num1, num2);
	                        break;

	                    case 4:
	                        try {
	                            division(num1, num2);
	                        } catch (ArithmeticException e) {
	                            System.out.println("Error: Cannot divide by zero!");
	                        }
	                        break;
	                }

	            } else if (choice == 5) {

	                System.out.println("Thank you for using Calculator!");

	            } else {

	                System.out.println("Invalid choice! Please try again.");
	            }

	        } while (choice != 5);

	        sc.close();
	    }

	    public static void addition(double num1, double num2) {

	        double result = num1 + num2;

	        System.out.println("Result = " + result);
	    }

	    public static void subtraction(double num1, double num2) {

	        double result = num1 - num2;

	        System.out.println("Result = " + result);
	    }

	    public static void multiplication(double num1, double num2) {

	        double result = num1 * num2;

	        System.out.println("Result = " + result);
	    }

	    public static void division(double num1, double num2) {

	        if (num2 == 0) {

	            throw new ArithmeticException();

	        }

	        double result = num1 / num2;

	        System.out.println("Result = " + result);
	    }
	

}
