package Aula13ForLoops;

public class parte8 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5 };

        int soma = 0;

        // Criamos uma soma usando o FOR EACH
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println(soma);
    }
}
