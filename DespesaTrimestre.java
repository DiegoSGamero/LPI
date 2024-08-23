// 16.	Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.
import java.util.Scanner;


public class DespesaTrimestre {
  private double janeiro;
  private double fevereiro;
  private double marco;

  public DespesaTrimestre(double janeiro, double fevereiro, double marco) {
      this.janeiro = janeiro;
      this.fevereiro = fevereiro;
      this.marco = marco;
  }

  public double calcularDespesaTotal() {
      return janeiro + fevereiro + marco;
  }

  public double calcularMediaMensal() {
      return calcularDespesaTotal() / 3;
  }

  public static void main(String[] args) {
      double janeiro = 15000;
      double fevereiro = 23000;
      double marco = 17000;

      DespesaTrimestre despesas = new DespesaTrimestre(janeiro, fevereiro, marco);
      System.out.println("Despesa total no trimestre: R$ " + despesas.calcularDespesaTotal());
      System.out.println("Média mensal de gastos: R$ " + despesas.calcularMediaMensal());
  }
}
