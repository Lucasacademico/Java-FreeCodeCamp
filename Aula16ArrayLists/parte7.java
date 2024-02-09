package Aula16ArrayLists;

import java.util.ArrayList;

public class parte7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // valores alterados para fora de ordem
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);

        // Ordena os valores do array por ordem crescente
        numeros.sort(null);

        System.out.println(numeros);
    }
}
