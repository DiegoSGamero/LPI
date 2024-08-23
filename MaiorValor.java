//  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class MaiorValor {
    private int valor1;
    private int valor2;

    public MaiorValor(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void verificarMaior() {
        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        MaiorValor maior = new MaiorValor(valor1, valor2);
        maior.verificarMaior();
    }
}
