// 15.	A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class SalarioComHorasExtras {
    private int horasTrabalhadas;
    private double salarioPorHora;

    public SalarioComHorasExtras(int horasTrabalhadas, double salarioPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalarioTotal() {
        int horasSemanais = 40;
        int horasMensais = horasSemanais * 4;
        double salarioTotal;

        if (horasTrabalhadas <= horasMensais) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - horasMensais;
            double valorHorasExtras = horasExtras * salarioPorHora * 1.5;
            salarioTotal = (horasMensais * salarioPorHora) + valorHorasExtras;
        }

        return salarioTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        SalarioComHorasExtras salario = new SalarioComHorasExtras(horasTrabalhadas, salarioPorHora);
        System.out.println("Salário total: R$ " + salario.calcularSalarioTotal());
    }
}
