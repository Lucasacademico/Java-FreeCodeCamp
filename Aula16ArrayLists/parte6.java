package Aula16ArrayLists;

import java.util.ArrayList;

public class parte6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Adicionando o valor 30 no index 2 dentro do ArrayList
        // Obs: troca o valor anterior por esse.
        numeros.set(2, Integer.valueOf(30));
        ;

        System.out.println(numeros);
    }
}
