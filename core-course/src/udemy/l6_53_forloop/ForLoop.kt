package udemy.l6_53_forloop


fun main(args: Array<String>) {

    // can't do ...
//    for (int i=0; i<10; i++ ){
//        etc
//    }

    // the range operator (..)
    // includes >=1 and <=5
    val range = 1..5

    val charRange = 'a'..'z'

    val strRange = "ABC".."XYZ"

    // can test value within range
    if (1 in range) println("1 in range!")
    if ('k' in charRange) println("k is in charRange")
    if ("LLL" in strRange) println("LLL in strRange")
    if ("ZZZ" in strRange) println("Nothing should print here")

    // can't iterate over the string range - not an Iterable
//    print(strRange, "String range")

    val str = "Hello"
    print(str.asIterable(), "Iterate over string")


    // can go backward - but needs the 'downTo' construct
    val reverseRange = 5.downTo(1)
    if (5 in reverseRange) println("5 in reverseRange")

    // what about
    val r  = 5..1
    if (5 in r) println("Not true - because 5 is not lte to 1")

    // step range
    val stepRange = 3..15
//    print(stepRange)
    val byThree = stepRange.step(3)
    print(byThree, "Range by step 3")

    // reversed
    val reversedByThree = byThree.reversed()
    print(reversedByThree, "Reversed by 3")

    // iterate a range of numbers stepped by 4
    br()
    for(num in 0..20 step 4) {
        println(num)
    }

    br()
    // going the other way
    for (num in 20 downTo 15) {
        println(num)
    }

    br()
    for (num in 20 downTo 10 step 3){
        println(num)
    }
    br()
    // excluding last number in range
    for (num in 1 until 10) {
        println(num)
    }

}

fun <T> print(range:Iterable<T>, title:String = "Print Range") {
    println("\n$title")
    for (i in range)  println(i)
}
fun br() = println()