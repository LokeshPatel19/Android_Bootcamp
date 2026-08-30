package Day04

fun main() {
    var age: Int? = null
    var displayAge = age ?: "Unknown"
    println(displayAge)

    age = 24
    displayAge = age
    print(displayAge)
}