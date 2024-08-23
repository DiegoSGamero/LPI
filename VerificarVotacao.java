// 11.	 Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class VerificarVotacao {
    private int anoAtual;
    private int anoNascimento;

    public VerificarVotacao(int anoAtual, int anoNascimento) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    public void verificarSePodeVotar() {
        int idade = anoAtual - anoNascimento;
        if (idade >= 16) {
            System.out.println("A pessoa pode votar este ano.");
        } else {
            System.out.println("A pessoa não pode votar este ano.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        VerificarVotacao pessoa = new VerificarVotacao(anoAtual, anoNascimento);
        pessoa.verificarSePodeVotar();
    }
}
