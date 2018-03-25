package udemy.l7_70_covariance


fun main(args: Array<String>) {

}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower

// Rose extends Flower
class Rose : Flower() {

}

// the the 'out' keyword to make it covariant
// you can only read covariant instances
// out in relation to what?
// 'out' - an 'out' position is a return type
// 'in' - an 'in' is a function parameter
// this only refers to member functions
class Garden<out T:Flower>(val something:T) { // can't use 'var' because that would generate a setter - the 'in' position

    val flowers:List<T> = listOf()

    fun pickFlower(i:Int) :T = flowers[i]

    // this won't work because T is in the 'in' position
    // Even though we have a rose garden, this would allow incoming Daisies, say.
//    fun plantFlower(flower:T) {
//
//    }

    // can override the error by using the @UnsafeVariance annotation
    fun hasFlower(f: @UnsafeVariance T) {

    }
}