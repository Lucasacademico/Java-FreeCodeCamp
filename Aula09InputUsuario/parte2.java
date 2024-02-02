package Aula09InputUsuario;

import java.util.Scanner;

public class parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usando 'print' em vez de 'println' faz com que receba o input na mesma linha
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println(String.format("Olá %s, seja bem vindo!", nome));

        scanner.close();

    }
}
