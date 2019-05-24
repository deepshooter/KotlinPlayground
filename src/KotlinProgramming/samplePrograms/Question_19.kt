package KotlinProgramming.samplePrograms

import java.util.*

// Convert list to array

fun main(args: Array<String>) {

    val list = ArrayList<String>()
    list.add("a")
    list.add("b")

    val array = arrayOfNulls<String>(list.size)
    list.toArray(array)

    println(Arrays.toString(array))

}