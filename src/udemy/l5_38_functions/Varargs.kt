package udemy.l5_38_functions

fun main(args: Array<String>) {

    printCars(Car("toyota"), Car("Subaru"), Car("mercedes"))

    printCars(Car("toyota"), Car("Subaru"), Car("mercedes"), title = "a new title")

    val cars = arrayOf(Car("Honda"), Car("Land Rover"), Car("Jeep"))

//    printCars(cars) // won't work

    // add the 'spread' operator "*"
    printCars(*cars)

    // more on the spread operator
    val c1 = Car("Volkswagen")
    val moreCars = arrayOf(Car("Buick"), Car("Hummer"), Car("BMW"))

    println("not quite - it's a mixed array of Cars and Array<Car>")
    val combined = arrayOf(cars, c1, moreCars)

    for (c in combined) {
        println(c)
    }

    println("using spread")
    val withSpread = arrayOf(*cars, c1, *moreCars)
    for (c in withSpread) {
        println(c)
    }

}

// can only have one use of the vararg keyword within a function signature
fun printCars(vararg cars:Car, title:String="Default title!") {
    println(title)
    for (car in cars) {
        println(car)
    }
}

data class Car(val make:String)
