package udemy.l7_62_collections_functions


fun main(args: Array<String>) {
    val strs = listOf("winter","spring","summer","fall")
    val colorList = listOf("black","white","red")

    println(strs.last())

    println(strs.getOrNull(4)) // should be null, but no out of bounds exception

    //zip function - you get a list of pairs.  If they are not the same size, then the orphans drop off
    val zip: List<Pair<String, String>> = strs.zip(colorList)
    println(zip) //[(winter, black), (spring, white), (summer, red)]

    // + operator with lists
    val combined = strs + colorList
    println(combined) //[winter, spring, summer, fall, black, white, red]

    val seasonsWithDups = listOf("winter","spring","summer","fall", "summer")
    val colorsWithDups = listOf("black","white","red", "red","black")

    val noDups = seasonsWithDups.union(colorsWithDups)
    println(noDups) //[winter, spring, summer, fall, black, white, red]

    // individual de-dupe with distinct
    println(seasonsWithDups.distinct())
}