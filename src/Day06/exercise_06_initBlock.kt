package Day06

class Product(
    var name: String,
    var price: Double
) {
    init {
        require(price > 0) {
            "Price must be greater than zero"
        }
    }

    fun display() {
        println("Name: $name\nPrice: $price")
    }
}

fun main() {
    val product1 = Product("Lokesh", 789.0)
    product1.display()

    try {
        val product2 = Product("Laptop", -305.8)
        product2.display()
    } catch (exception: IllegalArgumentException) {
        println("Invalid product: ${exception.message}")
    }
}