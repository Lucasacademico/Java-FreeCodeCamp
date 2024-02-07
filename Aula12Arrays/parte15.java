package Aula12Arrays;

import java.util.Arrays;

public class parte15 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        // copiamos o intervalo com o 'copyOfRange'
        int copiaDeNumeros[] = Arrays.copyOf(numeros, numeros.length);

        // Verificando se o 'numeros' e 'copiaDeNumeros' são a mesma coisa
        System.out.println(numeros == copiaDeNumeros);
    }
}