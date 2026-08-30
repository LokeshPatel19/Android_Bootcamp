package Day03

fun createProfile(
    name: String,
    age: Int,
    city: String
) {
    println("Name :- $name\nAge :- $age\nCity :- $city")
}

fun main() {
    createProfile(
        city = "Pune",
        name = "Lokesh",
        age = 25
    )
}