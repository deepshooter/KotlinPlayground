package KotlinProgramming.samplePrograms

//Convert char to String

fun main(args: Array<String>) {
    val ch = 'c'
    val st = Character.toString(ch)
    // Alternatively
    // st = String.valueOf(ch);

    println("The string is: $st")
}