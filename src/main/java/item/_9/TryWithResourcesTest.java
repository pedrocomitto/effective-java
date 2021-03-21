package item._9;

import org.junit.jupiter.api.Test;

public class TryWithResourcesTest {

    @Test
    void test() throws Exception {
        try (Something s = new Something();) {
            s.doSomething();
        }
    }

}
