package Day05

fun main() {
    val marks = listOf(85, 92, 67, 45, 91, 73, 88)

    println(marks.maxOrNull())
    println(marks.minOrNull())
    println(marks.average())

    val greaterThan75 = marks.filter {
        it >= 75
    }
    println(greaterThan75)

    val everyonePassed = marks.all {
        it >= 40
    }
    println(everyonePassed)
}