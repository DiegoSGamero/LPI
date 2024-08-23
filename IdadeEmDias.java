// 1.	Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class IdadeEmDias {
    private int anos;
    private int meses;
    private int dias;

    public IdadeEmDias(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calcularDias() {
        return (anos * 365) + (meses * 30) + dias;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        IdadeEmDias idade = new IdadeEmDias(anos, meses, dias);
        System.out.println("Idade expressa em dias: " + idade.calcularDias());
    }
}
