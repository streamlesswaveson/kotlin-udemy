package udemy.l6_56_trycatch


fun main(args: Array<String>) {
    println(getNumber("22"))
    println(getNumber("chad"))
}

fun getNumber(str:String) :Int {
    return try {
        Integer.parseInt(str)
    } catch (e :NumberFormatException) {
        0
    } finally {
        println("i'm finally")
        1 // doesn't get returned - ignored
    }
}