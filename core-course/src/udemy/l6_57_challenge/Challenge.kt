package udemy.l6_57_challenge


fun main(args: Array<String>) {
//    printStepTo5000()
//    neg500toZero()
//    fib(15)
    println(dnum(40))
}

fun printStepTo5000(){
    for (num in 5..5000 step 5)
        println(num)
}

fun neg500toZero(){
    for (num in -500..0) {
        println(num)
    }
}

fun fib(howMany:Int) {
    var first = 0
    var second = 1
    for (num in 3..howMany) {
        var myfib = first + second
        println(myfib)
        first = second
        second = myfib
    }
}

fun dnum(num:Int) :Double {

    return when {
        num > 100 -> -234.567
        num < 100 -> 4444.5555
        else -> 0.0
    }
}