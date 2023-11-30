import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao estacionamento!");

        System.out.print("Quantos carros você deseja estacionar? ");
        int quantidadeCarros = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.print("Digite o modelo do carro " + (i + 1) + ": ");
            String modelo = scanner.nextLine();
            System.out.print("Digite a placa do carro " + (i + 1) + ": ");
            String placa = scanner.nextLine();

            Carro carro = new Carro(modelo, placa);
            System.out.println("Carro estacionado: " + carro.getModelo() + " - " + carro.getPlaca());
        }

        scanner.close();
    }
}
