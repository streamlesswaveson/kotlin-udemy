package udemy.l7_71_contravariance


fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) {
            println("I'm pruning a ${flower.name}")
        }
    }

    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) {
            println("I'm pruning a rose")
        }
    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)

    roseGarden.tendFlower(0)

    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) {
            println("I'm pruning a daffodil")
        }
    }
    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(0)

}

class Garden<T:Flower>(val flowers:List<T>, val flowerCare:FlowerCare<T>) {
    fun pickFlower(i:Int) = flowers[i]
    fun tendFlower(i:Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name:String) {

}

class Rose:Flower("rose") {

}

class Daffodil:Flower("daffodil") {

}

// use the 'in' keyword for contravariance
// accept T or its superclasses
// i.e. accept Flower (superclass of Rose and Daffodil)
interface FlowerCare<in T> {
    fun prune(flower:T)
//    fun pick():T // can't do - T is in the 'in' position
}