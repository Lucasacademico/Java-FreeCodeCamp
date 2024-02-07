package Aula12Arrays;

import java.util.Arrays;

public class parte10 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        int copiaDeNumeros[] = numeros;

        // Imprimindo o 'numeros' e o 'copiaDeNumeros'
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaDeNumeros));
    }
}
