package Aula17HashMaps;

import java.util.HashMap;

public class parte6 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Remove um valor de hashmap conforme especificado
        notasExame.remove("Geografia");

        System.out.println(notasExame.toString());
    }
}
