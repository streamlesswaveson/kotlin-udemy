package udemy.l7_66_sequences


// sequences are streams

fun main(args: Array<String>) {
    val immutableMap = mapOf<Int, Car>(
            1 to Car("Toyota", "Corolla", 2007),
            2 to Car("Subaru", "Forester", 2015),
            3 to Car("Volkswagen", "Beetle", 2000),
            4 to Car("Toyota", "Prius", 2011),
            5 to Car("Toyota", "Swagger wagon", 2008)
    )

    //intermediate operation returns another sequence, just like java streams
    println(immutableMap.asSequence().filter { it.value.make == "Toyota" }
            .map { it.value.model }) //kotlin.sequences.TransformingSequence@31befd9f


    // none of the printlns will execute - only sequences are returned and they are all lazy
    listOf<String>("Larry", "Moe", "Curly", "Shemp").asSequence()
            .filter { println("filtering $it"); it[0] == 'C' }
            .map { println("mapping $it"); it.toUpperCase() }

    println("....")
    listOf<String>("Larry", "Moe", "Curly", "Shemp", "Charlie").asSequence()
            .filter { println("filtering $it"); it[0] == 'C' }
            .map { println("mapping $it"); it.toUpperCase() }
            .toList() // terminal operation

    println("....")
    listOf<String>("Larry", "Moe", "Curly", "Shemp", "Charlie").asSequence()
            .filter { println("filtering $it"); it[0] == 'C' }
            .map { println("mapping $it"); it.toUpperCase() }
            .find { it.endsWith("Y") }
}



data class Car(val make: String, val model: String, val year: Int) {

}
