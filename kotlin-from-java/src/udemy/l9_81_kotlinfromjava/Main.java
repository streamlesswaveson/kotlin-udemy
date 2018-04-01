package udemy.l9_81_kotlinfromjava;

// the default top level name
//import static udemy.l9_81_kotlinfromjava.kotlincode.CarKt.topLevel;

// this is using the overridden JvmName
import udemy.l9_81_kotlinfromjava.kotlincode.CarKt;
import udemy.l9_81_kotlinfromjava.kotlincode.StaticCar;

import static udemy.l9_81_kotlinfromjava.kotlincode.StaticCar.topLevel;

public class Main {

    public static void main(String[] args) {
        topLevel();

        //calling the extension function
        StaticCar.print("this is a string");

        CarKt car = new CarKt("green", "Volkswagen", 2000, true);
        System.out.println(car.getColor());
        System.out.println(car.isAutomatic());
        // note the 'setAutomatic' created for boolean
        car.setAutomatic(false);

        // because we set the @JvmField annotation -
        System.out.println(car.model);
    }
}
