package Uri1012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double pi = 3.14159;
        double trapezio = ((A + B) * C) / 2;

        System.out.printf("TRIANGULO: %.3f", (A * C) / 2);
        System.out.println();
        System.out.printf("CIRCULO: %.3f", Math.pow(C, 2) * pi);
        System.out.println();
        System.out.printf("TRAPEZIO: %.3f", trapezio);
        System.out.println();
        System.out.printf("QUADRADO: %.3f", B * B);
        System.out.println();
        System.out.printf("RETANGULO: %.3f", A * B);
        System.out.println();
        System.out.println();
    }
}
