package udemy.l3_17_vardeclaration


fun main(args: Array<String>) {

    // val - equivalent to final variables in java
    // val cannot be reassigned

    // using type inference
    val number = 25

    // or explicit
    val answer :Int = 42

    // var
    var myvar = 35

    // can be reassigned
    myvar = 832

    var jan = Employee("Jan Smith", 400)
    jan.name = "Jan Jones"

    // can't do this - because it was 'val'
    //jan.id = 30
}

class Employee(var name: String, val id: Int){

}