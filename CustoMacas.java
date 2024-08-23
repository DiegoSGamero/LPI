// 9.	 As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

import java.util.Scanner;

public class CustoMacas {
    private int quantidade;

    public CustoMacas(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularCustoTotal() {
        if (quantidade >= 12) {
            return quantidade * 1.00;
        } else {
            return quantidade * 1.30;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        CustoMacas custo = new CustoMacas(quantidade);
        System.out.println("Custo total: R$ " + custo.calcularCustoTotal());
    }
}
