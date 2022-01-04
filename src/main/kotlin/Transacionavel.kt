interface Transacionavel {
    fun transfere(destino: Conta, valor: Double): Boolean
}