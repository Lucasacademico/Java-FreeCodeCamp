package Aula15DoWhileLoop;

public class parte1 {
    public static void main(String[] args) {
        int numero = 5;
        int multiplicador = 1;

        // Esse é um exemplo básico de doWhile
        // diferente do WHILE o DOWHILE primeiro executa a tarefa, e depois verifica a condicão.
        // Na lógica, seria como: "Faça o calculo, incremente+1, e verifique se o multiplic"
        do{
            System.out.printf("%d x %d = %d\n", numero, multiplicador, numero*multiplicador);
            multiplicador++;
        } while(multiplicador <= 10);
    }
}
