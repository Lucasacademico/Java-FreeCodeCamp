package Aula17HashMaps;

import java.util.HashMap;

public class parte7 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Verifica se no hashmap existe um valor conforme especificado. Retorno em
        // bool.
        System.out.println(notasExame.containsValue(69));

        // Outra maneira de verificar valores
        System.out.println(notasExame.containsValue(Integer.valueOf(70)));

    }
}
