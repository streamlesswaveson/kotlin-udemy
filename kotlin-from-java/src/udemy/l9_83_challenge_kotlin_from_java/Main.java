package udemy.l9_83_challenge_kotlin_from_java;

import udemy.l9_83_challenge_kotlin_from_java.kotlincode.Challenge;
import udemy.l9_83_challenge_kotlin_from_java.kotlincode.Employee;
import udemy.l9_83_challenge_kotlin_from_java.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args){

        KotlinStuff.sayHelloToJava("Billy");

        Employee employee = new Employee("Mickey", "Thompson", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5,4);

        employee.takesDefault("arg1");
    }
}
