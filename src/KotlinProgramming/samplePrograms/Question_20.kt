package KotlinProgramming.samplePrograms

//Convert Array to list

import java.util.*

fun main(args: Array<String>) {

    val array = arrayOf("a", "b")
    val list = Arrays.asList(*array)

    println(list)

}