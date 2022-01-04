/**
 * palavra chave open dá a possibilidade de herança (classe) e sobrescrita (método)
 */
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override fun autentica(senha: String): Boolean = senha == this.senha
}