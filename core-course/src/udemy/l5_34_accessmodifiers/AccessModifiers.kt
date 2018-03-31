package udemy.l5_34_accessmodifiers


fun main(args: Array<String>) {

    val e1 = Employee("Bonzo")

}

// visible to everything in THIS file
private class Employee(var name :String) {

    override fun toString(): String {
        return "I am ${name}"
    }
}