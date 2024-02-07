package Aula12Arrays;

import java.util.Arrays;

public class parte2 {
    public static void main(String[] args) {
        // Declaração de char com tamanho 5
        char vogais[] = new char[5];

        // a e i o u
        vogais[0] = 'a';
        vogais[1] = 'e';
        vogais[2] = 'i';
        vogais[3] = 'o';
        vogais[4] = 'u';
        // Obs: Se tentarmos adicionais mais um char, ocorrerá erro, pois o tamanho do
        // char é de 5, logo precisamos aumentar também a declaração do char 'vogais'.

        // Imprime todas as vogais em um array único
        System.out.println(Arrays.toString(vogais));
    }
}
