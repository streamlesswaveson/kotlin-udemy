package udemy.l7_63_maps


fun main(args: Array<String>) {

    val immutableMap = mapOf<Int,Car>(1 to Car("Toyota","Corolla",2007),
            2 to Car("Subaru","Forester", 2015),
            3 to Car("Volkswagen", "Beetle", 2000))
    println(immutableMap)
    println(immutableMap.javaClass) //java.util.LinkedHashMap

    val mutableMap = mutableMapOf<String,Car>("My Car" to Car("Subaru", "Forester", 2015),
            "Your Car" to Car("Jeep", "Wranger", 1995))
    println(mutableMap)
    println(mutableMap.javaClass) //java.util.LinkedHashMap

    for (entry in mutableMap) {
        println("key=${entry.key} value=${entry.value}")
    }
    //or
    for ((key,value) in mutableMap) {
        println("key=${key} value=${value}")
    }


    // with java.util.HashMap
    val hashMap= hashMapOf<String,Car>("My Car" to Car("Subaru", "Forester", 2015),
            "Your Car" to Car("Jeep", "Wranger", 1995))
    println(hashMap)
    println(hashMap.javaClass) //java.util.HashMap


    // destructuring is available in kotlin
    val pair = Pair(10, "ten")
    val (first, second) = pair
    println("first = $first second = $second")

    // how do we destructure a class? => implement the componentN() operator
    // properties must be public
    val (make, model, year) = Car("Toyota", "Prius", 2010)
    println("make=$make, model=$model, year=$year")

    // for data classes the 'componentN()' is unnecessary - you get it for free
    val (fizz, buzz)  = Foo("gotcha", 10)
}



class Car(val make:String, val model:String, val year:Int) {
    operator fun component1() = make
    operator fun component2() = model
    operator fun component3() = year
}

data class Foo(val fizz:String, val buzz:Int)