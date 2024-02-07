package Aula12Arrays;

import java.util.Arrays;

public class parte9 {
    public static void main(String[] args) {

        // alterando a ordem do array
        char vogais[] = { 'u', 'i', 'e', 'o', 'a' };

        int indexInicio = 1;
        int indexFim = 4;

        // Método altera os valores 1, 2 e 3 para 'x'
        Arrays.fill(vogais, indexInicio, indexFim, 'x');

        System.out.println(Arrays.toString(vogais));

    }
}