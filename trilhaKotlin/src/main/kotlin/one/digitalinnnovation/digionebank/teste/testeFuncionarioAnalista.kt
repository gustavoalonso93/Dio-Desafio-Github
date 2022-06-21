package one.digitalinnnovation.digionebank.teste

import one.digitalinnnovation.digionebank.Analista
import one.digitalinnnovation.digionebank.Funcionario
import one.digitalinnnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){

    val joao = Analista(name = "Joao", cpf = "123.123.123-11", 2000.0)
    imprimeRelatorio(joao)


}
fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())