fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX

    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    var contaJoao = ContaPoupanca(titular = "João", numero = 1003)
    var contaMaria = ContaPoupanca(numero = 1004, titular = "Maria")
    contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular joao ${contaJoao.titular}")
    println("titular maria ${contaMaria.titular}")
}