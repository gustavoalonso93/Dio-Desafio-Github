package one.digitalinnovation.collection

fun main() {

    val joao  = Funcionario(nome = "joao", salario = 1000.0 , tipo = "clt")
    val pedro = Funcionario(nome = "pedro", salario = 3500.0 , tipo = "pj")
    val maria = Funcionario(nome = "maria", salario = 2000.0, tipo = "clt")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach{println(it)}

    println("---------------")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("---------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("---------------")
    val funSet = mutableSetOf(joao)
    funSet.forEach{println(it)}

    funSet.add(maria)
    funSet.add(pedro)
    funSet.forEach{println(it)}
    println("<><><><<><><><")
    funSet.remove(maria)
    funSet.forEach{println(it)}
}