package one.digitalinnnovation.digionebank

class Cliente(name: String,
              cpf: String,
              val clienteTipo: ClienteTipo,
              val senha: String
):Pessoa(name,cpf), Logavel {
    override fun login(): Boolean = "123123" == senha

    override fun toString(): String = """ 
        Nome:    $name
        cpf:     $cpf
        Tipo:    ${clienteTipo.descricao}
    """.trimIndent()
    }
