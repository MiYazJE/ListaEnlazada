/**
 * @author Rubén Saiz
 */
package listaTiposParametizados;

/**
 * @author Rubén Saiz
 */

public class MiLista<T> {

    Node ini;
    Node fin;
    int length;

    public MiLista() {
        this.fin = null;
        this.length = 0;
    }

    public void add(T value) {
        if (ini == null) {
            addBegin( value );
        }
        else {
            addToTop( value );
        }
        length++;
    }

    private void addBegin(T value) {
        ini = new Node(value, null, null);
        fin = ini;
    }

    private void addToTop(T value) {
        if (fin == null) {
            fin = new Node(value, null, ini);
            ini.siguiente = fin;
        }
        else {
            Node aux = new Node(value, null, fin);
            fin.siguiente = aux;
            fin = aux;
        }
    }

    public T remove(T valor) {
        if (isEmpty()) return null;
        Node next = ini;
        while (next != null) {
            if (valor == next.valor) {
                remove(next);
                length--;
                break;
            }
            next = next.siguiente;
        }
        return (T) next.valor;
    }

    public T remove(int pos) {
        if (isEmpty() || pos >= length) return null;
        int i = 0;
        Node next = ini;
        while (next != null) {
            if (i == pos) {
                remove(next);
                length--;
                break;
            }
            next = next.siguiente;
            i++;
        }
        return (T) next.valor;
    }

    private void remove(Node eliminar) {
        // ELIMINAR INTERMEDIO
        if (eliminar.anterior != null && eliminar.siguiente != null) {
            eliminar.anterior.siguiente = eliminar.siguiente;
            eliminar.siguiente.anterior = eliminar.anterior;
        }
        else if (eliminar.siguiente == null) { // ELIMINAR FINAL
            eliminar.anterior.siguiente = null;
            fin = eliminar.anterior;
        }
        else { // ELIMINAR PRINCIPIO
            eliminar.siguiente.anterior = null;
            ini = eliminar.siguiente;
        }
        clearNode( eliminar );
    }

    public void clear() {
        this.ini = null;
        this.fin = null;
        this.length = 0;
    }

    public T get(int pos) {
        if (isEmpty() || pos >= length) return null;
        Node next = ini;
        int i = 0;
        while (next != null) {
            if (i == pos) return (T) next.valor;
            next = next.siguiente;
            i++;
        }
        return null;
    }

    private void clearNode(Node node) {
        node.siguiente = null;
        node.anterior  = null;
    }

    public int size() {
        return this.length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean contains(T valor) {
        Node next = ini;
        while (next != null) {
            if (next.valor == valor) return true;
            next = next.siguiente;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        Node next = ini;
        while (next != null) {
            output.append(next.valor);
            next = next.siguiente;
            if (next != null) output.append(", ");
        }
        return output.append("]").toString();
    }

}
