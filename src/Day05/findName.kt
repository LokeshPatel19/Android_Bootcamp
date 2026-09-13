package Day05

fun main() {
    val names = listOf("Lokesh", "Rahul", "Amit", "Priya")

    print(names.find { it.length > 5 })
}