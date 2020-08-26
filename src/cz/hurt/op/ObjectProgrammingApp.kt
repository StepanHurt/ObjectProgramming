package cz.hurt.op

fun main() {

    val employees = listOf<Employee>(
        Employee(name = "Petr", surname = "Vocas", rc = "871120/5682"),
        Employee(name = "Petr", surname = "Vocas"),
        Employee(name = "Dan", surname = "Hlavacek"),
        Employee(name = "Karel", surname = "Novak")
    )

    val employeeValidator = EmployeeValidator()
    for (employee in employees) {
        employeeValidator.validate(employee)
    }
}