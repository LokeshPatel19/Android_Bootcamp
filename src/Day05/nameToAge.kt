package Day05

fun main() {
    // Create the map with names and ages
    val ageMap = mapOf(
        "Lokesh" to 25,
        "Rahul" to 24,
        "Amit" to 26
    )

    // Print Lokesh's age
    println("Lokesh's age: ${ageMap["Lokesh"]}")

    // Print Rahul's age
    println("Rahul's age: ${ageMap["Rahul"]}")

    // Try to retrieve "Priya", providing "Unknown" if she doesn't exist
    val priyaAge = ageMap["Priya"] ?: "Unknown"
    println("Priya's age: $priyaAge")
}
