package udemy.l7_72_usesite_variance

fun main(args: Array<String>) {

    var cars1 = mutableListOf<Car>(Car(), Car())
    var cars2 = mutableListOf<Car>()

    copyCars(cars1,cars2)

    var fords1= mutableListOf<Ford>(Ford(), Ford())
    var fords2= mutableListOf<Ford>()

    copyCars(fords1, fords2)

//    copyCars(fords1, cars2)
}

open class Car {

}

fun <T>copyCars(l1:MutableList<T>, l2:MutableList<T>) {
    for (car in l1) {
        l2.add(car)
    }

}
class Ford:Car(){}
class Toyota:Car(){}
