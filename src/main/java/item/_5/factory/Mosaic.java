package item._5.factory;

import java.util.function.Supplier;

public class Mosaic {

    private final Tile tile;

    public Mosaic(final Supplier<? extends Tile> tileFactory) {
        this.tile = tileFactory.get();
    }

    public Tile getTile() {
        return tile;
    }
}
