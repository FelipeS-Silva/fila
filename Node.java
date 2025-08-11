package fila;

public class Node {

    private int valor;
    private Node node;

    public Node(int valor) {
        this.valor = valor;
        this.node = null;
    }

    public Node(int valor, Node node) {
        this.valor = valor;
        this.node = node;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
    
}
