package item._10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualsTest {

    @Test
    void perfectEquals() {
        final PerfectEquals perfectEquals1 = new PerfectEquals(1, 2, 3);
        final PerfectEquals perfectEquals2 = new PerfectEquals(1, 2, 3);

        assertEquals(perfectEquals1, perfectEquals2);
    }

    @Test
    void brokenEquals() {
        final BrokenEquals brokenEquals1 = new BrokenEquals(1, 2, 3);
        final BrokenEquals brokenEquals2 = new BrokenEquals(1, 2, 3);

        assertEquals(brokenEquals1, brokenEquals2);
    }

}
