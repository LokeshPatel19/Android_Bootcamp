package day01

fun main() {
    println("Enter the product price :")
    val productPrice = readln().toDouble()

    println("Enter the quantity :")
    val quantity = readln().toInt()

    println("Enter the discount :")
    val discount = readln().toDouble()

    val total = productPrice * quantity

    println("Product total : $total")
    println("Discount : $discount")
    println("Final amount: ${total - discount}")

}