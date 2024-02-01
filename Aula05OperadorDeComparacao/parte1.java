package Aula05OperadorDeComparacao;

public class parte1 {
    public static void main(String[] args) {

        // Operadores de comparação retornam valor booleano
        int numero1 = 12;
        int numero2 = 15;

        // Verificando se valores são IGUAIS '=='
        System.out.println(numero1 + " é igual a " + numero2 + "? " + (numero1 == numero2));

        // Verificando se valores são DIFERENTES '!='
        System.out.println(numero1 + " é diferente de " + numero2 + "? " + (numero1 != numero2));

        // Verificando se um valor é MAIOR que outro '>'
        System.out.println(numero1 + " é maior que " + numero2 + "? " + (numero1 > numero2));

        // Verificando se um valor é MENOR que outro '<'
        System.out.println(numero1 + " é menor que " + numero2 + "? " + (numero1 < numero2));

        // Verificando e um valor é MAIOR IGUAL que outro '>='
        System.out.println(numero1 + " é maior igual que " + numero2 + "? " + (numero1 >= numero2));

        // Verificando e um valor é MENOR IGUAL que outro '<='
        System.out.println(numero1 + " é menor igual que " + numero2 + "? " + (numero1 <= numero2));
    }
}
