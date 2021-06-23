package services

import models.Employee

class BonusCalc {

    var total: Double = 0.0
        private set

    fun registerEmployeePayment(employee: Employee) {
        this.total += employee.salary + employee.bonus
    }

    fun registerEmployeePayment(employees: List<Employee>) {
        employees.forEach { this.total += it.salary + it.bonus }
    }

}