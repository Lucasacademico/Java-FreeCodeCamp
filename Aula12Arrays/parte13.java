package Aula12Arrays;

import java.util.Arrays;

public class parte13 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        // Copia os arrays originais, e insere o restante até 0 de acordo com o tamanho
        // extra.
        // Obs: se diminuirmos para um tamanho menor, copia só oq der.
        int copiaDeNumeros[] = Arrays.copyOf(numeros, 10);

        Arrays.fill(numeros, 0);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaDeNumeros));
    }
}
