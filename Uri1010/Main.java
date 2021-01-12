package Uri1010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cod1 = input.nextInt();
        int n1 = input.nextInt();
        double qtd1 = input.nextDouble();
        double total1 = n1 * qtd1;

        int cod2 = input.nextInt();
        int n2 = input.nextInt();
        double qtd2 = input.nextDouble();
        double total2 = n2 * qtd2;

        double totalCompra = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalCompra);
        System.out.println();
    }
}
