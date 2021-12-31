fun main() {
//    var -> valor pode ser modificado
//    val -> valor não pode ser modificado
    var titular2: String = "Alex 2" // declaração do tipo da variável explícita

    loop@ for (i in 1 until 10 step 2) { // range de números crescentes com incremento
//    for (i in 10 downTo 1 step 2) { // range de números decrescentes com decremento

        val titular = "Alex $i" // declaração do tipo da variável implícita
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        testaSaldoComWhen(saldo)

        println()

        if (i == 4) break@loop
//        @loop label para indicar em qual loop deve ser feito o break. Útil para sair de loops aninhados

//        testaSaldo(saldo)
//        testaSaldoComIf(saldo)
    }

    whileShit()
    doWhileShit()
}

private fun doWhileShit() {
    var i = 0
    do {
        i++
        println("doWhile shit $i")
    } while (i < 5)
}

private fun whileShit() {
    var i = 0
    while (i < 5) {
        i++
        println("While shit $i")
    }
}

private fun testaSaldoComWhen(saldo: Double) {
    //    estrutura do when para mais de uma condição sem chaves, pode haver chaves
    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")
    }
}

private fun testaSaldoComIf(saldo: Double) {
    //    estrutura do if sem chaves
    if (saldo > 0.0) println("conta positiva") else if (saldo == 0.0) println("conta zerada") else println("conta negativa")
}

private fun testaSaldo(saldo: Double) {
    //    estrutura do if com chaves
    if (saldo > 0.0) {
        println("conta positiva")
    } else if (saldo == 0.0) {
        println("conta zerada")
    } else {
        println("conta negativa")
    }
}