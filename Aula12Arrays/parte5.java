package Aula12Arrays;

import java.util.Arrays;

public class parte5 {
    public static void main(String[] args) {

        // alterando a ordem do array
        char vogais[] = { 'u', 'a', 'o', 'i', 'e' };

        // Invocando o metodo 'sort' para organizar ordem do array
        Arrays.sort(vogais);

        System.out.println(Arrays.toString(vogais));
    }
}