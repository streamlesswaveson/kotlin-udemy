package udemy.l6_53_forloop


fun main(args: Array<String>) {

    val seasons = arrayOf("spring", "summer", "fall", "winter")
    print(seasons.asIterable(), "the seasons!")

    println("whatever" !in seasons)

    // by index
    for (index in seasons.indices) {
        println("${seasons[index]} index is $index")
    }

    // by lambda

    seasons.forEachIndexed { index, value -> println("$value and $index") }

    // breaks to labels
    for (i in 1..3) {
        println("i=$i")
        kloop@ for (k in 4..7) {
            println("k=$k")
            for (z in 'a'..'d') {
                println("z=$z")
                if (z == 'c') {
                    println("breaking!")
                    break@kloop
                }
            }
        }
    }
}