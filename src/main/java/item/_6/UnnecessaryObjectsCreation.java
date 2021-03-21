package item._6;

import java.util.Map;
import java.util.regex.Pattern;

public class UnnecessaryObjectsCreation {

    public static Map.Entry<String, String> badStringExample() {
        String s1 = new String("bikini");
        String s2 = new String("bikini");

        return Map.entry(s1, s2);
    }

    public static Map.Entry<String, String> correctStringExample() {
        String s1 = "bikini";
        String s2 = "bikini";

        return Map.entry(s1, s2);
    }

    private static final Pattern REGEX = Pattern.compile("regex");

    public void anotherExample() {
        // worst way - it creates a Pattern every time its called
        boolean worstWay = "myString".matches("regex");


        // best way - it uses an immutable and unique pattern object
        boolean bestWay = REGEX.matcher("myString").matches();
    }

    public long autoboxingExample() {
        Long sum = 0L; // here is the problem. Here we are using the Long wrapper, so on next lines it will be necessary an autoboxing

        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

}
