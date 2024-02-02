package Aula08MetodosString;

public class parte5 {
    public static void main(String[] args) {

        String string1 = new String("abc");
        String string2 = new String("abc");
        String string3 = new String("ABC");

        // Maneira correta de comparar valores de dois objetos
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));

    }
}
