package Aula11SwitchCase;

import java.util.Scanner;

public class parte1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Insira o segundo valor: ");
        double numero2 = scanner.nextDouble();

        // Consumindo o fim de linha que resta após o último nextDouble()
        scanner.nextLine();

        System.out.print("Que operação você deseja realizar? ");
        String operacao = scanner.nextLine();

        // Condicional Switch Case
        switch (operacao) {
            case "soma":
                System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
                break; // Adicionando break para evitar a execução do default após este caso

            case "sub":
                System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
                break;

            case "mult":
                System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
                break;

            case "div":
                if (numero2 == 0) {
                    System.out.println("Não pode ser dividido por zero");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
                }
                break;

            default:
                System.out.printf("\"%s\" não é uma operação suportada!\n", operacao);
        }

        scanner.close();
    }
}
