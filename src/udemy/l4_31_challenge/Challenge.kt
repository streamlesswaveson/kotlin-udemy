package udemy.l4_31_challenge


fun main(args: Array<String>) {
    // declare a non-nullable float value two ways
    val f1 = -3847.384f
    val f2 :Float = -3847.384f

    // change to nullable vars
    val nF1 :Float? = f1
    val nF2 :Float? = f2

    // non nullable short array of size 5 with values 1-5
    val shortArr :Array<Short> = Array<Short>(5) {i -> (i+1).toShort()}

    // declare array of nullable ints 5 - 200, incremented by 5
    var nullableIntArr :Array<Int?> = Array<Int?>(40) {i -> (i+1)*5}
    nullableIntArr.forEach { println(it) }

    // create an array that you can pass to the java method signature public void method(char[] arr)
    var charArr = charArrayOf('a','b','c')

    val x: String? = "I AM IN UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"
    println(y)

    // use let to convert to lower and replace am with am not
    val z = x.let { it?.toLowerCase()?.replace("am", "am not") }
    println(z)

    // change the code to make it throw an kotlin npe
    val myNonNullVar :Int? = null
    myNonNullVar!!.toDouble()
}