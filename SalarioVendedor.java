// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class SalarioVendedor {
    private int carrosVendidos;
    private double valorTotalVendas;
    private double salarioFixo;
    private double comissaoPorCarro;

    public SalarioVendedor(int carrosVendidos, double valorTotalVendas, double salarioFixo, double comissaoPorCarro) {
        this.carrosVendidos = carrosVendidos;
        this.valorTotalVendas = valorTotalVendas;
        this.salarioFixo = salarioFixo;
        this.comissaoPorCarro = comissaoPorCarro;
    }

    public double calcularSalarioFinal() {
        double comissaoTotal = carrosVendidos * comissaoPorCarro;
        double bonusPorVenda = valorTotalVendas * 0.05;
        return salarioFixo + comissaoTotal + bonusPorVenda;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.println("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor da comissão por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        SalarioVendedor salario = new SalarioVendedor(carrosVendidos, valorTotalVendas, salarioFixo, comissaoPorCarro);
        System.out.println("Salário final do vendedor: " + salario.calcularSalarioFinal());
    }
}
