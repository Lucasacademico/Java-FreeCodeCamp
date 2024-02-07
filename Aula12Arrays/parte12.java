package Aula12Arrays;

import java.util.Arrays;

public class parte12 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        // Outra maneira de copiar usando o método array 'copyOf'
        int copiaDeNumeros[] = Arrays.copyOf(numeros, numeros.length);

        Arrays.fill(numeros, 0);

        // Imprimindo o 'numeros' e o 'copiaDeNumeros'
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaDeNumeros));
    }
}
