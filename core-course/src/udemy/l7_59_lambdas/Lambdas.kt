package udemy.l7_59_lambdas


fun main(args: Array<String>) {

    // using the the 'run' keyword
    run {println("I'm in a lambda")}

    val employees = listOf(Employee("Jim","Jones",1984),
            Employee("Jackie","Chan", 2001),
            Employee("Margaret", "Thatcher", 1987))

    // you can forget the parens in a function call requiring a lambda if it's the last parameter
    println(employees.minBy { e -> e.startYear })

    // you can specify the argument, if required
    println(employees.minBy { e :Employee -> e.startYear })

    // because the compiler can infer the argument's type and there is only one arg
    println(employees.minBy { it.startYear })

    // this works too
    println(employees.minBy(Employee::startYear))


    run(::topLevel)
}

fun topLevel() = println("I'm in a lambda")

fun useParameter(employees:List<Employee>, num:Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear:Int)