fun testaAutenticacao() {
    val gerente: Autenticavel = Gerente(
        nome = "Fran",
        cpf = "111.222.333-44",
        salario = 1000.0,
        senha = "12345"
    )

    val diretor: Autenticavel = Diretor(
        nome = "Alex",
        cpf = "111.222.333-55",
        salario = 1000.0,
        senha = "56789",
        plr = 200.0
    )

    val cliente: Autenticavel = Cliente(
        nome = "Eu",
        cpf = "111.111.111-99",
        senha = "abcde"
    )

    SistemaInterno().entra(diretor, "56789")
    SistemaInterno().entra(gerente, "54321")
    SistemaInterno().entra(cliente, "abcde")


}