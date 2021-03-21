package item._5.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MosaicTest {

    @Test
    void test() {
        final Mosaic mosaic = new Mosaic(CeramicTile::new);

        assertEquals(CeramicTile.class, mosaic.getTile().getClass());
    }

}
