package Uri1001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int X = A + B;

		System.out.println("X = " + X);
		
		input.close();
	}

}