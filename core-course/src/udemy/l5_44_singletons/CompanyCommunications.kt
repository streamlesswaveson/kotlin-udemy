package udemy.l5_44_singletons

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getCopyrightLine())
    println(CompanyCommunications.getTagline())
}

object CompanyCommunications {
    var currentYear = Year.now().value

    fun getTagline() = "Hey now"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear. Blah blah blah"
}