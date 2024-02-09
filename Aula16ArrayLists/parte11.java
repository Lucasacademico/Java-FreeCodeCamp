package Aula16ArrayLists;

import java.util.ArrayList;
import java.util.Comparator; // Importando biblioteca 'Comparator' para uso do métodos de ordenação

public class parte11 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);

        System.out.println("Antes: " + numeros.toString());

        numeros.forEach(numero -> {
            numeros.set(numeros.indexOf(numeros), numero * 2);
        });

        System.out.println("Depois: " + numeros.toString());
    }
}
