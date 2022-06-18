package one.digitalinnnovation.digionebank.teste

import one.digitalinnnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

   val banco2 = digiOneBank.copy(nome = "Segundo Banco")

    println(banco2.nome)
    println(banco2.numero)
}