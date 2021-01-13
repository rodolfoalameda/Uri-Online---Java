package Uri1014;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distancia = input.nextDouble();
        double gasolina = input.nextDouble();
        double consumo = distancia / gasolina;

        System.out.printf("%.3f km/l", consumo);
        System.out.println();
    }
}
