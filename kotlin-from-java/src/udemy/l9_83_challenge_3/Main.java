package udemy.l9_83_challenge_3;

import udemy.l9_83_challenge_3.kotlincode.Employee;
import udemy.l9_83_challenge_3.kotlincode.KotlinCodeKt;
import udemy.l9_83_challenge_3.kotlincode.Challenge;

public class Main {
    public static void main(String[] args){

        KotlinCodeKt.sayHelloToJava("Billy");

        Employee employee = new Employee("Mickey", "Thompson", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5,4);

//        employee.takesDefault("arg1");
    }
}
