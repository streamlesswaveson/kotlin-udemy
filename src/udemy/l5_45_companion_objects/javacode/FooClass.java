package udemy.l5_45_companion_objects.javacode;

public class FooClass {
    private static int privateInt = 5;

    public static void main(String [] args){
        new BarClass().baz();
    }

    public static int getPrivateInt() {
        System.out.println("Accessing privateInt " + privateInt);
        return privateInt;
    }

}
