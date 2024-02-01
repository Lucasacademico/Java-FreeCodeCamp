public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
 * public: Este é um modificador de acesso. public significa que o método é
 * acessível de qualquer lugar, por outras classes, pacotes, etc.
 * 
 * static: Significa que o método pode ser chamado sem a necessidade de criar
 * uma instância da classe em que ele está definido. Isso é ideal para o método
 * main, pois ele é o ponto de entrada do programa e deve ser acessível pelo
 * runtime do Java sem a necessidade de instanciar a classe.
 * 
 * void: Este é o tipo de retorno do método. void significa que o método não
 * retorna nenhum valor.
 * 
 * main: É o nome do método. O método main é especial em Java, pois é o ponto de
 * entrada de qualquer programa Java. Quando você executa um programa Java, o
 * runtime procura por um método main para começar a execução.
 * 
 * String[] args: É a assinatura do parâmetro do método main. Ele aceita um
 * array de strings, conhecido como argumentos de linha de comando. Quando você
 * executa um programa Java a partir do terminal ou linha de comando, você pode
 * passar argumentos que serão disponibilizados para o seu programa através
 * desse array.
 * 
 * System.out.println("Hello World!");: Esta é uma chamada de método que imprime
 * a linha "Hello World!" na saída padrão (normalmente, isso é o
 * console/terminal). System.out é a saída padrão, e println é um método que
 * imprime o texto passado como argumento, seguido por uma quebra de linha.
 */