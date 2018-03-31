package udemy.l7_64_sets


fun main(args: Array<String>) {
    val s1 = setOf(1,2,3,4,5)
    s1.plus(8)
    // did not add to the set! b/c s1 is immutable
    println(s1)
    val s2= s1.plus(8)
    println(s2)
    val s3 = s1.minus(5)
    println(s3)

    println(s1.average())

    // drop the first three elements of the set
    println(s1.drop(3)) // [4,5]


}