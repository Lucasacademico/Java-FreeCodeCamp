package Aula16ArrayLists;

import java.util.ArrayList;
import java.util.Comparator; // Importando biblioteca 'Comparator' para uso do métodos de ordenação

public class parte10 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);

    
        // Multiplicando os valores do arraylist por 2
        //
        numeros.forEach(numero -> {
            System.out.println(numero * 2);
        });

        System.out.println(numeros.toString());

    }
}
