package Aula16ArrayLists;

import java.util.ArrayList;
import java.util.Comparator; // Importando biblioteca 'Comparator' para uso do métodos de ordenação

public class parte9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);

        // Metodo da biblioteca 'Comparator' para ordenação revertida.
        numeros.sort(Comparator.reverseOrder());

        // Aproveitando podemos ver o tamanho do Array list
        System.out.println(numeros.size());

        System.out.println(numeros);
    }
}
