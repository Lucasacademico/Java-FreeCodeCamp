package Aula12Arrays;

import java.util.Arrays;

public class parte6 {
    public static void main(String[] args) {

        // alterando a ordem do array
        char vogais[] = { 'a', 'i', 'e', 'o', 'u' };

        int indexInicio = 1;
        int indexFim = 4;

        // Organiza as vogais de index 1 2 e 3 (4 e 0 não incluidos)
        Arrays.sort(vogais, indexInicio, indexFim);

        System.out.println(Arrays.toString(vogais));
    }
}