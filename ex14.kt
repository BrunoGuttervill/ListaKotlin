//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo. A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas). Em seguida, use essa função para verificar se algumas palavras são palíndromos.

fun String.isPalindrome(): Boolean {
    val cleanText = this.toLowerCase().replace("\\s".toRegex(), "")
    return cleanText == cleanText.reversed()
}

fun main() {
    val word1 = "socorram me subi no onibus em marrocos"
    val word2 = "arara"
    val word3 = "cachorro"

    println("Is \"$word1\" a palindrome? ${word1.isPalindrome()}")
    println("Is \"$word2\" a palindrome? ${word2.isPalindrome()}")
    println("Is \"$word3\" a palindrome? ${word3.isPalindrome()}")
}

