package models

class ProductOwner(
    name: String,
    document: String,
    salary: Double
): Employee(name, document, salary), Dealer {

    override val bonus: Double
        get() = 0.0

    override fun negotiateNewProject(
        name: String,
        investment: Double,
        productOwner: Dealer,
        employees: HashSet<Employee>
    ): Project {
        return Project(
            name,
            investment,
            productOwner,
            employees
        )
    }

}