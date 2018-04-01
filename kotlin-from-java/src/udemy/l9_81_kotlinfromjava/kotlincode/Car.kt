// What if there is a conflict - this example renames the Car class to CarKt (which is the default provided by Kotlin)
// this idiom "renames" the top level static class
@file:JvmName("StaticCar")
package udemy.l9_81_kotlinfromjava.kotlincode

fun main(args: Array<String>) {
    "hiya".print()
}

fun topLevel() = println("I'm in the car file!")

class CarKt(val color:String, @JvmField val model:String, val year:Int, var isAutomatic:Boolean)

// extension function - how would this be called in java?
fun String.print() = println(this)