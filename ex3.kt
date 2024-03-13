// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome". 

class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Miguel", 12),
        Person("Bruno", 20),
        Person("Gabriel", 23)
    )
    
    val sortedPeople = people.sortedBy { it.name }
    
    for (person in sortedPeople) {
        println("Name: ${person.name}, Age: ${person.age}")
    }
}
