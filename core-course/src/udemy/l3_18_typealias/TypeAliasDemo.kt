package udemy.l3_18_typealias


// typealias introduced in 1.2
typealias BazingaSet = HashSet<Bazinga>

fun main(args: Array<String>) {
    var bs:BazingaSet

    bs = BazingaSet()
    bs.add(Bazinga("blah"))

}


class Bazinga(val thing: String) {}