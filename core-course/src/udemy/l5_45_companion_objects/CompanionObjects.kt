package udemy.l5_45_companion_objects


// Can't have static (class) access to privateVar in Kotlin
// Compare the javacode version of the same
//class FooClass {
//    private val privateVar = 5
//
//    fun getPrivateVar() :Int {
//        println("Accessing privateInt $privateVar")
//        return privateVar
//    }
//}

fun main(args: Array<String>) {
    // the default is 'Companion'
    FooClass.Companion.accessPrivateVar()

    // Companion is not necessary
    FooClass.accessPrivateVar()

    BazClass.Bazinga.accessPrivateVar()
    // Companion name is not necessary
    BazClass.accessPrivateVar()


    // factory example
    var f1 = Fizzle.create("Default create")
    var f2 = Fizzle.upperOrLower("this should be in uppercase", false)
    println(f1.someString)
    println(f2.someString)

}

class FooClass {
    companion object {
        private var privateVar = 5

        fun accessPrivateVar(): Int {
            println("Accessing privateInt $privateVar")

            return privateVar

        }
    }
}

class BazClass {
    // Use a different companion object name
    companion object Bazinga {
        private var privateVar = 5

        fun accessPrivateVar(): Int {
            println("Accessing privateInt $privateVar")

            return privateVar

        }
    }
}

// companion objects in use with a factory pattern
// private constructor prevents access to the default constructor
class Fizzle private constructor(var someString: String) {

    companion object {
        fun create(str:String) = Fizzle(str)

        fun upperOrLower(str:String, bln:Boolean) :Fizzle {
            if (bln) {
                return Fizzle(str.toLowerCase())
            }
            return Fizzle(str.toUpperCase())

        }
    }

}