package Uri1011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double pi = 3.14159;
        double volume = (Math.pow(r, 3) * pi * 4) / 3;

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();
    }
}
