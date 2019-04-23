//New line in string

fun main(args: Array<String>) {

    demo5()
}

fun demo5() {

    val text = """
              |First Line
              |Second Line
              |Third Line
               """.trimMargin()

    print(text)

}