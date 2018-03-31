package udemy.l9_79_nullability

import udemy.l9_79_nullability.javacode.Car


fun main(args: Array<String>) {
    val car1 = Car("blue", "ford", 2015)

    car1.variableMethod(1, "hey", "there")
    val strs = arrayOf("hello", "goodbye")
    car1.variableMethod(3, *strs) // don't forget the spread operator

//    car1.wantsIntArray(arrayOf(1,2,3,4)) // won't work
    car1.wantsIntArray(arrayOf(1,2,3,4).toIntArray()) // one way
    car1.wantsIntArray(intArrayOf(1,2,3,4)) // another way

    car1.anObject // if you want to interact with java's object methods it needs to be cast as a java.lang.Object
//    (car1.anObject as java.lang.Object)

    println("x is ${Car.X}")
    println(Car.xString())
    println(Car.xString())
    println(Car.xString())

}

fun notNullAnnotationsDemo() {

    val car1 = Car("blue", "ford", 2015)
//    car1.color = null // no compiler exception - but will get a runtime exception b/c of the @NotNull annotation
    car1.color = "green"
    println(car1)

}