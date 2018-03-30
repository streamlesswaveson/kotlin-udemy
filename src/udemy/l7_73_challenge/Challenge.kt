package udemy.l7_73_challenge


fun main(args: Array<String>) {

    val joe = Person("Joe","Jones", 43)
    val jane = Person("Jane","Ogilthorpe", 12)
    val mary = Person("Mary","Mayhew", 83)
    val john = Person("John","Morty", 34)
    val jean = Person("Jean","Smith", 3)

    val map = listOf(joe, jane, mary, john, jean).map { it.lastName to it }.toMap()

    println(map.values.stream().filter({it.lastName.startsWith("S")}).count())

    println(map.values.map { it -> Pair(it.firstName, it.lastName) })

    map.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val list1 = listOf(1,4,9,15,33)
    val list2 = listOf(4,55,-83,15,22,101)

    val intersect = HashSet(list1).intersect(HashSet(list2))
    println(intersect)

    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

class Person(val firstName:String, val lastName:String, val age:Int) {

    operator fun component1()= firstName
    operator fun component2()= lastName
    operator fun component3() = age

    override fun toString(): String {
        return "first=$firstName last=$lastName age=$age"
    }
}

class Box<out T>

open class Paper

class Regular:Paper()

class Premium:Paper()