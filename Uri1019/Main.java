package Uri1019;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int segundos = 0;

        int hora = n / 3600;
        int resto = n % 3600;

        int minuto = resto / 60;
        resto = n % 60;

        segundos = resto;

        System.out.println(hora + ":" + minuto + ":" + segundos);
    }
}
