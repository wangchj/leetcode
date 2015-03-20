import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class LRUCacheTest {
    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() {
    }


    /** A test that always fails. **/
    @Test public void test1() {
        LRUCache cache = new LRUCache(1);
        cache.set(2, 1);
        Assert.assertEquals(1, cache.get(2));
        cache.set(3, 2);
        Assert.assertEquals(-1, cache.get(2));
        Assert.assertEquals(2, cache.get(3));
    }
    
    @Test public void test2() {
        LRUCache cache = new LRUCache(2);
        cache.set(2, 1);
        cache.set(1, 1);
        cache.set(2, 3);
        cache.set(4, 1);
        Assert.assertEquals(-1, cache.get(1));
        Assert.assertEquals(3, cache.get(2));
    }
    
    @Test public void test3() {
        LRUCache cache = new LRUCache(2);
        cache.set(2, 1);
        cache.set(1, 1);
        Assert.assertEquals(1, cache.get(2));
        cache.set(4, 1);
        Assert.assertEquals(-1, cache.get(1));
        Assert.assertEquals(1, cache.get(2));
    }
}
