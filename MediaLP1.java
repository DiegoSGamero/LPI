// Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.

import java.util.Scanner;

public class MediaLP1 {
    private double[] notas;

    public MediaLP1(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de notas: ");
        int numeroNotas = scanner.nextInt();
        double[] notas = new double[numeroNotas];

        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        MediaLP1 media = new MediaLP1(notas);
        System.out.println("Média de LP1: " + media.calcularMedia());
    }
}
