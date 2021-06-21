fun main() {
    println("Hello ByteBank")
    val titular = "Armando"
    val numero = "12345678"
    var saldo = 0.0
    saldo += 102

    when {
        saldo <= 0 -> println("Seja bem vind $titular o numero de sua conta eh $numero e seu saldo atual eh de $saldo")
        saldo < 100 -> println("Seu saldo eh menor que 100")
        else -> println("Seu saldo eh maior que 100")
    }

}