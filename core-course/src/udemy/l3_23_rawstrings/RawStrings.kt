package udemy.l3_23_rawstrings


fun main(args: Array<String>) {

    var what = "bricks"

    // triple quoted strings
    // kind of like a heredoc
    var text = """ Whose woods these are I think I know
        His house is in the village though;
        He will not see me stopping here
        To watch his woods fill up with $what.
        """

    println(text)

    // using the trimMargin feature - trims all the way up to and including the marginPrefix
    var text2 = """Whose woods these are I think I know
        *His house is in the village though;
        *He will not see me stopping here
        *To watch his woods fill up with $what.
        """.trimMargin("*")

    println(text2)
}