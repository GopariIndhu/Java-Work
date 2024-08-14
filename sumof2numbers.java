package oops;

import java.util.Scanner;

public class sumof2numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");

        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);



	}

}
