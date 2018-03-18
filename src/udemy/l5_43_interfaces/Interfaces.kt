package udemy.l5_43_interfaces


fun main(args: Array<String>) {

    val f = Foo()
    println(f.myInt)
    println(f.otherInt)
}

class Foo : MySubInterface {
    override val myInt: Int
        get() = 42

    override fun myFun(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun otherFun(i: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

// extendable by default
interface MyInterface {

    fun myFun(str:String):String

}

// extend the interface
interface MySubInterface : MyInterface {
    val myInt:Int
    val otherInt:Int
    get() {
        return myInt * 100
    }
    fun otherFun(i:Int):String
}