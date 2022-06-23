package one.digitalinnovation.collection

fun main(){
    val joao  = Funcionario(nome = "joao", salario = 1000.0 , tipo = "clt")
    val pedro = Funcionario(nome = "pedro", salario = 3500.0 , tipo = "pj")
    val maria = Funcionario(nome = "maria", salario = 2000.0, tipo = "clt")

    val repo = Repositorio<Funcionario>()
    repo.create(joao.nome,joao)
    repo.create(maria.nome,maria)
    repo.create(pedro.nome,pedro)

    println(repo.frindById(joao.nome))

    println("-----------------")

    repo.findAll().forEach{println(it)}

    println("-----------------------")
    repo.remove(maria.nome)
    repo.findAll().forEach{println(it)}


}