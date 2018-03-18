package udemy.l5_37_dataclasses

// top level constants
val MY_CONSTANT = 100

fun main(args: Array<String>) {

    val c1 = Car("Toyota","Corolla", 2007)
    // reasonable toString implementation from 'data' class
    println(c1) // Car(make=Toyota, model=Corolla, year=2007)

    val c2 = Car("Toyota","Corolla", 2007)

    // also, the hash/equals works out of the box
    if (c1 == c2) {
        println("Cars are equal")
    }

    // make a copy
    val carCopy = c1.copy()
    println(carCopy)

    // or make a copy - but change a field
    val modCar = c1.copy(year = 2017)
    println(modCar)


}

// data classes come with a better toString implementation and hashcode/equals implementation, and copy
// data classes must have at least one parameter in their primary constructor
// they must be marked either val/var
// they cannot be abstract, sealed or inner classes
data class Car(val make:String, val model:String, val year:Int) {

}