// 12. Utilize um mapa para representar um dicionário de palavras e suas traduções.

fun main() {
    val dictionary = mapOf(
        "hello" to "olá",
        "apple" to "maçã",
        "dog" to "cão",
        "cat" to "gato",
        "house" to "casa"
    )

    // Exibindo algumas traduções
    println("Tradução de 'hello': ${dictionary["hello"]}")
    println("Tradução de 'dog': ${dictionary["dog"]}")
    println("Tradução de 'house': ${dictionary["house"]}")
}
