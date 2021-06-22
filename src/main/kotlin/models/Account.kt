package models

class Account(val holder: String, val number: Long, amount: Double = 0.0) {

    var amount = amount
        private set

    fun deposit(value: Double) {
        amount += value
    }

    fun withDraw(value: Double): Boolean {
        if (value <= amount) {
            amount -= value
            return true
        }

        return false
    }

    fun transferTo(account: Account, value: Double): Boolean {
        if (withDraw(value)) {
            account.deposit(value)
            return true
        }

        return false
    }

    override fun toString(): String {
        return "Account(holder='$holder', number=$number, amount=$amount)"
    }


}