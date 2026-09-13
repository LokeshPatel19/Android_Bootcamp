package Day05

fun main() {

    val names: List<String?> = listOf(
        "Lokesh",
        null,
        "Rahul",
        null,
        "Amit"
    )

    // filterNotNull() automatically removes nulls and changes the type to List<String>
    val nullFilter = names.filterNotNull()

    print(nullFilter)
}