package Day06

class Detail {
    val name = "Lokesh"
    var salary = 556.9

    fun display() {
        println("Name: $name\nSalary: $salary")
    }
}

fun main() {
    val detail1 = Detail()
    detail1.display()
    val detail2 = Detail()
    detail2.salary = 890.8
    detail2.display()
}