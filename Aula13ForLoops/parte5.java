package Aula13ForLoops;

public class parte5 {
    public static void main(String[] args) {

        // Usando dois FOR para criar iteração de valores das tabuadas de 1 à 10
        // Também cria maior qualidade no código

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
