package udemy.l3_20_equality

fun main(args: Array<String>) {
    // lesson - you don't have to use the .equals method

    val e1 = Employee("Mary",1)
    val e2 = Employee("Johanne",2)
    val e3 = Employee("Johanne",2)

    println(e1 == e2)
    println(e2 == e3) // java would return false - kotlin returns true.  the == operator returns structural equality (not referential)
    println(e1.equals(e2))
    println(e2.equals(e3))

    // referential equality uses the === triple equals
    println(e1 === e2)
    println(e2 === e3)
    val e4 = e1
    println(e1 === e4)

}

class Employee(var name:String, val id:Int){

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return other.id == id && other.name == name
        }
        return false
    }
}