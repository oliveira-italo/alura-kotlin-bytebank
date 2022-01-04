private fun testaLacos() {
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
//            testaSaldoComWhen(saldo)

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
