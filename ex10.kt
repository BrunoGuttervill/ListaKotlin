// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula e retorna a área do triângulo.

class Triangle(var height: Double, var base: Double) {
    fun area(): Double {
        return (base * height) / 2
    }
}

fun main() {
    val triangle = Triangle(5.0, 4.0)
    println("Area of the triangle: ${triangle.area()}")
}
