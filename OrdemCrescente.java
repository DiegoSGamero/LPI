// 13.	 Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

public class OrdemCrescente {
    private int valor1;
    private int valor2;

    public OrdemCrescente(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void ordenarValores() {
        if (valor1 < valor2) {
            System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        OrdemCrescente ordem = new OrdemCrescente(valor1, valor2);
        ordem.ordenarValores();
    }
}
