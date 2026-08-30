package Day04

fun getLength(text: String?): Int {
    return text?.length ?: 0
}

fun main() {
    println(getLength(null))
    println(getLength("Hello"))
    print(getLength("Kotlin"))
}