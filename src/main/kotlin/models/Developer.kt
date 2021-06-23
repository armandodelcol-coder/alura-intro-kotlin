package models

class Developer(
    name: String,
    document: String,
    salary: Double
): Employee(name, document, salary) {

    override val bonus: Double
        get() = salary * 0.15

}