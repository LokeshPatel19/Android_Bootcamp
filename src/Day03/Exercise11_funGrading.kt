package Day03


fun getGrade(marks: Int): String {
    return when {
        marks >= 90 -> "A"
        marks >= 75 -> "B"
        marks >= 60 -> "C"
        marks >= 40 -> "D"
        else -> "Fail"
    }
}


fun main() {
    println(getGrade(78))
    println(getGrade(68))
}