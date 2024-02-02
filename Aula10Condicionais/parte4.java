package Aula10Condicionais;

import java.util.Scanner;

public class parte4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a operação que você quer realizar? ");
        String operacao = scanner.nextLine();

        // Melhorando o código com condicional DENTRO de condicional
        if (operacao.equals("soma")) {
            System.out.printf("%f + %f = %f", numero1, numero2, numero1 + numero2);
        } else if (operacao.equals("sub")) {
            System.out.printf("%f - %f = %f", numero1, numero2, numero1 - numero2);
        } else if (operacao.equals("mult")) {
            System.out.printf("%f * %f = %f", numero1, numero2, numero1 * numero2);
        } else if (operacao.equals("div")) {
            if (numero2 == 0) {
                System.out.println("Não pode ser dividido por 0");
            } else {
                System.out.printf("%f / %f = %f", numero1, numero2, numero1 / numero2);
            }
        } else {
            System.out.printf("%s não é uma operação suportada!", operacao);
        }

        scanner.close();
    }
}
