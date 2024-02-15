package Aula17HashMaps;

import java.util.HashMap;

public class parte3 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Método altera um valor existente para outro valor
        notasExame.replace("Matemática", 70);

        System.out.println(notasExame.toString());
        System.out.println(notasExame.get("Matemática"));

    }
}
