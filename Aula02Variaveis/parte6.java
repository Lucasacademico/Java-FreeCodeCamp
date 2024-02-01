package Aula02Variaveis;

class parte6 {

    // Se não atribuirmos valores para esta var estatica fora do metodo main, o
    // valor será 0, e não ocorrerá erro.
    static int idade;

    public static void main(String[] args) {
        System.out.println("Eu tenho " + idade + " de idade");
    }
}