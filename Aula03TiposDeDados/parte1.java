package Aula03TiposDeDados;

public class parte1 {

    public static void main(String[] args) {

        // Tipos inteiros
        byte umUnicoByte = 100; // -128 até 127
        short umNumeroPequeno = 20000; // -32768 até 32767
        int umInteiro = 2147483647; // -2147483648 até 2147483647
        long umNumeroGrande = 9223372036854775807L; // -9223372036854775808 até 9223372036854775807
        // O 'L' no final do número 9223372036854775807L é usado para indicar
        // explicitamente que o valor é do tipo long

        // Tipos decimais
        double umDouble = 1.79769313; // 4.9E-324 até 1.7976931348623157E308
        float umFloat = 3.4028F; // 1.4E-45 até 3.4028235E38

        // Tipos Booleanos
        boolean ehFolga = false;
        boolean ehTrabalho = true;

        // Tipos caracteres
        char simboloCopyright = '\u00A9';
        System.out.println("Esse é o simbolo de copyright: " + simboloCopyright);

    }

}
