package item._2.hierarchybuilder;

import java.util.Objects;

public class NyPizza extends Pizza {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(final Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(final Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
