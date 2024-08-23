// 3.	 Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

import java.util.Scanner;

public class ReajusteSalarial {
    private double salarioAtual;
    private double percentualReajuste;

    public ReajusteSalarial(double salarioAtual, double percentualReajuste) {
        this.salarioAtual = salarioAtual;
        this.percentualReajuste = percentualReajuste;
    }

    public double calcularNovoSalario() {
        return salarioAtual + (salarioAtual * percentualReajuste / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        ReajusteSalarial reajuste = new ReajusteSalarial(salarioAtual, percentualReajuste);
        System.out.println("Novo salário: " + reajuste.calcularNovoSalario());
    }
}
