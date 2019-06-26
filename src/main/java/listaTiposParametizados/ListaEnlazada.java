package listaTiposParametizados;

public class ListaEnlazada {

    public static void main(String[] args) {

        MiLista<String> lista = new MiLista<>();
        MiLista<Integer> edades = new MiLista<>();
        String[] names = {"Ruben", "Paula", "Pedro", "Juan"};
        Integer[] numeros = {10, 20, 30, 40, 50, 60};

        System.out.println((lista.isEmpty()) ? "La lista esta vacia" : "La lista no esta vacia");

        for (String name : names) {
            lista.add( name );
        }

        for (Integer edad : numeros) {
            edades.add( edad );
        }

        System.out.println( lista + "\n" + lista.size());
        System.out.println( edades + "\n" + edades.size());

        lista.remove("Juan");
        edades.remove(Integer.valueOf(60));

        System.out.println( lista + "\n" + lista.size());
        System.out.println( edades + "\n" + edades.size());

    }

}
