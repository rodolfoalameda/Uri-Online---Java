package Uri1018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        int qtdNotas = valor / 100;
        int resto = valor % 100;

        System.out.println(valor);
        System.out.println(qtdNotas + " nota(s) de R$ 100,00");

        valor = resto;

        qtdNotas = valor / 50;
        resto = valor % 50;

        System.out.println(qtdNotas + " nota(s) de R$ 50,00");

        valor = resto;

        qtdNotas = valor / 20;
        resto = valor % 20;

        System.out.println(qtdNotas + " nota(s) de R$ 20,00");

        valor = resto;

        qtdNotas = valor / 10;
        resto = valor % 10;

        System.out.println(qtdNotas + " nota(s) de R$ 10,00");

        valor = resto;

        qtdNotas = valor / 5;
        resto = valor % 5;

        System.out.println(qtdNotas + " nota(s) de R$ 5,00");

        valor = resto;

        qtdNotas = valor / 2;
        resto = valor % 2;

        System.out.println(qtdNotas + " nota(s) de R$ 2,00");

        valor = resto;

        qtdNotas = valor / 1;
        resto = valor % 1;

        System.out.println(qtdNotas + " nota(s) de R$ 1,00");
    }
}
