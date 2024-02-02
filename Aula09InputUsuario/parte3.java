package Aula09InputUsuario;

import java.util.Scanner;

public class parte3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        // Aqui aprendemos o uso do 'printf' o melhor metodo pra imprimir strings com
        // valores de variaveis(minha opnião)
        System.out.printf("Olá %s, seja bem vindo", nome);

        scanner.close();
    }
}
