package item._2.hierarchybuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(final Topping topping) {
            toppings.add(Objects.requireNonNull(topping));

            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(final Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
