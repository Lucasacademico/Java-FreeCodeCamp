package Aula07Strings;

public class parte7 {
    public static void main(String[] args) {
        
        String nome = "Jubileu da Silva Santos"; //%s
        String nacao = "Brasil"; //%s
        int idade = 44; //%d
        String empresa = "FreeCodeCamp"; //%s
        double mediaFaculdade = 3.8; //%f
        char sinalPercentual = '%'; //%c
        boolean ehMentira = true; //%b

        // Podemos inserir a string format direto no println
        System.out.println(String.format("Meu nome é %s. Eu so do %s. Eu tenho %d anos de idade. Eu trabalho para a empresa %s. Minha média é %f. E participo 100%c das aulas. Tudo que disse é uma mentira? %b",nome, nacao, idade, empresa, mediaFaculdade, sinalPercentual, ehMentira));
    }

}