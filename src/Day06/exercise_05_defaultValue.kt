package Day06

class User(
    var name: String,
    var age: Int = 18,
    var city: String = "nagpur"
) {
    fun display() {
        println("Name: $name, Age: $age, City: $city")
    }
}

fun main() {
    val user1 = User("Lokesh")
    user1.display()
    val user2 = User("Aditya", 24, "pune")
    user2.display()
}