package Aula17HashMaps;

import java.util.HashMap;

public class parte10 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Para cada nota, diminua 10 pontos, usando o FOREACH
        notasExame.forEach((materia, nota) -> {
            notasExame.replace(materia, nota - 10);
        });

        // Imprimindo as notas atualizadas com -10 pontos usando o FOREACH
        notasExame.forEach((materia, nota) -> {
            System.out.println(materia + " - " + nota);
        });

    }
}
