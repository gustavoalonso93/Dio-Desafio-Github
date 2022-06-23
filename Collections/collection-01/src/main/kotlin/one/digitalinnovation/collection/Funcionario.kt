package one.digitalinnovation.collection

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String
){
    override fun toString(): String =
        """
            nome:    $nome
            salario: $salario
        """.trimIndent()

}