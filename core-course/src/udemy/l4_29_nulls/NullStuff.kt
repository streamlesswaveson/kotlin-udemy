package udemy.l4_29_nulls


fun main(args: Array<String>) {

//    val str : String = null // can't do this!
    //but...
    val str : String? = null // yup - now a nullable type
//    str.toUpperCase() // but now this doesn't work, unless...
    if (str != null) {
        str.toUpperCase()
    }
    // the above can be shortened to...
    println("What happens here? ${str?.toUpperCase()}") // just get 'null' ... but no npe

    // the elvis operator ?:

    val str2 :String = str ?: "hey this is a string"

    // safe casting operator as?
    val arr = arrayOf(1,2,3,4)

    // returns null ... doesn't cast the int array into a string (resulting in a class cast exception)
    println(arr as? String)


    // the non null assertion operator !!
    val strAgain :String? = "not null"
    val str3 = strAgain!!.toUpperCase() // creates the non-nullable version
    val str4 = str3.toUpperCase()
}