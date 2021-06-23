package manualtests

import models.Developer
import models.Employee
import models.ProductOwner
import models.ProjectManager
import services.BonusCalc

fun testInheritance() {

    val employee1: Employee = Developer("Armando", "11111111111", 4500.00)
    val employee2: Employee = ProductOwner("Ana", "21111111111", 10000.00)
    val employee3: Employee = ProjectManager("Claudia", "31111111111", 7000.00)
    val employees = listOf<Employee>(employee1, employee2, employee3)

    val bonusCalc: BonusCalc = BonusCalc()
    bonusCalc.registerEmployeePayment(employees)

    println("Salários + Bonus do mês: ${bonusCalc.total}")

}