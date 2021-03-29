package item._11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BrokenHashCodeTest {

    @Test
    void test() {
        final BrokenHashCode brokenHashCode1 = new BrokenHashCode(1, 2, 3);
        final BrokenHashCode brokenHashCode2 = new BrokenHashCode(1, 2, 3);

        assertNotEquals(brokenHashCode1.hashCode(), brokenHashCode2.hashCode());
    }

}