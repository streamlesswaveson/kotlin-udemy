package udemy.l9_79_nullability.javacode;

import org.jetbrains.annotations.NotNull;

public class Car {
    public static int X = 5;
    private String color;
    private String model;
    private int year;
    private Object anObject;

    public static String xString() {
        return String.format("x value is %d", X++);
    }
    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public Car(String color, String model, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    // this @NotNull annotation is a jetbrains annotation
    public void setColor(@NotNull String color) {
        this.color = color;
    }

    // annotate the return value
    public @NotNull  String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void variableMethod(int num, String ... strings) {
        for (String s: strings) {
            System.out.println(s);
        }
    }

    public void wantsIntArray(int[] theArray) {
        for (int i: theArray) {
            System.out.printf("Here's the int: %d\n", i);
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
