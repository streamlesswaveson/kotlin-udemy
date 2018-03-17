package udemy.l5_36_member_visibility

fun main(args: Array<String>) {
    var e2 = EmployeeV2("Valentine", false)
    println(e2.fullTime)
    e2.fullTime = true

}


class Employee(val firstName: String, var fullTime:Boolean = true) {
    //when you need more control over the default getters/setters you cannot use the auto-generate getter/setter feature here
}

class EmployeeV2(val firstName: String, fullTime:Boolean = true) {
    // the get()/set(value)
    var fullTime = fullTime
    get() {
        println("Running custom get")
        // i.e. 'fullTime' - this get() must be immediately after the property declaration
        return field
    }
    set(value) {
        println("Running custom set")
        field = value
    }
}
