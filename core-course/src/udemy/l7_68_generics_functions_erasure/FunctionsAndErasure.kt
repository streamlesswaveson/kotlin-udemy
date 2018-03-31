package udemy.l7_68_generics_functions_erasure


fun main(args: Array<String>) {

    var ints = listOf(1,2,3,4,5)
    var shorts :List<Short?> = listOf(10,20,30,40,50)
    var floats:List<Float?> = listOf(10.3f,20.23f,30.55f,40.98f,50.23f)
    var strings:List<String> = listOf("Manny", "Moe", "Jack")

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("zig"), StringBuilder("zag"))

    printCollection(ints) // works - non-nullable
//    printCollection(shorts) // doesn't work - nullable!

    // erasure
    // this works.  The instructor's guess is that the compiler removes the 'if' since it will always evaluate to true
    if (strings is List<String>) {
        println("yup!")
    }
    //but ...
    var anyStuff:Any = listOf("foo","bar","baz")
//    if (anyStuff is List<String>) { // this doesn't work - it would have to be checked at runtime
//        println("nope")
//    }
    // and...
//    if (anyStuff is List) { // this won't work either - kotlin requires a type
//        println("won't work")
//    }
    // finally...
    if (anyStuff is List<*>) {
        println("use the star projection")
    }
}

//fun <T> convertToInt(col:List<T>) {
//    for (item in col) {
//        println("${item.toInt()}") // won't work
//    }
//}

//instead - declare the type T to be a Number
fun <T:Number?> convertToInt(col:List<T>) {
    for (item in col) {
        println("${item?.toInt()}")
    }
}
fun <T:Any> printCollection(col:List<T>) { // Any restricts to only non-nullable types
    for (item in col) {
        println(item)
    }
}

fun <T> append(item1:T, item2:T)
where T:CharSequence, T:Appendable { // where clause! - T must be a CharSequence and Appendable
    println(item1.append(item2))
}
