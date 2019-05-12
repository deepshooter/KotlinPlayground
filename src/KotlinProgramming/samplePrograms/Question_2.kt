package KotlinProgramming.samplePrograms

//Check whether an alphabet is vowel or consonant using when statement

fun main(args: Array<String>) {

    val ch = 'z'

    when(ch) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}