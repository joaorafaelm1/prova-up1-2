import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int valor;

        System.out.println("Digite valores inteiros positivos (negativo para sair):");

        while (true) {
            valor = scanner.nextInt();
            if (valor < 0) {
                break;
            }
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }

        scanner.close();
    }
}