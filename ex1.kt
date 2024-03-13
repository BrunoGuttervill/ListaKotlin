// 1. Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário. 
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val num = 6
    println(isEven(num))
}
