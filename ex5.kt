// 5. Implemente uma função lambda que retorne o maior valor entre dois números.

val getMaxValue = { a: Int, b: Int -> if (a > b) a else b }

fun main() {
    val num1 = 5
    val num2 = 10
    
    println(getMaxValue(num1, num2))
}
