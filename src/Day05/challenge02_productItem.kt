package Day05

data class Product(
    val name: String,
    val price: Double
)

fun main() {
    val products = listOf(
        Product("Phone", 30000.0),
        Product("Laptop", 70000.0),
        Product("Mouse", 1000.0),
        Product("Keyboard", 2500.0),
        Product("Monitor", 15000.0)
    )

    val costLessThan20000 = products.filter {
        it.price < 20000
    }
    println(costLessThan20000)

    val nameProductCostLessThan20000 = costLessThan20000.map { it.name }
    println(nameProductCostLessThan20000)

    val costGreaterThan20000 = products.filter {
        it.price > 20000
    }
    println(costGreaterThan20000.sortedBy { it.price })

    val expensiveProduct = products.maxOf { product -> product.price }
    println(expensiveProduct)

    var sum = 0.0
    products.forEach {
        sum += it.price
    }
    println(sum)
}