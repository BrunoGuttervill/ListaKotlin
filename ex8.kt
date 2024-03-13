// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário. 

class Employee(var name: String, var age: Int, var salary: Double)

fun richestEmployee(employeeList: List<Employee>): Employee? {
    if (employeeList.isEmpty()) {
        return null
    }
    
    var richest = employeeList[0]
    for (employee in employeeList) {
        if (employee.salary > richest.salary) {
            richest = employee
        }
    }
    return richest
}

fun main() {
    val employees = listOf(
        Employee("John", 30, 2500.0),
        Employee("Mary", 35, 3000.0),
        Employee("Peter", 28, 2800.0),
        Employee("Anna", 40, 3200.0)
    )
    
    val richestEmployee = richestEmployee(employees)
    
    if (richestEmployee != null) {
        println("The employee with the highest salary is: ${richestEmployee.name}, with a salary of ${richestEmployee.salary}")
    } else {
        println("There are no employees in the list.")
    }
}
