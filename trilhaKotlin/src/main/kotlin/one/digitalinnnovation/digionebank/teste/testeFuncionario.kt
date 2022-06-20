package one.digitalinnnovation.digionebank.teste

import one.digitalinnnovation.digionebank.Funcionario
import one.digitalinnnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val Gustavo = Pessoa(name = "Gustavo Alonso", cpf = "123.123.123-11")
    println(Gustavo.name)
    println(Gustavo.cpf)

    val joao = Funcionario(name = "Gustavo Alonso", cpf = "123.123.123-11", BigDecimal.valueOf( 2000.0))
    println(joao.name)
    println(joao.cpf)
    println(joao.salario)
}