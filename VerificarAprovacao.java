// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class VerificarAprovacao {
    private double nota1;
    private double nota2;

    public VerificarAprovacao(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("Média: " + media);
        if (media >= 6) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        VerificarAprovacao aluno = new VerificarAprovacao(nota1, nota2);
        aluno.verificarAprovacao();
    }
}
