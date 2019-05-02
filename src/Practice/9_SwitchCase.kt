package Practice

fun main(args: Array<String>) {

    demo9()

}

fun demo9() {

    var score = 7

    var grade = when (score) {
        9, 10 -> "Excellent"
        in 6..8 -> "Good"
        4, 5 -> "OK"
        in 1..3 -> "Fail"
        else -> "Fail"
    }

    print(grade)


}