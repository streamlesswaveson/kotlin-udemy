package udemy.l7_68_generics_functions_erasure.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        System.out.println(stringList instanceof List); // works
//        System.out.println(stringList instanceof List<String>); // doesn't work - generics is a compile time feature
    }
}
