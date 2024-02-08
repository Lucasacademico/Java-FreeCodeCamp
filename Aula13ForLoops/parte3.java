package Aula13ForLoops;

public class parte3 {
    public static void main(String[] args) {
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int soma = 0;

        // Dentro do FOR estamos somando todos os valores do loop
        for (int index = 0; index < numeros.length; index++) {
            soma += numeros[index];
        }

        // Imprimindo os valores somados
        System.out.println(soma);
    }
}
