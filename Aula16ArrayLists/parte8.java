package Aula16ArrayLists;

import java.util.ArrayList;
import java.util.Comparator; // Importando biblioteca 'Comparator' para uso do métodos de ordenação

public class parte8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);

        // Metodo da biblioteca 'Comparator' para ordenação natural.
        numeros.sort(Comparator.naturalOrder());

        System.out.println(numeros);
    }
}
