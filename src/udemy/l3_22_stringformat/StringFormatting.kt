package udemy.l3_22_stringformat

fun main(args: Array<String>) {

    println(Cat("Mr. Bigglesworth", 30))

    val change = 4.22
    println("Print \$change = $change ")


    // evaluating an expression
    val num = 34.345
    val denom = 23.54
    println("result = ${num/denom}")

    // printing an attribute
    println("My cat's name is ${Cat("Jorge",3).name}")

}

class Cat(var name:String, var age:Int) {

    override fun toString(): String {
        return "Cat(name='$name', age=$age)"
    }
}