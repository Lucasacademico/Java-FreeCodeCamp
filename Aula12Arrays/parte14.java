package Aula12Arrays;

import java.util.Arrays;

public class parte14 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        // Criamos um intervalo de copias
        int inicioIndex = 1;
        int fimIndex = 4;

        // copiamos o intervalo com o 'copyOfRange'
        int copiaDeNumeros[] = Arrays.copyOfRange(numeros, inicioIndex, fimIndex);

        Arrays.fill(numeros, 0);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaDeNumeros));
    }
}