package Aula17HashMaps;

import java.util.HashMap;

public class parte9 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // utilizando FOREACH para imprimir 'materia' e 'nota' formatada
        notasExame.forEach((materia, nota) -> {
            System.out.println(materia + " - " + nota);
        });

    }
}
