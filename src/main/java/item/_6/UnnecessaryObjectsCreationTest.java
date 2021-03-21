package item._6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class UnnecessaryObjectsCreationTest {

    @Test
    void badStringExampleTest() {
        Map.Entry<String, String> strings = UnnecessaryObjectsCreation.badStringExample();

        Assertions.assertNotSame(strings.getKey(), strings.getValue());
    }

    @Test
    void correctStringExampleTest() {
        Map.Entry<String, String> strings = UnnecessaryObjectsCreation.correctStringExample();

        Assertions.assertSame(strings.getKey(), strings.getValue());
    }



}
