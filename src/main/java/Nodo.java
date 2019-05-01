/**
 * Nodo
 * @author Ruben Saiz
 */

public class Nodo {

    private Nodo referencia;
    private Integer valor;

    public Nodo() {
        this(null, null);
    }

    public Nodo(Integer valor) {
        this(valor, null);
    }

    public Nodo(Integer valor, Nodo referencia) {
        this.valor = valor;
        this.referencia = referencia;
    }

    /*
                **********************************
                ****** GETTERS AND SETTERS *******
                **********************************
     */

    public Nodo getSiguiente() {
        return referencia;
    }

    public void setSiguiente(Nodo referencia) {
        this.referencia = referencia;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    /*
     **********************************
     ************ METHODS *************
     **********************************
     */

    @Override
    public String toString() {
        return String.format("[Valor = %d, referencia = %s]", valor, referencia);
    }
}
