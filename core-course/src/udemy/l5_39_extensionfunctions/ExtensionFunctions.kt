package udemy.l5_39_extensionfunctions


fun main(args: Array<String>) {
    // using the externalized 'java-way'
    val result = Utils().spam("Chad")
    println(result)

    println("Alibaba".spam())
}


// extension function way
fun String.spam() :String {
    return this.replace("a", "SPAM")
}
