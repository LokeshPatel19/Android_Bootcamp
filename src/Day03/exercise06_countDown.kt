package Day03

fun main() {
    println("Enter the count down :")
    var count = readln().toInt()

    while (count >= 1) {
        println(count)
        count--
    }
    print("Blast off!")
}