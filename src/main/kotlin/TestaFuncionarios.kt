fun testaFuncionarios() {
    val funcionario = Analista(
        nome = "Alex",
        cpf = "000.111.222-33",
        salario = 1000.0
    )

    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salário: ${funcionario.salario}")
    println("Bonificação: ${funcionario.bonificacao}")


    val gerente = Gerente(
        nome = "Alex",
        cpf = "222.222.222-22",
        salario = 1000.0,
        senha = "1234"
    )

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao}")

    val diretor = Diretor(
        nome = "Alex",
        cpf = "333.333.333-33",
        salario = 1000.0,
        senha = "1234",
        plr = 200.0
    )

    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("Bonificação: ${diretor.bonificacao}")

    val analista: Funcionario = Analista(
        nome = "Alex",
        cpf = "444.444.444-44",
        salario = 1000.0
    )

    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("Bonificação: ${diretor.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    calculadora.registra(analista)

    println("total bonificação: ${calculadora.total}")

}
