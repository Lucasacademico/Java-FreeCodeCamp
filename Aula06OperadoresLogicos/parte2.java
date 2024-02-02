package Aula06OperadoresLogicos;

public class parte2 {
    public static void main(String[] args) {

        // Utilizando operador lógico ||(OR)
        // Pra este exemplo, criei duas variaveis booleanas
        boolean ehEstudante = false;
        boolean ehMembroLivraria = true;

        // o OR basta um dos valores ser TRUE para retornar TRUE
        // Se ambos forem FALSE, o retorno sera FALSE
        System.out.println(ehEstudante || ehMembroLivraria);
    }
}
