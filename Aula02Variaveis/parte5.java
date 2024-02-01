package Aula02Variaveis;

class parte5 {

    // Declarando a variavel 'idade' fora do método main esta variavel pode ser utilizada dentro de TODA a classe, coisa esta que só funcionava dentro do método 'main'
    static int idade = 22;

    public static void main(String[] args) {
        System.out.println("Eu tenho " + idade + " de idade");
    }
}
