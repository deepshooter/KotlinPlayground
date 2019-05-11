package KotlinProgramming.samplePrograms

//Check whether an alphabet is vowel or consonant using if..else statement

fun main(args: Array<String>) {

    val ch = 'i'

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"

    println("$ch is $vowelConsonant")

}