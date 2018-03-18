package udemy.l5_41_inheritance

// everything in Kotlin is public/final by default!

fun main(args: Array<String>) {

    val p1 = LaserPrinter("Brother 8383")
    p1.printModelName()
    println(p1.bestSellingPrice())

    val p2 = SpecialLaserPrinter("Muy Especial Brother 8383")

    //
    val b1 = Bar("Heya")
}

// 'open' removes the 'final' constraint
open abstract class Printer(val modelName:String) {

    // 'open' keyword is required if you want something to overrideable (recall everything is final by default)
    open fun printModelName() = println("The model name is $modelName")
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String): Printer(modelName) {

//    constructor(): super() // just defers to the default primary constructor of the superclass

    // add final to prevent subclasses from overriding
    final override fun printModelName() = println("The laser printer model name is $modelName")

    override fun bestSellingPrice(): Double {
        return 123.34
    }

}

class SpecialLaserPrinter(modelName: String) :LaserPrinter(modelName) {
    // can't happen with upstream 'final' modifier
//    override fun printModelName() {
//        println("My special way of doing things")
//    }
}

open class Foo {

    val myprop :String

    constructor(prop:String) {
        myprop = prop
        println("running parent constructor")
    }
}

class Bar : Foo {

    constructor(prop:String): super(prop) {
        println("running child constructor")
    }
}

// how about this? extendable data classes?
//open data class CantHappen {
//
//}