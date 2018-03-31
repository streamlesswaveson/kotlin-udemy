package udemy.l5_47_enums


fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDeptInfo())
}

enum class Department(val fullName:String, val numEmployees: Int) {
    HR("Human Resources", 2),
    IT("IT", 4),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 10);

    fun getDeptInfo():String {
        return "the $fullName department has $numEmployees employees"
    }
}