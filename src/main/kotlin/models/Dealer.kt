package models

interface Dealer {

    fun negotiateNewProject(name: String, investment: Double, productOwner: Dealer, employees: HashSet<Employee> = HashSet()): Project

}