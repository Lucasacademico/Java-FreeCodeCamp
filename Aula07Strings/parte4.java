package Aula07Strings;

public class parte4 {
    public static void main(String[] args) {

        String stringLiteral = "abc";
        String stringLiteral2 = "abc";

        String objetoString = new String("xyz");
        String objetoString2 = new String("xyz");

        System.out.println(stringLiteral == stringLiteral2);
        System.out.println(objetoString == objetoString2);
    }
}
