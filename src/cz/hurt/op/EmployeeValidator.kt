package cz.hurt.op

class EmployeeValidator {
    fun validate(employee: Employee) {
        if (employee.rc != null && employee.rc!!.isNotEmpty()) {
            println("emp1 has name: " + employee.sayFullName())
        }
    }
}