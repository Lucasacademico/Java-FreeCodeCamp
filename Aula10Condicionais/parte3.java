package Aula10Condicionais;

import java.util.Scanner;

public class parte3 {
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

        // Inserido ELSEIF para outras operações
        if (operacao.equals("soma")) {
            System.out.printf("%f + %f = %f", numero1, numero2, numero1 + numero2);
        } else if (operacao.equals("sub")) {
            System.out.printf("%f - %f = %f", numero1, numero2, numero1 - numero2);
        } else if (operacao.equals("mult")) {
            System.out.printf("%f * %f = %f", numero1, numero2, numero1 * numero2);
        } else if (operacao.equals("div")) {
            System.out.printf("%f / %f = %f", numero1, numero2, numero1 / numero2);
        } else {
            System.out.printf("%s não é uma operação suportada!", operacao);
        }

        scanner.close();
    }
}
