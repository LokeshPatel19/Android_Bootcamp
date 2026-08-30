package Day03

fun main() {

    println("Enter the number :")
    val number = readln().toInt()
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}