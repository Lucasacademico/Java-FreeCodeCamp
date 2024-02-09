package Aula16ArrayLists;

import java.util.ArrayList;

public class parte3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1); // index 0
        numeros.add(2); // index 1
        numeros.add(3); // index 2
        numeros.add(4); // index 3
        numeros.add(5); // index 4

        // Printando os valores por INDEX
        System.out.println(numeros.get(2));// valor 3

        // Removendo um numero por INDEX
        numeros.remove(3); // valor 4

        // Imprimindo os valores do array após removido o valor do INDEX 3
        System.out.println(numeros); 

    }
}
