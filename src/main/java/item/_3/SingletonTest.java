package item._3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    void singleton1Test() {
        // new Singleton1(); can't do this
        final Singleton1 s1 = Singleton1.INSTANCE;
        final Singleton1 s2 = Singleton1.INSTANCE;

        assertEquals(s1, s2);
    }

    @Test
    void singleton2Test() {
        // new Singleton2(); can't do this
        final Singleton2 s1 = Singleton2.getInstance();
        final Singleton2 s2 = Singleton2.getInstance();

        assertEquals(s1, s2);
    }

    @Test
    void singleton3Test() {
        // new Singleton3(); Enum types cannot be instantiated
        final Singleton3 s1 = Singleton3.INSTANCE;
        final Singleton3 s2 = Singleton3.INSTANCE;

        assertEquals(s1, s2);
    }

}
