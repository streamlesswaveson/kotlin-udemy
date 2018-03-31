package udemy.l7_67_generics

import java.math.BigDecimal


fun main(args: Array<String>) {

    val list:MutableList<String> = mutableListOf("Foo", "Bar")
    list.add("Baz")
    list.get(0).toUpperCase()

    printCollection(list)

    val bdList = mutableListOf<BigDecimal>(BigDecimal(12.23), BigDecimal(34.4554), BigDecimal(3.5555))
    printCollection(bdList)

    // as extension
    bdList.printColleciton()
}

// <T> = type parameter declaration
fun <T>printCollection(coll:List<T>) {
    for (item in coll) {
        println(item)
    }

}

// made into an extension
fun <T> List<T>.printColleciton() {
    for (item in this) {
        println(item)
    }
}