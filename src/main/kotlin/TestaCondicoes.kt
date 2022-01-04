fun testaSaldoComWhen(saldo: Double) {
    //    estrutura do when para mais de uma condição sem chaves, pode haver chaves
    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")
    }
}

fun testaSaldoComIf(saldo: Double) {
    //    estrutura do if sem chaves
    if (saldo > 0.0) println("conta positiva") else if (saldo == 0.0) println("conta zerada") else println("conta negativa")
}

fun testaSaldo(saldo: Double) {
    //    estrutura do if com chaves
    if (saldo > 0.0) {
        println("conta positiva")
    } else if (saldo == 0.0) {
        println("conta zerada")
    } else {
        println("conta negativa")
    }
}
