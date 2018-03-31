package udemy.l6_54_ifstatement


fun main(args: Array<String>) {

    // need both branches if 'if' used as an expression

    val someCondition = true
    val paradise = arrayOf("cheeseburger")

    val result = if (someCondition) {
        println("it's true")
        24
    } else {
        println("not true")
        83
    }

    println(result)

    val otherResult = if (!someCondition) 34 else 909
    println(otherResult)

    val foo = if(!someCondition) {
        24
    } else if ("cheeseburger" in paradise) {
        40
    } else {
        90
    }
    println("A pirate looks at $foo")
}