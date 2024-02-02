package Aula09InputUsuario;

import java.util.Scanner;

public class parte5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.printf("Olá %s, seja bem vindo, qual sua idade? ", nome);
        int idade = scanner.nextInt();

        /*
         * existe uma armadilha comum ao misturar scanner.nextInt() e scanner.nextLine()
         * que mencionei anteriormente. Após scanner.nextInt() consumir o inteiro, ele
         * deixa o caractere de nova linha (gerado quando o usuário pressiona enter) no
         * buffer de entrada. Quando scanner.nextLine() é chamado em seguida, ele
         * consome o caractere de nova linha restante e continua, o que pode não ser o
         * comportamento esperado, pois não permite que o usuário insira a linguagem de
         * programação preferida.
         */
        System.out.printf("%d é uma idade excelente pra aprender programação!, que linguagem você prefere? ", idade);
        String linguagem = scanner.nextLine();

        System.out.printf("%s é uma linguagem de programação muito popular!", linguagem);

        scanner.close();

    }
}
