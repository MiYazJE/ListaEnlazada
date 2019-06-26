import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        //System.out.println(lista.remove(0));

        ListaNodos listaEnlazada = new ListaNodos();
        for (int i = 1; i <= 1000000; i++) {
            lista.add((i-1), i);
            listaEnlazada.add((i-1), i);
        }

        /*System.out.println(lista.remove(2));
        System.out.println(listaEnlazada.remove(2));*/
        System.out.println(lista);
        lista.add(2, -1);
        System.out.println(lista);
        System.out.println(listaEnlazada);
        listaEnlazada.add(2, -1);
        System.out.println(listaEnlazada);

        /* TEST ADD
        System.out.println(lista);
        System.out.println(listaEnlazada);

        lista.add(-1);
        listaEnlazada.add(-1);
        System.out.println(lista);
        System.out.println(listaEnlazada);
        */

        /*   TES REMOVE
        int len = lista.size();
        for (int i = 0; i < len; i++) System.out.print(lista.remove(0) + " ");
        System.out.println("");
        len = listaEnlazada.size();
        for (int i = 0; i < len; i++) System.out.print(listaEnlazada.remove(0) + " ");
        */



        /*while (!listaEnlazada.isEmpty()) {
            System.out.println(listaEnlazada.remove(listaEnlazada.size() - 1));
        }*/

    }

}
