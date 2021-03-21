package item._3;

import java.io.Serial;
import java.io.Serializable;

public class Singleton2 implements Serializable {

    private static final Long serialVersionUID = 1L;

    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
        if (INSTANCE != null) {
           throw new UnsupportedOperationException(); // avoid reflection
        }
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    // we need this to avoid creating another instances when it is deserialized
    @Serial
    private Object readResolve() {
        return INSTANCE;
    }

    public void something() {

    }

}
