package KotlinProgramming

fun main(args: Array<String>) {



    var personObj = Person()
    personObj.name = "Avinash"
    personObj.display()
    println("Name is ${personObj.name}")

}

class Person {

    var name : String = ""

    fun display() {

        println("The name of the person is $name")

    }

}
