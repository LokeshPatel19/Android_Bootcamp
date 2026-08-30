package Day04

fun findUser(id: Int): String? {
    return when (id) {
        1 -> "Lokesh"
        2 -> "Rahul"
        else -> null
    }
}

fun main() {
    val user = findUser(3)

    println("Welcome ${user ?: "Guest"}")
}