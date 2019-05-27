package KotlinProgramming.samplePrograms

import java.util.*

//Convert Set to Array

fun main(args: Array<String>) {

    val set = HashSet<String>()
    set.add("a")
    set.add("b")
    set.add("c")

    val array = arrayOfNulls<String>(set.size)
    set.toArray(array)

    println("Array: ${Arrays.toString(array)}")

}