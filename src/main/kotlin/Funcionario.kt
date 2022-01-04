/**
 * palavra chave open dá a possibilidade de herança (classe) e sobrescrita (método)
 */
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double

}