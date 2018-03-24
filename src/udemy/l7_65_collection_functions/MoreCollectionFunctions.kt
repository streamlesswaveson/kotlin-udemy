package udemy.l7_65_collection_functions


fun main(args: Array<String>) {

    val s1 = setOf(1, 2, 3, 4, 5)

    // filter for odds
    println(s1.filter { it % 2 != 0 })

    val immutableMap = mapOf<Int, Car>(
            1 to Car("Toyota", "Corolla", 2007),
            2 to Car("Subaru", "Forester", 2015),
            3 to Car("Volkswagen", "Beetle", 2000),
            4 to Car("Toyota", "Prius", 2011),
            5 to Car("Toyota", "Swagger wagon", 2008)
    )

    println(immutableMap.filter { it.value.year == 2000 })


    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List)

    //using map
    val plus10 = ints.map { it + 10 }
    println(plus10)

    // as you'd expect
    println(immutableMap.map { it.value.year })

    // chaining
    println(immutableMap.filter { it.value.make == "Toyota" }
            .map { it.value.model }) //[Corolla, Prius, Swagger wagon]

    // do all match a certain condition?
    println(immutableMap.all { it.value.year > 2000 }) //false
    println(immutableMap.all { it.value.year > 1999}) //true

    // does at least one match the condition?
    println(immutableMap.any { it.value.year > 2010}) //true

    // how many?
    println(immutableMap.count{ it.value.year > 2010}) //2

    // find - finds FIRST item in collection and stops
    var cars = immutableMap.values
    println(cars.find { it.year > 2014 })

    //groupBy
    println(cars.groupBy { it.make })

    //sortedBy
    println(cars.sortedBy { it.year })

}

data class Car(val make: String, val model: String, val year: Int) {

}
