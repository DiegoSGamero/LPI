//  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class DuracaoJogo {
    private int horaInicio;
    private int horaFim;

    public DuracaoJogo(int horaInicio, int horaFim) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public void calcularDuracao() {
        int duracao;
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.println("Digite a hora de término do jogo: ");
        int horaFim = scanner.nextInt();

        DuracaoJogo jogo = new DuracaoJogo(horaInicio, horaFim);
        jogo.calcularDuracao();
    }
}
