package udemy.l3_25_challenge


fun main(args: Array<String>) {

    val h1 = "hello"
    val h2 = "hello"

    assert(
            h1 === h2, {println("hey")})


    val str : Any = "The Any type is the root of the Kotlin class hierarchy"

    if (str is String) {
        println(str.toUpperCase())
    }

    println("""   1
  11
 111
1111""")
}