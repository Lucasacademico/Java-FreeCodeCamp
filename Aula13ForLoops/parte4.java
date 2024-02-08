package Aula13ForLoops;

public class parte4 {
    public static void main(String[] args) {
        int numero = 5;

        // Tabuada do 5 com o FOR
        for (int mulplicador = 1; mulplicador < 10; mulplicador++) {
            System.out.printf("%d * %d = %d\n", numero, mulplicador, numero * mulplicador);
        }
    }
}
