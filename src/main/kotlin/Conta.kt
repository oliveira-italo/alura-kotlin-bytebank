abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    abstract fun sacar(valor: Double)

    fun deposita(valor: Double) {
        if (valor > 0.0) {
            println("Depositando $valor na conta $numero")
            this.saldo += valor
            println("Novo saldo: $saldo")
        }
    }

//    fun transfere(destino: Conta, valor: Double): Boolean {
//        if (saldo >= valor) {
//            sacar(valor)
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }
}