package udemy.l9_82_annotations.kotlincode

import java.io.IOException

// the compiler only generates one version for java - the version that requires all parameters
// the @JvmOverloads generates the other versions
@JvmOverloads fun defaultArgs(str:String, num:Int = 30) {
    println("str=$str and num=$num")
}

class Car(val color:String, @JvmField val model:String, val year:Int) {
    companion object {
        // note - not annotated with anything
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in Car's companion object")
    }

    // compiler is generating a check for null under the cover
    fun printMe(text:String) {
        println("I don't expect a null value $text")
    }

    // what happens with checked exceptions?
    @Throws(IOException::class)
    fun doIO() {
        throw IOException("IO Exception!")
    }
}


object Singleton {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}