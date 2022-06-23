package one.digitalinnovation.collection

fun main(){
    val joao  = Funcionario(nome = "joao", salario = 1000.0 , tipo = "clt")
    val pedro = Funcionario(nome = "pedro", salario = 3500.0 , tipo = "pj")
    val maria = Funcionario(nome = "maria", salario = 2000.0, tipo = "clt")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach{
        println(it)
    }

    println("---------------")
    println(funcionarios.find { it.nome == "maria" })

    println("----tipo----------")
    funcionarios
        .groupBy { it.tipo }
        .forEach{println(it)}


}
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