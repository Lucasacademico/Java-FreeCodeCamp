package Aula16ArrayLists;
import java.util.ArrayList;

public class parte5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1); 
        numeros.add(2); 
        numeros.add(3); 
        numeros.add(4);
        numeros.add(5); 

        // Removendo todos os valores do Array
        numeros.clear();
        ;
        
        System.out.println(numeros);
    }
}
