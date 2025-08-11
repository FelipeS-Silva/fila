package fila;

public class Main {

    public static void main(String[] args) {

        // Cria fila, insere valores e tira coisa da fila
        Fila fila = new Fila();
        
        System.out.println("Inserindo valor 5 na fila");
        fila.insereNaFila(5);
        System.out.println(fila);

        System.out.println("Inserindo valor 10 na fila");
        fila.insereNaFila(10);
        System.out.println(fila);
        
        System.out.println("Inserindo valor 15 na fila");
        fila.insereNaFila(15);
        System.out.println(fila);
        
        int ultimoValor = fila.removeElementoDaFila();
        System.out.println("Removido ultimo valor da fila. Valor: " + ultimoValor);
        System.out.println(fila);

        System.out.println("Proximo valor a ser pego: " + fila.pegaValorSemRemover());
        System.out.println(fila);

    }
    
}
