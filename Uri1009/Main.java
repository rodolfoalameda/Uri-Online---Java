package Uri1009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();

        double total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f", total);
        System.out.println();

    }
}
