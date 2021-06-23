package manualtests

import models.*

fun testInterface() {

    val po: Dealer = ProductOwner("Armando", "123", 150000.0)
    val dev1: Employee = Developer("Ana", "321", 5000.0)
    val dev2: Employee = Developer("Claudia", "456", 4000.0)
    val pm: Employee = ProjectManager("Maria", "789", 10000.0)

    val project1: Project = po.negotiateNewProject(
        "Projeto X",
        investment = 130000.0,
        productOwner = po,
        employees = hashSetOf(dev1, dev2, pm)
    )

    println("Colaboradores alocados no ${project1.name}: ")
    project1.employees.forEach { println("${it.name} - cargo: ${it.javaClass.simpleName}") }

}