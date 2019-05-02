package Practice

// Ternary Operations

fun main(args: Array<String>) {

    demo6()

}

fun demo6() {

    val x = 10
    val text = if (x > 5)
        "x > 5"
    else "x <= 5"
    val message: String? = null
    print(message ?: text)

}