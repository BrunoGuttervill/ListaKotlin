
// 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda. A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado. Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão. Use a função de ordem superior para realizar essas operações com diferentes pares de números.

fun performMathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val sum: (Int, Int) -> Int = { a, b -> a + b }

val subtract: (Int, Int) -> Int = { a, b -> a - b }

val multiply: (Int, Int) -> Int = { a, b -> a * b }

val divide: (Int, Int) -> Int = { a, b -> a / b }

fun main() {
    val number1 = 100
    val number2 = 50

    println("Sum: ${performMathOperation(number1, number2, sum)}")
    println("Subtraction: ${performMathOperation(number1, number2, subtract)}")
    println("Multiplication: ${performMathOperation(number1, number2, multiply)}")
    println("Division: ${performMathOperation(number1, number2, divide)}")
}
