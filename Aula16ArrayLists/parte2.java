package Aula16ArrayLists;

import java.util.ArrayList;

public class parte2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // O método 'add()' adiciona os elementos ao 'ArrayList', inserindo um novo
        // elemento ao final da lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Imprimindo os elementos da 'ArrayList' em formato string
        System.out.println(numeros.toString());
    }
}
