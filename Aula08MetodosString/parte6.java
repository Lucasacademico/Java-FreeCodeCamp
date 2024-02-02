package Aula08MetodosString;

public class parte6 {
    public static void main(String[] args) {
        String string1 = new String("abc");
        String string2 = new String("ABC");

        //Verifica strings de objetos sem verificar tamanho 
        System.out.println(string1.equalsIgnoreCase(string2));
    }
}
