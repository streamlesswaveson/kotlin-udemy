package udemy.l4_28_arrays

import java.math.BigDecimal


fun main(args: Array<String>) {

    val stringArr = arrayOf("Aidan", "Iain", "Andrew")
    val longArr = arrayOf(1L, 2L, 3L)
    //or
    val longArr2 = arrayOf<Long>(1,2,3,4)

    //initialize using a lambda

    val evenNums = Array(16) { i -> i *2 }
    println(evenNums.forEach { i-> println(i) })

    // other initialization
    // all zeros
    val allZeros = Array(100) { 0 }



    var stuff = arrayOf("thing", BigDecimal(10.23), 'b', false)

    stuff.forEach { i -> println(i) }

    // mixed array -> an Array<Any>
    println(stuff is Array<Any>)

    // calling java class requiring primitive int array
//    var myints = arrayOf(1,223, 83, 89) arrayOf won't provide the correct datatype for this
    var myints = intArrayOf(1,223, 83, 89)
    PrimitiveArray().print(myints)

    // also, you can convert an Array<Int> to int array
    PrimitiveArray().print(evenNums.toIntArray())

    // also, use IntArray (and similar) to get an array initialized to to some length with default values
    var myDefaultInts = IntArray(5)

    // going from IntArray to typed array

    var myTypedArr = myDefaultInts.toTypedArray()
    myTypedArr is Array<Int> // no compiler error, so yup
}