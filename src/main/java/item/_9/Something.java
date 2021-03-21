package item._9;

public class Something implements AutoCloseable {

    public void doSomething() {
        System.out.println("doing something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing");
    }
}
