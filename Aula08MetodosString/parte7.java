package Aula08MetodosString;

public class parte7 {
    public static void main(String[] args) {
        String string = "O céu é azul";

        // Troca palavras da frase da var string
        System.out.println(string.replace("azul", "vermelho"));

        // Verificando se a var 'string' contem um valor específico
        System.out.println(string.contains("azul"));
    }
}
