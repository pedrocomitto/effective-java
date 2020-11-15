package chapter.two.item.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnyObjectTest {

    @Test
    void factoryExample() {
        final AnyObject anyObject = AnyObject.of("param1", "param2", 2);

        assertEquals(10, anyObject.getParam3());
        assertTrue(anyObject.isParam4());
    }

    @Test
    void singletonExample() {
        final AnyObject anyObject = AnyObject.getInstance("param1", "param2", 2);
        final AnyObject sameInstanceAnyObject = AnyObject.getInstance("anotherParam1", "anotherParam2", 15);

        assertEquals(anyObject, sameInstanceAnyObject);
        assertEquals("param1", sameInstanceAnyObject.getParam1());
        assertEquals("param2", sameInstanceAnyObject.getParam2());
        assertEquals(10, sameInstanceAnyObject.getParam3());
    }
}
