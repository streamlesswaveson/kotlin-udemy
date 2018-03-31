package udemy.l5_50_challenge

fun main(args: Array<String>) {
    var b1 = CBicycle(cadence = 10, speed = 10)
    b1.printDescription()

    var mb1 = CMountainBike("orange", 10,10,10,10)
}

// challenge - convert the equivalent java files to kotlin
open class CBicycle(var cadence:Int, var gear:Int = 10, var speed:Int) {

    fun applyBrake(decrement:Int) {
        speed -= decrement
    }

    fun speedUp(increment:Int) {
        speed += increment
    }

    fun printDescription() {
        println("""Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed""")
    }
}

class CMountainBike(var seatHeight :Int, cadence: Int, gear: Int, speed: Int): CBicycle(cadence, gear, speed) {

    var color: String = "blue"
    constructor(mycolor:String, seatHeight: Int, cadence: Int, gear: Int, speed: Int): this(seatHeight, cadence, gear, speed) {
        color = mycolor
        println("Color is $color")
        availableColors().forEach( {println(it)})
    }

    companion object {
        fun availableColors() :List<String> {
            return arrayListOf("blue","green","black")
        }
    }

}

class CRoadBike(val tireWidth :Int, cadence: Int, gear: Int, speed: Int):CBicycle(cadence, gear, speed) {

}