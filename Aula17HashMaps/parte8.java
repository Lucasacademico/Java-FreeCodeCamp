package Aula17HashMaps;

import java.util.HashMap;

public class parte8 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Verifica se o hashmap esta vazio. retorno em bool
        System.out.println(notasExame.isEmpty());

        // Realizando clear e verificiando novamente.
        notasExame.clear();
        System.out.println(notasExame.isEmpty());

    }
}
