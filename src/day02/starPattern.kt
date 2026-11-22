package day02

fun printStarPattern(rows: Int) {
    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

fun main() {
    printStarPattern(5)
}
