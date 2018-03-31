package udemy.l6_55_whenexpression

import java.math.BigDecimal


fun main(args: Array<String>) {

    // when replaces the switch statement
    // no fallthrough!

    val value = 200

    when(value) {
        100 -> println("matches 100")
        200 -> println("matches 200")
        300 -> println("matches 300")
        else -> println("doesn't match anything")
    }

    // can use multiple values in an or-like construct
    val otherValue = 100

    when(otherValue) {
        100,600 -> println("could be 100 or 600")
        500,1000 -> println("could be 500 or 1000")
        else -> println("doesn't match anything")
    }

    // can use ranges
    val valueInRange = 200
    when(valueInRange) {
        in 0..100 -> println("$valueInRange in 0..100")
        in 101..200 -> println("$valueInRange in 101..200")
        else -> println("$valueInRange doesn't match anything")
    }

    // can use expressions
    val y = 100
    when(value) {
        y + 90 -> println("matches 100")
        y + 100 -> println("matches 200")
        y + 200 -> println("matches 300")
        else -> println("doesn't match anything")
    }

    // smart casting and assignment
    val o1:Any = "Hello world"
    val o2:Any = BigDecimal(123.456)
    val o3:Any = 42
    val o4:Any = Foo()
    val something:Any = o3

    val x = when(something) {
        is String -> "it's a string!"
        is Foo -> "It's Foo"
        is Int -> "it's an int"
        is BigDecimal -> "a big decimal"
        else -> "Don't know"
    }
    println(x)

    // when without a condition
   val num1 = 20
    val num2 = 50
    when {
        num1 > num2 -> println("num1 greater than num2")
        num1 < num2 -> println("num1 less than num2")
        else -> println("num1 and num2 are equal")
    }
}

class Foo {}