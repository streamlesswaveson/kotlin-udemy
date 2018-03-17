package udemy.l3_21_bitoperators


fun main(args: Array<String>) {

    // lesson - you spell out the bitwise operators i.e. | becomes 'or' & becomes 'and', etc.

    var x = 0b01
    var y = 0b10
    println(x and y) // 0
    println(x or y) // 3

    val d1 = Dog("Spot")
    val d2 = Dog("Davy")

    // 'smart' casting
    if (d1 is Dog) {
        val d3 = d1 as Dog // the 'as' is a cast - but not needed since the 'is' check performs an implicit cast
        println(d3.name)
    }
}

class Dog(val name:String)