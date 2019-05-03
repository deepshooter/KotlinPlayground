package KotlinProgramming


/*
 *
 * This is the main function.Entry point of the application
 *
 */


fun main(args: Array<String>) {

    println("Hello World !")
    println("Hello Kotlin !")
    println(10 - 5)
    println(10 / 9)

    varDemo()
    valDemo()

}

fun varDemo() {

    var myString = "Hello...." //Mutable String
    var myNumber = 10
    var myDecimal = 1.0

    var myOtherString: String
    myOtherString = "Hello Again.."

    println(myString)
    println(myNumber)
    println(myDecimal)
    println(myOtherString)

}


fun valDemo() {
    val myTestString = "My Constant String !" //Immutable String
    println(myTestString)
}


//This is inline comment

/*
 * This is comment line 1
 * This is comment line 2
 *
 */
