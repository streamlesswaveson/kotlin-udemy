package udemy.l8_75_reading_text_files

import java.io.File


fun main(args: Array<String>) {
//    readEverythingWithUse()
    withForEachLine()
}

fun underTheHood() {
    File("textfile.txt").reader()

    // the above translates to the following in Java
//    new InputStreamReader(new FileInputStreamReader(new File("textfile.txt")), "UTF-8")

}

fun readEachLine() {
    val lines = File("textfile.txt").reader().readLines()
    lines.forEach { println(it) }
}

fun readEverythingWithAReader() {
    val reader = File("textfile.txt").reader()
    println(reader.readLines())
    reader.close()
}

fun readEverythingWithUse(){
    val lines = File("textfile.txt").reader().use { it.readText() }
    println(lines)
}

fun withForEachLine() {
    File("textfile.txt").reader().forEachLine { println(it) }
}