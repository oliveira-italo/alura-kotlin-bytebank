class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero), Transacionavel {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
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