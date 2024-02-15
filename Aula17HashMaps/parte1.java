package Aula17HashMaps;

// * Importa a classe HashMap da biblioteca java.util. HashMap é uma estrutura de dados que armazena pares de chave-valor. É útil quando queremos acessar rapidamente os elementos através de suas chaves. Cada chave é única no mapa.
import java.util.HashMap;

public class parte1 {
    public static void main(String[] args) {
        // * Cria um objeto HashMap chamado notasExame, onde cada chave é uma String e
        // cada valor associado é um Integer. Aqui, você pode armazenar, por exemplo, o
        // nome de um aluno como chave e sua nota de exame como valor.
        HashMap<String, Integer> notasExame = new HashMap<String, Integer>();

        // Notas do exame ("matéria", nota)
        notasExame.put("Matemática", 85);
        notasExame.put("Sociologia", 78);
        notasExame.put("Português", 69);
        notasExame.put("Computação", 95);
        notasExame.put("Geografia", 70);

        // Imprimindo todos os Hashmaps
        System.out.println(notasExame.toString());

        // Imprimindo uma nota pelo valor de sua chave(matéria)
        System.out.println(notasExame.get("Computação"));


    }
}
