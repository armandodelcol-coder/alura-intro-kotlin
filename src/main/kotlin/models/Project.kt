package models

class Project(
    val name: String,
    val investment: Double,
    val productOwner: Dealer,
    employees: HashSet<Employee> = HashSet<Employee>()
) {
    var employees: HashSet<Employee> = employees
        private set

    fun addEmployees(employees: HashSet<Employee>) {
        employees.forEach {
            this.employees.add(it)
        }
    }

}
