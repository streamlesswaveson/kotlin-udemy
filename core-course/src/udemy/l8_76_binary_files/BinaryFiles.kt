package udemy.l8_76_binary_files

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream


fun main(args: Array<String>) {

    readingABinaryFile()
}

fun readingABinaryFile() {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {

    }
}