package Aula08MetodosString;

public class parte4 {
    public static void main(String[] args) {

        // Aqui verificaremos se dois objetos com o mesmo valor porém diferentes pois
        // possuem nomes de variaveis diferentes
        String string1 = new String("abc");
        String string2 = new String("abc");

        // Verificando se são iguais
        // Esse método retorna FALSE, pois não é a maneira correta de verificar valores de dois objetos
        System.out.println(string1 == string2);

    }
}
