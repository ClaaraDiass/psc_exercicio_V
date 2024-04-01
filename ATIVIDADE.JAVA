import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaTemperaturas = 0;
        int contadorTemperaturasValidas = 0;

        System.out.println("Medição de Temperatura Diária");
        System.out.println("Entre com as temperaturas do dia:");

        // Loop para ler e validar as 12 temperaturas
        for (int i = 1; i <= 12; i++) {
            double temperatura;
            do {
                System.out.print("Temperatura " + i + ": ");
                temperatura = scanner.nextDouble();
                // Verifica se a temperatura está no intervalo válido
                if (temperatura < 4  temperatura > 10) {
                    System.out.println("Temperatura inválida. Entre com uma temperatura entre 4°C e 10°C.");
                }
            } while (temperatura < 4  temperatura > 10);

            somaTemperaturas += temperatura;
            contadorTemperaturasValidas++;
        }

        // Calcula a média das temperaturas válidas
        double mediaTemperaturas = somaTemperaturas / contadorTemperaturasValidas;
        System.out.println("A média das temperaturas aferidas é: " + mediaTemperaturas + "°C");

        scanner.close();
    }
}