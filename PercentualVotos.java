// 2.	 Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
import java.util.Scanner;

public class PercentualVotos {
    private int totalEleitores;
    private int votosBrancos;
    private int votosNulos;
    private int votosValidos;

    public PercentualVotos(int totalEleitores, int votosBrancos, int votosNulos, int votosValidos) {
        this.totalEleitores = totalEleitores;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
        this.votosValidos = votosValidos;
    }

    public void calcularPercentuais() {
        double percBrancos = (double) votosBrancos / totalEleitores * 100;
        double percNulos = (double) votosNulos / totalEleitores * 100;
        double percValidos = (double) votosValidos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos válidos: " + percValidos + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.println("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.println("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        PercentualVotos percentual = new PercentualVotos(totalEleitores, votosBrancos, votosNulos, votosValidos);
        percentual.calcularPercentuais();
    }
}
