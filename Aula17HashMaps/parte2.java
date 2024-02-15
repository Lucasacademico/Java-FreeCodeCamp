package Aula17HashMaps;

import java.util.HashMap;

public class parte2 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Tenta adicionar uma nota para "Matemática" apenas se ainda não existir uma
        // nota para essa disciplina.
        // Como já existe uma nota para "Matemática", essa operação não altera o
        // HashMap.
        notasExame.putIfAbsent("Matemática", 70);

        // Recupera e imprime a nota associada à disciplina "Matemática".
        // Como o valor não foi alterado pelo putIfAbsent (devido à existência prévia),
        // o valor impresso será 85.
        System.out.println(notasExame.get("Matemática"));

    }
}
