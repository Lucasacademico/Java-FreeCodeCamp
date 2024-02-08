package Aula14WhileLoops;

public class parte1 {
    public static void main(String[] args) {
        // Exemplo básico de Loop While
        int numero = 5;
        int multiplicador = 1;

        // Loop While criado para iterar valores do multiplicado de 1 até 10
        // Dentro do loop while, inserimos um incrementador no final para ir para o próximo valor, até chegar em 10
        // Seria como: "Enquanto multiplicador <= 10, faça calculo, e incremente +1 até chegar em 10 "
        while(multiplicador <= 10){
            System.out.printf("%d x %d = %d\n", numero, multiplicador, numero * multiplicador);
            
            multiplicador++;
        }
    }
}
