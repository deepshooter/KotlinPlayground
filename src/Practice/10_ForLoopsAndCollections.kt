package Practice

fun main(args: Array<String>) {

    demo10()

}


fun demo10() {

    val listOfNumber = listOf(1, 2, 3, 4)
    val keyValueMap = mapOf(
        1 to "Android",
        2 to "Java",
        3 to "Kotlin"
    )

    for (i in 1..10) {
    }
    for (i in 1 until 10) {
    }
    for (i in 10 downTo 0) {
    }
    for (i in 1..10 step 2) {
    }
    for (i in 10 downTo 0 step 2) {
    }
    for (item in listOfNumber) {
        println(item)
    }
    for ((key, value) in keyValueMap) {
        println("$key and $value")
    }

}