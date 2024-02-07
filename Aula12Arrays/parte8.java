package Aula12Arrays;

import java.util.Arrays;

public class parte8 {
    public static void main(String[] args) {

        // alterando a ordem do array
        char vogais[] = { 'u', 'i', 'e', 'o', 'a' };

        Arrays.sort(vogais);

        int indexInicio = 1;
        int indexFim = 4;

        // Queremos encontrar o 'o' no array 'vogais'
        char key = 'o';

        // Criamos variavel para encontrar a 'key' no array 'vogais'
        int encontrarItemIndex = Arrays.binarySearch(vogais, indexInicio, indexFim, key);

        System.out.println(Arrays.toString(vogais));
        System.out.println(encontrarItemIndex);
    }
}