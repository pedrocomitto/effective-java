package item._7;

import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeakHashMapCacheTest {

    @Test
    void test() throws InterruptedException {
        WeakHashMap<Object, Object> cache = new WeakHashMap<>();
        Object imageName = new Object();
        Object bigImage = new Object();

        cache.put(imageName, bigImage);

        assertTrue(cache.containsKey(imageName));

        imageName = null;

        System.gc();

        Thread.sleep(5000);

        assertEquals(cache.size(), 0);
    }

}
