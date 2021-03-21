package item._1.staticfactory;

public class AnyObject {

    // volatile keyword ensures that this value will be stored on the main memory
    private static volatile AnyObject INSTANCE;

    private String param1;

    private String param2;

    private int param3;

    private boolean param4;

    private AnyObject(final String param1, final String param2, final int param3, final boolean param4) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    // default static factory
    public static AnyObject of(final String param1, final String param2, final int param3) {
        //any logic

        return new AnyObject(param1, param2, param3 * 5, true);
    }

    // if we need a singleton
    public synchronized static AnyObject getInstance(final String param1, final String param2, final int param3) {
        if (INSTANCE == null) {
            INSTANCE = new AnyObject(param1, param2, param3 * 5, true);
        }

        return INSTANCE;
    }


    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public int getParam3() {
        return param3;
    }

    public void setParam3(int param3) {
        this.param3 = param3;
    }

    public boolean isParam4() {
        return param4;
    }

    public void setParam4(boolean param4) {
        this.param4 = param4;
    }
}
