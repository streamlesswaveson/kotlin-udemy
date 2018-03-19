package udemy.l5_46_anonymous_objects

fun main(args: Array<String>) {
    var mutableInt = 45
    // the object created here is not a singleton - it's used and then discarded
    handle(object: MyInterface {
        override fun doSomething(num: Int): String {
            mutableInt++
            return "doing something ${num * 100}"
        }
    })
    println(mutableInt)
}

interface MyInterface {
    fun doSomething(num:Int):String
}

fun handle(i:MyInterface) {
    println("Handling my interface : ${i.doSomething(22)}")
}