package udemy.l9_82_annotations;

import udemy.l9_82_annotations.kotlincode.Car;
import udemy.l9_82_annotations.kotlincode.CarKt;
import udemy.l9_82_annotations.kotlincode.Singleton;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("orange", "Blazer", 1993);

        try {
            // no compile time warning
            car.printMe(null);
        } catch (IllegalArgumentException e){
            System.out.println("Caught " + e.getMessage());
        }

        // no errors - even though this will throw an IOException
//        car.doIO();

        try {
            car.doIO();
            // compile time error unless we annotate it in kotlin
        } catch (IOException e){
            System.out.println("caught ioexception " + e.getMessage());
        }

        // this works - but you probably don't want the Companion in there
        Car.Companion.carComp();

        // adding @JvmStatic to the method allows
        Car.carComp();
        System.out.println("Is auto? " + Car.isAuto);

        // get constants for free
        System.out.println("the constant? " + Car.constant);

        // the INSTANCE variable is added; however, adding @JvmStatic works also...
        Singleton.INSTANCE.doSomething();

        // and so this works too
        Singleton.doSomething();


        CarKt.defaultArgs("hey", 23);
        CarKt.defaultArgs("with the default num");
    }
}
