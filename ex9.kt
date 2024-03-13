// 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente, sem usar o método de ordenação da linguagem.

fun sortList(list: List<Int>): List<Int> {
    val sortedList = mutableListOf<Int>()

    for (number in list) {
        var inserted = false
        for (i in sortedList.indices) {
            if (number <= sortedList[i]) {
                sortedList.add(i, number)
                inserted = true
                break
            }
        }
        if (!inserted) {
            sortedList.add(number)
        }
    }

    return sortedList
}

fun main() {
    val unsortedList = listOf(3, 1, 5, 2, 4, 4, 5)
    val sortedList = sortList(unsortedList)
    
    println("Unsorted list: $unsortedList")
    println("Sorted list: $sortedList")
}
