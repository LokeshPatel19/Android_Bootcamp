package Day04

fun main() {
    var name: String? = null

    var displayName = name ?: "Guest"
    println(displayName)

    name = "Lokesh"

    displayName = name ?: "Guest"
    println(displayName)
}