package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(nome = "joao", salario = 1000.0, tipo = "clt")
    val pedro = Funcionario(nome = "pedro", salario = 3500.0, tipo = "pj")
    val maria = Funcionario(nome = "maria", salario = 2000.0, tipo = "clt")

    val funcionarios = listOf(joao,pedro,maria)

    val teste1 = setOf(joao,maria)
    val teste2 = setOf(pedro)

    val conjunto = teste1.union(teste2)
    conjunto.forEach { println(it) }

    println("----------------")

    val teste3 = setOf(joao,pedro,maria)
    val conjunto2 = teste3.subtract(teste2)
    conjunto2.forEach { println(it) }

    println("----------------")
    val intersect = teste3.intersect(teste2)
    intersect.forEach { println(it) }

}