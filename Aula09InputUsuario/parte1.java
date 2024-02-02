package Aula09InputUsuario;

// Importa a classe Scanner do pacote java.util para permitir a leitura de entrada do usuário.
import java.util.Scanner;

public class parte1 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário a partir do console.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine(); // Lê uma linha de texto da entrada do usuário e a armazena na variável 'nome'.

        System.out.println(nome);

        scanner.close(); // Fecha o scanner, liberando os recursos de entrada que ele estava utilizando.

    }
}
