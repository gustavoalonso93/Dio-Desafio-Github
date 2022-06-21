package one.digitalinnnovation.digionebank.teste

import one.digitalinnnovation.digionebank.Cliente
import one.digitalinnnovation.digionebank.ClienteTipo

fun main() {
    val jose= Cliente(
        name = "Jose",
        cpf = "123.123.123-11",
        clienteTipo = ClienteTipo.PF,
        senha = "123456",

    )
    println(jose)

    testeAutenticacao().Autentica(jose)
}