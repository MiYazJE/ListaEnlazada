import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * ListaNodos Tester.
 *
 * @author <Authors name>
 * @since <pre>may 1, 2019</pre>
 * @version 1.0
 */
public class ListaNodosTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {

    }

    /**
     *
     * Method: remove(Integer index)
     *
     */
    @Test
    public void testRemove() throws Exception {
        // TODO

    }

    /**
     *
     * Method: get(int index)
     *
     */
    @Test
    public void testGet() throws Exception {

        ListaNodos lista = new ListaNodos();
        int get;

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
            get = lista.get(i-1);
            Assert.assertEquals(i, get);
        }

    }

    /**
     *
     * Method: isEmpty()
     *
     */
    @Test
    public void testIsEmpty() throws Exception {
//TODO: Test goes here... 
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
     * Method: get()
     *
     */
    @Test
    public void testContains() throws Exception {
        ListaNodos lista = new ListaNodos();
        for (int i = 0; i < 10; i++) lista.add(i);
        boolean test = lista.contains(5);
        Assert.assertTrue(test);
        test = lista.contains(20);
        Assert.assertFalse(test);
    }

    /**
     *
     * Method: clear()
     *
     */
    @Test
    public void clear() throws Exception {
        ListaNodos lista = new ListaNodos();
        for (int i = 0; i < 10; i++) lista.add(i);
        lista.clear();
        int size = lista.size();
        Assert.assertEquals(0, size);
    }

    /**
     *
     * Method: add()
     *
     */
    @Test
    public void add() throws Exception {
        ListaNodos lista = new ListaNodos();
        for (int i = 0; i < 1000000; i++) {
            lista.add(i, i);
        }
    }

}
