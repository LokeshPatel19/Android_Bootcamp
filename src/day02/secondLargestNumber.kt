package day02

fun findSecondLargest(numbers: IntArray): Int? {
    if (numbers.size < 2) return null

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in numbers) {
        if (num > largest) {
            secondLargest = largest
            largest = num
        } else if (num > secondLargest && num != largest) {
            secondLargest = num
        }
    }

    return if (secondLargest == Int.MIN_VALUE) null else secondLargest
}

fun main() {
    val array = intArrayOf(12, 35, 1, 10, 34, 1)
    val result = findSecondLargest(array)
    println("Second largest element: ${result ?: "Does not exist"}")
}
