package effectivejavastudy.chapter1.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    private Object[] elements;
    private int size = 0;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(final Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }

        return elements[--size];
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
