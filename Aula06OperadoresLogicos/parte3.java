package Aula06OperadoresLogicos;

public class parte3 {
    public static void main(String[] args) {

        // Operador NOT(!var) nega o resultado alterado ele
        // Se for TRUE vira FALSE, Se for FALSE vira TRUE
        boolean ehEstudante = false;
        boolean ehMembroLivraria = false;

        // A '!' antes da variavel é o NOT
        System.out.println(!ehEstudante || ehMembroLivraria);
    }
}
