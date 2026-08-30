package Day03

fun greet(name: String = "Guest") {
    println("Name: $name")
}

fun main() {
    greet()
    greet("Lokesh")
}