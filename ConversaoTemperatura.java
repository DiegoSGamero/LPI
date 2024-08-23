// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

import java.util.Scanner;

public class ConversaoTemperatura {
    private double temperaturaFahrenheit;

    public ConversaoTemperatura(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double converterParaCelsius() {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        ConversaoTemperatura conversao = new ConversaoTemperatura(temperaturaFahrenheit);
        System.out.println("Temperatura em Celsius: " + conversao.converterParaCelsius());
    }
}
