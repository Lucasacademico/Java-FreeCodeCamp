package Aula09InputUsuario;

import java.util.Scanner;

public class parte7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.printf("Olá %s, seja bem vindo, qual sua idade? ", nome);

        // Lê a entrada da idade como uma linha de texto e converte para inteiro
        // Esse modo resolve o problema de 'nextInt' e 'nextLine'
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d é uma idade excelente pra aprender programação!, que linguagem você prefere? ", idade);
        String linguagem = scanner.nextLine();

        System.out.printf("%s é uma linguagem de programação muito popular!", linguagem);

        scanner.close();
    }
}
