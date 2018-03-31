package udemy.l8_77_walking_file_tree

import java.io.File


fun main(args: Array<String>) {
    printOnlyKotlinFiles()
}

fun printOnlyKotlinFiles() {
    File(".").walkTopDown()
            .filter { it.isFile && it.name.endsWith(".kt") }
            .forEach { println(it) }
}

fun printEverythingTopDown() {
    File(".").walkTopDown().forEach { println(it) }
}