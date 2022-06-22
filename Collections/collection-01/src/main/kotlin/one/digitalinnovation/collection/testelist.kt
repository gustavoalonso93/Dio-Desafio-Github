package one.digitalinnovation.collection

fun main(){
    val joao  = Funcionario(nome = "joao", salario = 1000.0 )
    val pedro = Funcionario(nome = "pedro", salario = 3500.0 )
    val maria = Funcionario(nome = "maria", salario = 2000.0)

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach{
        println(it)
    }

    println("---------------")
    println(funcionarios.find { it.nome == "maria" })


}
data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            nome:    $nome
            salario: $salario
        """.trimIndent()

}