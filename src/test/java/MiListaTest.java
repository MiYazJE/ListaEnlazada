import listaTiposParametizados.MiLista;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/** 
* MiLista Tester. 
* 
* @author <Authors name> 
* @since <pre>jun 26, 2019</pre> 
* @version 1.0 
*/ 
public class MiListaTest { 

    Character[] caracteres;
    MiLista<Character> miLista;
    MiLista<Integer> enteros;

    @Before
    public void before() throws Exception {
        caracteres = new Character[255];
        miLista = new MiLista<>();
        enteros = new MiLista<>();
        for (int i = 0; i < 255; i++) {
            caracteres[i] = (char) i;
        }
    }

    @After
    public void after() throws Exception {

    }

    /**
    *
    * Method: add(T value)
    *
    */
    @Test
    public void testAdd() {

    }

    /**
    *
    * Method: get(int pos)
    *
    */
    @Test
    public void testGet() throws Exception {
        for (int i = 0; i < miLista.size(); i++) {
            Assert.assertEquals(caracteres[i], miLista.get(i));
        }
    }

    /**
    *
    * Method: size()
    *
    */
    @Test
    public void testSize() throws Exception {
    //TODO: Test goes here...
    }

    /**
    *
    * Method: isEmpty()
    *
    */
    @Test
    public void testIsEmpty() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {
        ArrayList<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 1; i <= 5; i++) enteros.add(i);

        int i = 0;
        Random r = new Random();
        while (i < 2) {
            int x = r.nextInt(enteros.size());
            int eliminado1 = listaEnteros.remove(x);
            int eliminado2 = enteros.remove(x);
            i++;
            Assert.assertEquals(eliminado1, eliminado2);
        }

        Assert.assertEquals(listaEnteros.size(), enteros.size());
        for (i = 0; i < enteros.size(); i++) {
            Assert.assertEquals(listaEnteros.get(i), enteros.get(i));
        }

    }

    @Test
    public void testContains() {

        MiLista<Integer> enteros = new MiLista<>();
        for (int i = 1; i <= 10; i++) {
            enteros.add(i);
            Assert.assertTrue(enteros.contains(i));
        }

    }

}
