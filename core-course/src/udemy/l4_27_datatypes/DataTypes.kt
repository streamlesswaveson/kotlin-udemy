package udemy.l4_27_datatypes


fun main(args: Array<String>) {
    var anInt = 32

    // the 'L' suffix required for a long, as in java
    var aLong = 32L

    // same goes for floats and doubles
    var aDouble = 2.34
    var aFloat = 5.284f

    aFloat = aDouble.toFloat()

    // can't do this ("widen" an int by assigning it to a long)
    //aLong = anInt
    //instead...
    aLong = anInt.toLong()

    // it's a char!
    var myChar = 'b'

    // won't work - compiler thinks it's an int
    var anotherChar = 65

    // this won't work either
    //var andAnotherChar :Char = 65

    var finallyAChar = anotherChar.toChar()


    println(Vacation().isOnVacation(true))
    println(Vacation().isOnVacation(false))
}