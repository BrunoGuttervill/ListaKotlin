// 11. Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra "A", em ordem alfabética.

fun stringsStartingWithA(list: List<String>): List<String> {
    val stringsWithA = list.filter { it.startsWith("A", ignoreCase = true) }
    return stringsWithA.sorted()
}

fun main() {
    val listOfStrings = listOf("Abacaxi", "Maçã", "Amora", "Banana", "laranja", "Abóbora")

    val sortedStringsStartingWithA = stringsStartingWithA(listOfStrings)

    println("Strings starting with the letter 'A' in alphabetical order:")
    sortedStringsStartingWithA.forEach { println(it) }
}
