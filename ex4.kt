// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente). 

fun isPalindrome(inputString: String): Boolean {
    val string = inputString.toLowerCase()
    val length = string.length
    for (i in 0 until length / 2) {
        if (string[i] != string[length - i - 1]) {
            return false
        }
    }
    return true
}

fun main() {
    val inputString = "Renner"
    println(isPalindrome(inputString))
}