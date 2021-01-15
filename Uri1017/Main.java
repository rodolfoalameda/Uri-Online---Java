package Uri1017;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tempo = input.nextDouble();
        double vMedia = input.nextDouble();
        double distancia = tempo * vMedia;
        double qtdLitros = distancia / 12;

        System.out.printf("%.3f", qtdLitros);
        System.out.println();

    }
}
