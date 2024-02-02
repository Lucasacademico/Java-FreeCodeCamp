package Aula10Condicionais;

import java.util.Scanner;

public class parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de condicional com calculadora

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a operação que você quer realizar? ");
        String operacao = scanner.nextLine();

        // Se digitarmos 'soma' será realizado a soma dos numeros
        if (operacao.equals("soma")) {
            System.out.printf("%f + %f = %f", numero1, numero2, numero1 + numero2);
        }

        scanner.close();
    }
}
