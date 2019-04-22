//Verify if value is null

fun main(args: Array<String>) {

    demo3()
}

fun demo3() {

    val text = "Hello World !"

    text?.let {
        val length = text.length
        println(length)
    }

    // or simply

    val length = text?.length
    println(length)

}