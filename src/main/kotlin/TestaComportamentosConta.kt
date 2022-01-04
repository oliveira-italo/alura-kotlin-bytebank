fun testaComportamentos() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1001) // usando construtor secundário
    val contaFran = ContaPoupanca(titular = "Fran", numero = 1002) // usando construtor primário

    contaAlex.deposita(10.0)
    contaAlex.sacar(200.5)
    
    if (contaAlex.transfere(contaFran, 200.00)) {
        println("sucesso")
    } else {
        println("erro")
    }
}
