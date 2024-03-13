// 2. Crie uma função que receba um array de inteiros e retorne o maior número. 
fun findLargest(numberArray: Array<Int>): Int {
    var largest = numberArray[0]
    
    for (number in numberArray) {
        if (number > largest) {
            largest = number
        }
    }
    return largest
}

fun main() {
    val numbers = arrayOf(6, 5, 6, 8, 4, 2, 25, 10, 25)
    println(findLargest(numbers))
}
