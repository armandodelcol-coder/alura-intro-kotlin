package manualtests

import models.Account
import kotlin.math.roundToInt

fun testingClasses() {
    val listOfNames = listOf<String>("Armando", "Ana", "Maria", "Joao", "Manuela")
    val listOfAccounts = ArrayList<Account>()
    var incrementNumber = 1
    for (name in listOfNames) {
        println("Criando conta para $name")
        val randomAmount = (Math.random() * 100.0).roundToInt()
        val account = Account(holder = name, number = incrementNumber.toLong(), amount = randomAmount.toDouble())
        listOfAccounts.add(account)
        incrementNumber++
    }
    for (account in listOfAccounts) {
        println(account)
    }

    println("**************")

    val account1 = listOfAccounts[0]
    val account2 = listOfAccounts[1]
    account1.deposit(10.0)
    val tryTransfer = (Math.random() * 100.0).roundToInt()
    println(account1.holder + " possui um saldo de " + account1.amount)
    println(account2.holder + " possui um saldo de " + account2.amount)
    println("Tentando transferir $tryTransfer reais de ${account1.holder} para ${account2.holder}")
    if (account1.transferTo(account = account2, value = tryTransfer.toDouble())) {
        println("Transferiu com sucesso")
    } else {
        println("Saldo insuficiente")
    }
    println("E agora...")
    println(account1.holder + " possui um saldo de " + account1.amount)
    println(account2.holder + " possui um saldo de " + account2.amount)
}