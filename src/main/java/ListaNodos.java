/**
 * Lista Enlazada
 * @author Ruben Saiz
 */

public class ListaNodos {

    private Nodo cabeza;
    private Nodo cola;
    private int length;

    public ListaNodos() {
        cabeza = null;
        cola = null;
        length = 0;
    }

    /*
     **********************************
     ****** GETTERS AND SETTERS *******
     **********************************
     */

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /*
     **********************************
     ************ METHODS *************
     **********************************
     */

    public boolean add(int valor) {
        add(getLength(), valor);
        return true;
    }

    public void add(int index, int valor) {

        if (index > getLength() || index < 0) return;

        Nodo elemento = new Nodo(valor);
        if (index == 0) agregarAlPrincipio(elemento);
        else {

            Nodo buscar = this.cabeza;
            int cont = 0;

            while (cont < (index - 1)) {
                buscar = buscar.getSiguiente();
                cont++;
            }

            elemento.setSiguiente(buscar.getSiguiente());
            buscar.setSiguiente(elemento);
        }

        setLength(getLength()+1);
    }

    private void agregarAlPrincipio(Nodo elemento) {
        Nodo aux = cabeza;
        cabeza = elemento;
        cabeza.setSiguiente(aux);
    }

    private void agregarAlFinal(Nodo elemento) {

        Nodo anterior = cabeza;
        while (anterior.getSiguiente() != null) {
            anterior = anterior.getSiguiente();
        }

        anterior.setSiguiente(elemento);
    }

    public Integer remove(Integer index) {

        Integer remove = null;
        if (isEmpty() || index == length) return null;

        if (index == 0) {
            remove = eliminarPrincipio();
        }
        else {

            int cont = 0;
            Nodo siguiente = cabeza;

            while (cont < (index - 1)) {
                siguiente = siguiente.getSiguiente();
                cont++;
            }

            remove = siguiente.getValor();
            Nodo eliminado = siguiente.getSiguiente();
            siguiente.setSiguiente(eliminado.getSiguiente());
        }

        setLength(getLength() - 1);
        return remove;
    }

    private int eliminarPrincipio() {
        int remove  = this.cabeza.getValor();
        this.cabeza = this.cabeza.getSiguiente();
        return remove;
    }

    public Integer get(int index) {
        if (index >= getLength()) return null;
        int cont = 0;
        Nodo siguiente = cabeza;
        while (cont < index) {
            siguiente = siguiente.getSiguiente();
            cont++;
        }
        return siguiente.getValor();
    }

    @Override
    public String toString() {
       String output = "[";
       Nodo puntero = cabeza;
       while (puntero != null) {
           output += String.valueOf(puntero.getValor());
           puntero = puntero.getSiguiente();
           if (puntero != null) output += ", ";
       }
       output += "]";
       return output;
    }

    public boolean isEmpty() {
        return (getLength() == 0);
    }

    public int size() {
        return getLength();
    }

    public boolean contains(int n) {

        boolean contains = false;

        Nodo siguiente = cabeza;
        do {
            if (siguiente.getValor() == n) contains = true;
            siguiente = siguiente.getSiguiente();
        } while (!contains && siguiente.getSiguiente() != null);

        return contains;
    }

    public void clear() {
        this.cabeza.setSiguiente(null);
        this.cabeza.setValor(null);
        setLength(0);
    }

}
