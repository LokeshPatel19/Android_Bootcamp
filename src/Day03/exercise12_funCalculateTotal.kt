package Day03

fun calculateTotal(price: Double, quantity: Int): Double {
    return price * quantity
}

fun main() {
    println(calculateTotal(123.8,5))
    print(calculateTotal(100.0,3))
}