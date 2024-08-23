// 8.	 Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

import java.util.Scanner;

public class PositivoOuNegativo {
    private int valor;

    public PositivoOuNegativo(int valor) {
        this.valor = valor;
    }

    public void verificarValor() {
        if (valor >= 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        PositivoOuNegativo verificar = new PositivoOuNegativo(valor);
        verificar.verificarValor();
    }
}
