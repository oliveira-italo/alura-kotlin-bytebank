class SistemaInterno {
    fun entra(autenticavel: Autenticavel, senha: String) {
        if (autenticavel.autentica(senha)) {
            println("entrou")
        } else {
            println("não entoru")
        }
    }
}