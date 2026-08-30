package Day04

fun main() {
    val name: String? = "Lokesh"
    name?.let { userName ->
        println(userName.length)
    }
}