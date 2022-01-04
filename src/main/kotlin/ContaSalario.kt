class ContaSalario(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero) {

    override fun sacar(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }
}