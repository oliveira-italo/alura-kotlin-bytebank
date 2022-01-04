class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero), Transacionavel {
    
    override fun sacar(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    override fun transfere(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            sacar(valor)
            destino.deposita(valor)
            return true
        }
        return false
    }
}