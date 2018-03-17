package udemy.l4_29_nulls


fun main(args: Array<String>) {

    val nullableInts :Array<Int?> = arrayOfNulls(5)
    nullableInts.forEach { println(it) }
}