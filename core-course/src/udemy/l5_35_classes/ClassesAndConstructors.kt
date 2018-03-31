package udemy.l5_35_classes

fun main(args: Array<String>) {
    val e1 = EmployeeV1("Ender")
    println(e1.firstName)
}

// this is the primary constructor
class EmployeeV1 constructor(firstName :String) {

    val firstName :String

    // this is NOT a constructor, but are used in conjunction with the primary constructor
    init {
        this.firstName = firstName
    }
}

// this is equivalent to the above
class EmployeeV2 constructor(firstName :String) {
    val firstName :String = firstName
}

// this is also equivalent (note the addition of 'val')
// this assumes 'public constructor'
class EmployeeV3 (val firstName :String) {}


// if you want to change visibility, the 'constructor' keyword is required
class ProtectedEmployee protected constructor(val firstName: String)

class Employeev4(val firstName:String) {
    var fullTime :Boolean = false
    //this secondary constructor must delegate to the primary constructor the firstName property (this(firstName))
    // also, secondary constructors do not declare properties for us - only the primary - so val/var does not work
    constructor(firstName: String, bln: Boolean): this(firstName) {
        this.fullTime = bln
    }
}

// this also works - setting a default fullTime parameter in the constructor
class EmployeeV5(val firstName:String, var fullTime:Boolean = true)