package item._7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int position = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[position++] = e;
    }

    public Object pop() {
        if (position == 0) {
            throw new EmptyStackException();
        }

        Object result = elements[--position];

        elements[position] = null; // this will avoid memory leak. Then the garbage collector will take care of this obsolete reference.

        return result;
    }

    private void ensureCapacity() {
        if (elements.length == position) {
            elements = Arrays.copyOf(elements, 2 * position + 1);
        }
    }

}
