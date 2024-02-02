package Aula09InputUsuario;

import java.util.Scanner;

public class parte4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.printf("Olá %s, seja bem vindo, qual sua idade? ", nome);
        // Lê o próximo inteiro da entrada do usuário e armazena na variável 'idade'.
        // nextInt: Consume o restante da linha incluindo o caractere de nova linha.
        int idade = scanner.nextInt();

        System.out.printf("%d é uma idade excelente pra aprender programação!", idade);

        scanner.close();
    }
}