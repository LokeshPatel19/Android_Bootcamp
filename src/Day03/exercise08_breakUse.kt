package Day03

fun main() {
    println("Enter the number :")
    val number = readln().toInt()

    for (i in 1..number) {
        if (i == 7) {
            break
        }
        println(i)
    }
}