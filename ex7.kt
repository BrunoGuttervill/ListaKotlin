// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista. 

fun longestString(list: List<String>): String? {
    if (list.isEmpty()) return null
    
    var longest = list[0]
    for (string in list) {
        if (string.length > longest.length) {
            longest = string
        }
    }
    return longest
}

fun main() {
    val listOfStrings = listOf("cat", "dog", "elephant", "hippopotamus")
    val longest = longestString(listOfStrings)
    println("The longest string in the list is: $longest")
}
