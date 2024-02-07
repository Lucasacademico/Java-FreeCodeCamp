package Aula12Arrays;

import java.util.Arrays;

public class parte11 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        int copiaDeNumeros[] = numeros;

        // Se após copiarmos o valor, e alterarmos os valores do array original...
        //... a copia também será alterada.
        Arrays.fill(numeros, 0);

        // Imprimindo o 'numeros' e o 'copiaDeNumeros'
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaDeNumeros));
    }
}
