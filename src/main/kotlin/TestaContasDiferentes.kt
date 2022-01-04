private fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo poupança: ${contaPoupanca.saldo} | Saldo corrente: ${contaCorrente.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Após saque")
    println("Saldo poupança: ${contaPoupanca.saldo} | Saldo corrente: ${contaCorrente.saldo}")

    contaCorrente.transfere(destino = contaPoupanca, valor = 100.0)

    println("Após transferencia")
    println("Saldo poupança: ${contaPoupanca.saldo} | Saldo corrente: ${contaCorrente.saldo}")

    contaPoupanca.transfere(destino = contaCorrente, valor = 100.0)
}
