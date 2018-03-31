package udemy.l7_67_generics.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.get(0).toUpperCase(); // i.e. compiler knows it's a string
    }
}
