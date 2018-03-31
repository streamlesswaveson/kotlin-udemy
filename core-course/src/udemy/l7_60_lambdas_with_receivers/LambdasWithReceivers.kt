package udemy.l7_60_lambdas_with_receivers


fun main(args: Array<String>) {
    val employees = listOf(Employee("Jim", "Jones", 1984),
            Employee("Jackie", "Chan", 2001),
            Employee("Margaret", "Thatcher", 1987))

    println(countTo100V4())

    findByLastName(employees, "Chan")
    findByLastName(employees, "Blair")

    // this version does not return from the lambda
    findByLastNameV3(employees, "Chan")

    // more fun with labels
    "Some string".apply outerString@{
        "Another string".apply {
            println(toLowerCase())
            println(this@outerString.toUpperCase())
        }
    }
}

fun findByLastName(employees:List<Employee>, lastName:String) {
    for (e in employees) {
        if (e.lastName == lastName) {
            println("found ${lastName}")
            return
        }
    }
    println("No employee with $lastName")
}

fun findByLastNameV2(employees:List<Employee>, lastName:String) {
    employees.forEach {
        if (it.lastName == lastName) {
            println("found ${lastName}")
            // note - it's returning from the lambda AND the function
            // this is a 'non-local return'
            return
        }
    }
    println("No employee with $lastName")
}

fun findByLastNameV3(employees:List<Employee>, lastName:String) {
    employees.forEach localReturn@ {
        if (it.lastName == lastName) {
            println("found ${lastName}")
            // note - it's returning from the lambda AND the function
            // this is a 'non-local return'
            return@localReturn
        }
    }
    println("No employee with $lastName")
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (n in 1..99) {
        numbers.append(n)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

// equivalent function using 'with' idiom
fun countTo100V2(): String {
    val numbers = StringBuilder()
    // 'with' converts 'numbers' into the receiver object for this lambda
    return with(numbers) {
        for (n in 1..99) {
            append(n)
            append(", ")
        }
        append(100)
        toString()
    }
}

// converted into an expression body
fun countTo100V3() =
        with(StringBuilder()) {
            for (n in 1..99) {
                append(n)
                append(", ")
            }
            append(100)
            toString()
        }

// not using 'with' but 'apply'
fun countTo100V4() =
        StringBuilder().apply {
            for (n in 1..99) {
                append(n)
                append(", ")
            }
            append(100)
        }.toString()


data class Employee(val firstName: String, val lastName: String, val startYear: Int)