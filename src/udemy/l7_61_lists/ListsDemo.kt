package udemy.l7_61_lists


fun main(args: Array<String>) {
    val strs = listOf("winter","spring","summer","fall")

    //gotcha- under the hood it's an ArrayList, a mutable collection type
    // so if this is passed to java code it will lose its immutability
    println(strs.javaClass) // java.util.Arrays$ArrayList

    // declaring an empty list
    var emptyList = emptyList<String>()
    // or
    var anotherEmptyList :List<String> = emptyList()
    println(emptyList.javaClass) // kotlin.collections.EmptyList

    // not null lists
    var notNullList = listOfNotNull("green", null, "eggs", "and", "ham")
    // kicks the null item out!
    println(notNullList)

    // plain ol' arraylist - mutable
    var arrList = arrayListOf<Int>(1,2,3,4)
    println(arrList.javaClass) // java.util.ArrayList
    arrList.add(5)

    val mutableList = mutableListOf<String>("Hey", "Jude")
    println(mutableList.javaClass)
    mutableList.add("don't make it bad")

    // arrays
    val array = arrayOf(1,2,3)
    val somelist = listOf(*array) // the '*' unpack operator again
    println(somelist)
    // and this works too
    println(array.toList())



}