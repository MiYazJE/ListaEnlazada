/**
 * @author Rubén Saiz
 */
package listaTiposParametizados;

class Node<T> {

    T valor;
    Node siguiente;
    Node anterior;

    public Node(T valor, Node next, Node previous) {
        this.valor = valor;
        siguiente = next;
        anterior  = previous;
    }

}
