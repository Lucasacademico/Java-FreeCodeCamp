package Aula17HashMaps;

import java.util.HashMap;

public class parte4 {
    public static void main(String[] args) {
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Se a chave "Geografia" estiver presente no HashMap notasExame, o método retorna o valor associado a essa chave. Caso contrário, retorna o valor padrão especificado, que é -1 neste contexto. 
        System.out.println(notasExame.getOrDefault("Geografia", -1));
    }
}
