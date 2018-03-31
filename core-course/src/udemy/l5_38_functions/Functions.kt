package udemy.l5_38_functions


fun main(args: Array<String>) {
    println(firstFunc(2, 3, "Result is"))
    println(altFunc(2, 4, "Result is"))
    println(evenSimplerFunc(2, 8, "Result is"))
    println(withDefault(8,8))

    val e1 = Employee("Ralphie")
    println(e1.toUpper())
}

// first way
fun firstFunc(a: Int, b: Int, label: String): String {
    return "$label ${a * b}"
}

// but this is possible too...
fun altFunc(a: Int, b: Int, label: String): String =
        "$label ${a * b}"

// and since the compiler can infer the return type...
fun evenSimplerFunc(a: Int, b: Int, label: String) = "$label ${a * b}"

fun withDefault(a: Int, b: Int, label: String = "The answer is") = "$label ${a * b}"

class Employee(val firstName:String) {

    // super simple
    fun toUpper() = firstName.toUpperCase()
}