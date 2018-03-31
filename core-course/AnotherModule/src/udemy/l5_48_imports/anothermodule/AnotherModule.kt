package udemy.l5_48_imports.anothermodule

import udemy.l5_39_extensionfunctions.spam
import udemy.l5_44_singletons.CompanyCommunications as Comm
import udemy.l5_47_enums.Department.IT
import udemy.l5_48_imports.somethingelse.topLevelFun


fun main(args: Array<String>) {
    println(topLevelFun("importing top level fun!"))
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println("aaa".spam())
}