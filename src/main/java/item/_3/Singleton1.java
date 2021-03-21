package item._3;

public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
        if (INSTANCE != null) {
            throw new UnsupportedOperationException(); // avoid reflection
        }
    }

    public void something() {

    }

}
