package udemy.l4_29_nulls


fun main(args: Array<String>) {
    val str :String? = "hey jude"
    //printText(str) // can't do this ... it's nullable and the method requires a non-nullable string
    printText(str!!) // we can do this, but that's a problem if it's null!

    // instead, consider using the ?.let method
    str?.let { printText(str) }

    val str2 :String? = null
    val str3 = "not null"
    // what happens here? nothing - the == is a null-safe operator
    if (str2 == str3) {
        println("equal!")
    }

}

// function requires a non nullable string
fun printText( str: String) {
    println(str)
}