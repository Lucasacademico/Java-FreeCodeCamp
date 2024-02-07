package Aula12Arrays;

import java.util.Arrays;

public class parte4 {
    public static void main(String[] args) {

        char vogais[] = { 'a', 'e', 'i', 'o', 'u' };

        // Alterando um valor do array 'vogais'
        vogais[2] = 'x';

        // Imprime o valor atualizado após alteração
        System.out.println(Arrays.toString(vogais));

        // Podemos aplicar o método 'lenght' na 'vogais' para verificar o tamanho do
        // array.
        System.out.println(vogais.length);
    }
}