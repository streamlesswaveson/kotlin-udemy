package udemy.l7_69_reified_parameters

import java.math.BigDecimal


// Reification is a Kotlin feature that prevents a type from being erased

fun main(args: Array<String>) {
    val mixedList = listOf<Any>("foo", 1, BigDecimal(12.23), 12.3f, BigDecimal(987.33), "bar")

    val bds = getElementsOfType<BigDecimal>(mixedList);
    println(bds)

    val strs = getElementsOfType<String>(mixedList);
    println(strs)
}

/*
step 1: declare the function as inline
step 2: declare T as 'reified'

Only want to mark the parameter as 'reified' if you check the type inside the function
 */

inline fun < reified T> getElementsOfType(list:List<Any>): List<T> {

    var mutableList:MutableList<T> = mutableListOf()
    for (elem in list) {
        if (elem is T) {
            mutableList.add(elem)
        }
    }
    return mutableList
}