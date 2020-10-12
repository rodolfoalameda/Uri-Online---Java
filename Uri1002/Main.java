package Uri1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pi = 3.14159;
		double r = input.nextDouble();
		double area = pi * Math.pow(r, 2);

		System.out.printf("A=%.4f", area);
		System.out.println();

		input.close();

	}

}
