// 4.	 O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

import java.util.Scanner;

public class CustoFinalCarro {
    private double custoFabrica;

    public CustoFinalCarro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoFinal() {
        double percentualDistribuidor = 0.28;
        double impostos = 0.45;
        return custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * impostos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        CustoFinalCarro custoFinal = new CustoFinalCarro(custoFabrica);
        System.out.println("Custo final ao consumidor: " + custoFinal.calcularCustoFinal());
    }
}
