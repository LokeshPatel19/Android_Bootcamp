package Day05

fun main() {
    val names = mutableListOf("Lokesh", "Rahul")

    names.add("Amit")
    names.remove("Rahul")
    names[0] = "Lokesh Kumar"
    print(names)
}